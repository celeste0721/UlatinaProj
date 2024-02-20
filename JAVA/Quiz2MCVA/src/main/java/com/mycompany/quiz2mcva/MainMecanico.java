/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quiz2mcva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class MainMecanico {
    
    static Scanner entrada= new Scanner(System.in);
    static  ArrayList<MecanicoGeneral> lista= new ArrayList<>();
     static  ArrayList<MecanicoGeneral> listaLeida= new ArrayList<>();
    
    
    

    public static void main(String[] args) {

        
           int c= 3;
        
        do {        
            
            System.out.println("Ingresar \n 1.Ingresar Datos de Mecanico \n 2.Mostrar Datos de Mecanico \n 0.Salir");
            c=entrada.nextInt();
            
            switch (c) {
                
                case 1: 
                {
                IngresarDatosMec();
                }
                
                case 2:
                {
                MostrarDatosMec();
                }
                
                
            }
            
            
            
        } while (c!=0);

    }
    
    
    static public void  IngresarDatosMec(){
    
        
         System.out.println("Ingrese los Datos solicitados de Administrativos");
        MecanicoGeneral mec= new MecanicoGeneral();
        System.out.println("Por favor, Ingrese los años de Experiencia");
        mec.setAnniosExperiencia(entrada.nextInt());
        System.out.println("Por favor, Ingrese la Cedula");
        mec.setCedula(entrada.next());
        System.out.println("Por favor, Ingrese el Nombre");
        mec.setNombre(entrada.next());
        System.out.println("Por favor, Ingrese el Primer Apellido");
        mec.setApellido1(entrada.next());
        System.out.println("Por favor, Ingrese el Segundo Apellido");
        mec.setApellido2(entrada.next());
        System.out.println("Por favor, Ingrese el Correo Electronico");
        mec.setCorreo(entrada.next());
        System.out.println("Por favor, Ingrese la Edad");
        mec.setEdad(entrada.nextInt());
        
        lista.add(mec);
        ContentAdminTxT.AnadirDatos(lista);
    
    }
    
    static public void  MostrarDatosMec(){
    
        
            CargarDatos();
    
    
    for(MecanicoGeneral mecanicogeneral : (ArrayList<MecanicoGeneral>) listaLeida){
        
        System.out.println("Años de experiencia :"+mecanicogeneral.getAnniosExperiencia());
        System.out.println("Cedula :"+mecanicogeneral.getCedula());
        System.out.println("Nombre Completo : "+mecanicogeneral.getNombre()+" "+mecanicogeneral.getApellido1()+" "+mecanicogeneral.getApellido2());
        System.out.println("Correo :"+mecanicogeneral.getCorreo());
        System.out.println("Edad :"+mecanicogeneral.getEdad());
        System.out.println("Información :"+mecanicogeneral.Informacion());
        System.out.println("\n\n\n");
    }
        
        
        
        
    }
    
    
    static public void CargarDatos(){
    
        listaLeida=ContentMecanicoTxT.LeerDatosMec();
        lista=listaLeida;
    
    
    }
}
