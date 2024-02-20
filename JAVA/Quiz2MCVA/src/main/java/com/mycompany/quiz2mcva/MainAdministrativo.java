/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.quiz2mcva;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author celes
 */
public class MainAdministrativo {

    static Scanner entrada= new Scanner(System.in);
    static  ArrayList<Administrativo> lista= new ArrayList<>();
     static  ArrayList<Administrativo> listaLeida= new ArrayList<>();
    
    
    public static void main(String[] args) {
        
                int c= 3;
        
        do {        
            
            System.out.println("Ingresar \n 1.Ingresar Datos de Administrativo \n 2.Mostrar Datos de Administrativo \n 0.Salir");
            c=entrada.nextInt();
            
            switch (c) {
                
                case 1: 
                {
                IngresarDatos();
                }
                
                case 2:
                {
                MostrarDatos();
                }
                
                
            }
            
            
            
        } while (c!=0);

    }
    
    
    static public void  IngresarDatos(){
    
        System.out.println("Ingrese los Datos solicitados de Administrativos");
        Administrativo ad= new Administrativo();
        System.out.println("Por favor, Ingrese el Grado Academico:,Bachillerato, Licenciado, Master");
        ad.setGradoAcademico(entrada.next());
        System.out.println("Por favor, Ingrese la Cedula");
        ad.setCedula(entrada.next());
        System.out.println("Por favor, Ingrese el Nombre");
        ad.setNombre(entrada.next());
        System.out.println("Por favor, Ingrese el Primer Apellido");
        ad.setApellido1(entrada.next());
        System.out.println("Por favor, Ingrese el Segundo Apellido");
        ad.setApellido2(entrada.next());
        System.out.println("Por favor, Ingrese el Correo Electronico");
        ad.setCorreo(entrada.next());
        System.out.println("Por favor, Ingrese la Edad");
        ad.setEdad(entrada.nextInt());
        
        lista.add(ad);
        ContentAdminTxT.AnadirDatos(lista);
    
    }
    
    static public void   MostrarDatos(){
    
    CargarDatos();
    
    
    for(Administrativo administrativo : (ArrayList<Administrativo>) listaLeida){
        
        System.out.println("Grado Academico :"+administrativo.getGradoAcademico());
        System.out.println("Cedula :"+administrativo.getCedula());
        System.out.println("Nombre Completo : "+administrativo.getNombre()+" "+administrativo.getApellido1()+" "+administrativo.getApellido2());
        System.out.println("Correo :"+administrativo.getCorreo());
        System.out.println("Edad :"+administrativo.getEdad());
        System.out.println("Salario :"+administrativo.Informacion());
        System.out.println("\n\n\n");
    }
    
    
    }
    
    static public void CargarDatos(){
        
        listaLeida=ContentAdminTxT.LeerDatos();
        lista=listaLeida;
    }
    
    
}
