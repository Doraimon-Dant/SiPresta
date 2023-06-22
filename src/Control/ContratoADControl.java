/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.ContratoADDAO;
import Entidades.ContratoAD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ContratoADControl {
    private final ContratoADDAO DATOS;
    private ContratoAD obj;
    private DefaultTableModel modeloTabla;
    public int RegMost;

    public ContratoADControl() {
        this.DATOS = new ContratoADDAO();
        this.obj = new ContratoAD();
        this.RegMost = 0;
        
    }
     public DefaultTableModel listar (int id){
    List<ContratoAD> lista = new ArrayList();
        lista.addAll(DATOS.listarAD(id));
        
        String[] titulos = {"N° Contrato","Estatus","Nombre Cliente","Nombre Empleado","Ubicación"};
        this.modeloTabla = new DefaultTableModel(null,titulos);
        
        String estado;
        String[] registro = new String[5];
        this.RegMost=0;
        
        for(ContratoAD item:lista){
            estado = switch (item.getEstado()) {
            case 1 -> "Aprobado";
            case 2 -> "Denegado";
            default -> "Pendiente";
        };
            registro[0]=Integer.toString(item.getId());
            registro[1]=estado;
            registro[2]=item.getNombre_cliente();
            registro[3]=item.getNombre_empleado();
            registro[4]=item.getRuta();
            
            this.modeloTabla.addRow(registro);
            this.RegMost++;
        }
        return this.modeloTabla;
     }
     
     public String Validar (int Id){
        if(DATOS.Validar(Id)){
            return "OK";
        }else{
            return "No se pudo desactivar el registro";
        }
    }
    public String Denegar(int Id){
        if(DATOS.Denegar(Id)){
            return "OK";
        }else{
            return "No se pudo activar el registro";
        }
    }
    
}
