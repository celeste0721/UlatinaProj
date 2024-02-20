/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author tonyM
 */
public class Matriz {
static Scanner entrada = new Scanner(System.in);
    static int Ma1 [][];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//   
//        CrearMatriz();
//        
//        for (int i = 0; i < Ma1.length; i++)
//        {
//            for (int j = 0; j < Ma1[i].length; j++) 
//            {
//                System.out.println("ingrese el dato para el par ordenado"+(i)+"]["+(j)+"]");
//                Ma1[i][j] = entrada.nextInt();
//            
//            }
//            System.out.println("\n\n");
//        }
//        
//        for (int i = 0; i < Ma1.length; i++)
//        {
//            for (int j = 0; j < Ma1[i].length; j++) 
//            {
//                System.out.println("["+(i)+"]["+(j)+"]");
//                System.out.println(Ma1[i][j]);
//            }
//            System.out.println("\n\n");
//        }
//    }
//    
//    static public void CrearMatriz()
//    {
//        System.out.println("Ingrese la cantidad de filas");
//        Ma1 = new int [entrada.nextInt()][];
//        
//        for (int i = 0; i < Ma1.length; i++) 
//        {
//            System.out.println("Ingrese la cantidad de columnas para la fila ["+(i)+"]");
//            Ma1[i] = new int [entrada.nextInt()];
//        }
//        


//Primer ejericio sumatoria total de datos de una matriz regular numerica

            CrearMatriz();
            
            for (int i = 0; i < Ma1.length; i++)
            {
                for (int j = 0; j < Ma1[i].length; j++)
                {
                    System.out.println("Ingrese el dato para el par ["+i+"]{"+j+"]");
                    Ma1[i][j] = entrada.nextInt(); 
                    
                }
            }
            for (int i = 0; i < Ma1.length; i++)
            {
                for (int j = 0; j < Ma1[i].length; j++) 
                { 
                    System.out.println("["+i+"]{"+j+"]");
                    System.out.println(Ma1[i][j]);
                    
                }
                System.out.println("\n\n");
            }
            int suma =0;
            
            System.out.println("Sumatoria de todos los datos de la matriz");
              for (int i = 0; i < Ma1.length; i++)
            {
                for (int j = 0; j < Ma1[i].length; j++)
                { 
                   suma = suma + Ma1[i][j];
                    
                }
                System.out.println(suma);
            }
              
              
              
                 System.out.println("Sumatoria de la primer columna de cada fila");
              
                         int suma1 =0;
                 for (int i = 0; i < Ma1.length; i++)
            {
        
                for (int j = 0; j < Ma1[i].length; j++)
                { 
                    
                    if(j==0)
                    {
                          suma1 = suma1 + Ma1[i][j];
                    }
                  
                    
                }
                System.out.println(suma1);
            }
              
                 
                 
                 
                 
                 
              System.out.println("Sumar los numeros de la diagonal de la matriz 3X3");
              
                         int suma2 = 0;
                 for (int i = 0; i < Ma1.length; i++)
            {
                for (int j = 0; j < Ma1[i].length; j++)
                { 
                    
                   if(Ma1[0].length == Ma1.length)
                   {
                     if(i == j)
                    {
                        suma2 = suma2 + Ma1[i][j];
                    }
                   
                   }
                  
                  
               
                }
               if(suma2 != 0)
               {
                   System.out.println(suma2);
               }
            }
              
    
    }
    
    
        
    
    
    
    
    
    
      static public void CrearMatriz()
      {
      
      System.out.println("Ingrese la cantidad de filas");
      int fila = entrada.nextInt();
          System.out.println("Ingrese la cantidad d ecoljumnas");
        Ma1 = new int [fila][entrada.nextInt()];
      }
    
    
}
