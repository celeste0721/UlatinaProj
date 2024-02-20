/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celes
 */
public class GestionFlotilla {
    
    public String Placa;
    public int  CantidadPasajeros;
    public String  NombreBus;
    public int VidaUtil;

    public GestionFlotilla(String Placa, int CantidadPasajeros, String NombreBus, int VidaUtil) {
        this.Placa = Placa;
        this.CantidadPasajeros = CantidadPasajeros;
        this.NombreBus = NombreBus;
        this.VidaUtil = VidaUtil;
    }
    
    
    
    public GestionFlotilla(){
   
        this.Placa = "";
        this.CantidadPasajeros = 0;
        this.NombreBus = "";
        this.VidaUtil = 0;
    
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public String getNombreBus() {
        return NombreBus;
    }

    public void setNombreBus(String NombreBus) {
        this.NombreBus = NombreBus;
    }

    public int getVidaUtil() {
        return VidaUtil;
    }

    public void setVidaUtil(int VidaUtil) {
        this.VidaUtil = VidaUtil;
    }
    
    
    
    
    
    
    
    

    
}

