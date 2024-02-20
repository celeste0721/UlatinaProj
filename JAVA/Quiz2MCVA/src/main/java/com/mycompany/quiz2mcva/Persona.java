/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2mcva;

/**
 *
 * @author celes
 */
public abstract class Persona {
    
    private String Cedula;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Correo;
    private int Edad;

    public Persona(String Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, int Edad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Correo = Correo;
        this.Edad = Edad;
    }

    public Persona() {
        
        this.Cedula = "";
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.Correo = "";
        this.Edad = 0;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    
    public abstract String Informacion();
    
    
    
    
    
    
    
}
