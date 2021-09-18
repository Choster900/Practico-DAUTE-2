/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 16ado
 */
public class ClsCoordinador {
    private int codigo;
    private String nombre;
    private int edad;
    private double sueldo;
    private int codigoProyecto;
    private String nombreProyecto;

    public ClsCoordinador() {
    }

    public ClsCoordinador(int codigo, String nombre, int edad, double sueldo, int codigoProyecto, String nombreProyecto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.codigoProyecto = codigoProyecto;
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }
    
    
}
