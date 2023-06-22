/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CHRISTOPHERURIELTAFO
 */
public class ContratoAD {
    private int id;
    private int estado;
    private String nombre_cliente;
    private String Nombre_empleado;
    private String Ruta;

    public ContratoAD() {
    }

    public ContratoAD(int id, int estado, String nombre_cliente, String Nombre_empleado,String Ruta) {
        this.id = id;
        this.estado = estado;
        this.nombre_cliente = nombre_cliente;
        this.Nombre_empleado = Nombre_empleado;
        this.Ruta = Ruta;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

   
    

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_empleado() {
        return Nombre_empleado;
    }

    public void setNombre_empleado(String Nombre_empleado) {
        this.Nombre_empleado = Nombre_empleado;
    }
    
}
