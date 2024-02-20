/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2mcva;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class ContentAdminTxT {
    
    static String NameArchiving= "Administrativo.txt";
    
    
    public static void AnadirDatos(ArrayList lista){
    FileWriter filewriter= null;
    
        try {
            filewriter= new FileWriter(NameArchiving);
            BufferedWriter bufferedwriter= new BufferedWriter(filewriter);
            
            for(Administrativo administrativo : (ArrayList<Administrativo>) lista){
                
                bufferedwriter.write(String.valueOf(administrativo.getGradoAcademico()+","+administrativo.getCedula()+","+administrativo.getNombre()+","+administrativo.getApellido1()+","+administrativo.getApellido2()+","+administrativo.getCorreo()+","+String.valueOf(administrativo.getEdad())+"\n"));

            }
            bufferedwriter.close();
            System.out.println("Se realizaron los datos correctamente");
            
        } catch (Exception e) {
            System.out.println("Error al guardar los datos");
            
        } finally {
            
            if(filewriter!=null){
            
                try {
                    filewriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
            
            }
            
            
            
        }
    
    }
    
    public static ArrayList LeerDatos(){
    
    File file=new File(NameArchiving);
    ArrayList listaAdministrativo=new ArrayList();
    Scanner scanner;
    
    
        try {
            
            scanner=new Scanner(file);
            
            while (scanner.hasNextLine()) {
               String linea=scanner.nextLine();
                Scanner delimitar=new Scanner(linea);
                Administrativo ad= new Administrativo();
                delimitar.useDelimiter("\\s*,\\s*");
                ad.setGradoAcademico(String.valueOf(delimitar.next()));
                ad.setCedula(String.valueOf(delimitar.next()));
                ad.setNombre(String.valueOf(delimitar.next()));
                ad.setApellido1(String.valueOf(delimitar.next()));
                ad.setApellido2(String.valueOf(delimitar.next()));
                ad.setCorreo(String.valueOf(delimitar.next()));
                ad.setEdad(Integer.parseInt(delimitar.next()));
                
                listaAdministrativo.add(ad);
 
            }
            
            scanner.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaAdministrativo;
    
    
    }
    
    
    
    
    
    
}
