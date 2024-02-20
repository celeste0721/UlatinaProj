/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2mcva;

/**
 *
 * @author celes
 */
public class MecanicoGeneral extends Persona {
    
    private int anniosExperiencia;

    public MecanicoGeneral(int anniosExperiencia, String Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, int Edad) {
        super(Cedula, Nombre, Apellido1, Apellido2, Correo, Edad);
        this.anniosExperiencia = anniosExperiencia;
    }

    public MecanicoGeneral() {
        this.anniosExperiencia = 0;
    }
    
    

    public int getAnniosExperiencia() {
        return anniosExperiencia;
    }

    public void setAnniosExperiencia(int anniosExperiencia) {
        this.anniosExperiencia = anniosExperiencia;
    }



    
    
    @Override
    public String Informacion(){

        if (getAnniosExperiencia()<=2) {
            return "Informacion de principiante";
        } else if( getAnniosExperiencia()>2){
            return "Información con Experiencia";
        }
        return "Error de información";



}
    
    
    
    
    
    
    
    
}
