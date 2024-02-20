/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2mcva;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class ContentMecanicoTxT {
    
     static String NameArchiving= "Mecanico.txt";
    
    public static void AnadirDatosMec(ArrayList lista){
        
         FileWriter filewriter= null;
         
         
         
        try {
            filewriter= new FileWriter(NameArchiving);
            BufferedWriter bufferedwriter= new BufferedWriter(filewriter);
            
            for(MecanicoGeneral mecanicogeneral : (ArrayList<MecanicoGeneral>) lista){
                
                bufferedwriter.write(String.valueOf(String.valueOf(mecanicogeneral.getAnniosExperiencia())+","+mecanicogeneral.getCedula()+","+mecanicogeneral.getNombre()+","+mecanicogeneral.getApellido1()+","+mecanicogeneral.getApellido2()+","+mecanicogeneral.getCorreo()+","+String.valueOf(mecanicogeneral.getEdad())+"\n"));

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
    
    public static ArrayList LeerDatosMec(){
    File file=new File(NameArchiving);
    ArrayList listaMecanico=new ArrayList();
    Scanner scanner;
    
    
        try {
            
            scanner=new Scanner(file);
            
            while (scanner.hasNextLine()) {
               String linea=scanner.nextLine();
                Scanner delimitar=new Scanner(linea);
                MecanicoGeneral Mec= new MecanicoGeneral();
                delimitar.useDelimiter("\\s*,\\s*");
                Mec.setAnniosExperiencia(Integer.parseInt(delimitar.next()));
                Mec.setCedula(String.valueOf(delimitar.next()));
                Mec.setNombre(String.valueOf(delimitar.next()));
                Mec.setApellido1(String.valueOf(delimitar.next()));
                Mec.setApellido2(String.valueOf(delimitar.next()));
                Mec.setCorreo(String.valueOf(delimitar.next()));
                Mec.setEdad(Integer.parseInt(delimitar.next()));
                
                listaMecanico.add(Mec);
 
            }
            
            scanner.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaMecanico;
    
    }
    
}
