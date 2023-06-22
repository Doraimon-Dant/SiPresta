/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BD.Conexion;
import CRUD.CrudContratoAD;
import Entidades.ContratoAD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CHRISTOPHERURIELTAFO
 */
public class ContratoADDAO implements CrudContratoAD {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ContratoADDAO() {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List listarAD(int id) {
        List<ContratoAD>registros=new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("Select*from Contrato_AD where id like ?  ORDER by id asc; ");
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                registros.add(new ContratoAD(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Listar",JOptionPane.ERROR_MESSAGE);
        }finally{
            ps=null;
            rs=null;
            CON.desconectar();
        }
        return registros;
    }

    @Override
    public boolean Validar(int id) {
        resp=false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE contrato SET Estatus=1 WHERE Empleado_id=? ");
            ps.setInt(1, id);
            if(ps.executeUpdate()>0){
                resp=true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Desactivar",JOptionPane.ERROR_MESSAGE);
        }finally{
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean Denegar(int id) {
        resp=false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE contrato SET Estatus=2 WHERE Empleado_id=? ");
            ps.setInt(1, id);
            if(ps.executeUpdate()>0){
                resp=true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Desactivar",JOptionPane.ERROR_MESSAGE);
        }finally{
            CON.desconectar();
        }
        return resp;
    }
}
