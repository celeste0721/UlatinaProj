/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celes
 */
public class GestionChoferes {
    
   /**
    * @param Cedula
    * Esta variable tipo String guardará el # de cedula
    */
    public String Cedula;
    
    public String Nombre;
    
    public String Apellido1;
    
    public String Apellido2;
    
    public int Numtelefono;
    
    public int anniosExperiencia;
    

    public GestionChoferes(String Cedula, String Nombre, String Apellido1, String Apellido2, int Numtelefono, int anniosExperiencia) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Numtelefono = Numtelefono;
        this.anniosExperiencia = anniosExperiencia;
    }
    
    public GestionChoferes(){
        this.Cedula = "";
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.Numtelefono = 0;
        this.anniosExperiencia = 0;

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

    public int getNumtelefono() {
        return Numtelefono;
    }

    public void setNumtelefono(int Numtelefono) {
        this.Numtelefono = Numtelefono;
    }

    public int getAnniosExperiencia() {
        return anniosExperiencia;
    }

    public void setAnniosExperiencia(int anniosExperiencia) {
        this.anniosExperiencia = anniosExperiencia;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
