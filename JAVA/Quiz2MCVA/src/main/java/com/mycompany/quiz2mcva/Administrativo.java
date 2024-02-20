/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2mcva;

/**
 *
 * @author celes
 */
public class Administrativo extends Persona {
    
    private String GradoAcademico;

    public Administrativo(String GradoAcademico, String Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, int Edad) {
        super(Cedula, Nombre, Apellido1, Apellido2, Correo, Edad);
        this.GradoAcademico = GradoAcademico;
    }



    public Administrativo() {
        this.GradoAcademico = "";
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }



    
    
    
    
    

    
    @Override
    public String Informacion(){

        String Bachillerato="";
        String Licenciado="";
        String Master="";
        
        if(GradoAcademico.equals("Bachillerato")){
            return "El salario es bajo";
        }else if(GradoAcademico.equals("Licenciado")){
            return "El salario es medio";
        }else if(GradoAcademico.equals("Master")){
            return "El salario es alto";
        
        }
        return "Error en los datos";
        
    }

    
    
    
    


    
    
    
    
    
    
    
}
