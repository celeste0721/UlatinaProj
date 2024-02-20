/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celes
 */
public class GestionRutas {
    
    public String IDRuta;
    public String LugarSalida;
    public String LugarLlegada;
    public String Ruta;
    public  int TiempoEstimado;

    public GestionRutas(String IDRuta, String LugarSalida, String LugarLlegada, String Ruta, int TiempoEstimado) {
        this.IDRuta = IDRuta;
        this.LugarSalida = LugarSalida;
        this.LugarLlegada = LugarLlegada;
        this.Ruta = Ruta;
        this.TiempoEstimado = TiempoEstimado;
    }

    public GestionRutas() {
        this.IDRuta = "";
        this.LugarSalida = "";
        this.LugarLlegada = "";
        this.Ruta = "";
        this.TiempoEstimado = 0;
  
    }

    public String getIDRuta() {
        return IDRuta;
    }

    public void setIDRuta(String IDRuta) {
        this.IDRuta = IDRuta;
    }

    public String getLugarSalida() {
        return LugarSalida;
    }

    public void setLugarSalida(String LugarSalida) {
        this.LugarSalida = LugarSalida;
    }

    public String getLugarLlegada() {
        return LugarLlegada;
    }

    public void setLugarLlegada(String LugarLlegada) {
        this.LugarLlegada = LugarLlegada;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getTiempoEstimado() {
        return TiempoEstimado;
    }

    public void setTiempoEstimado(int TiempoEstimado) {
        this.TiempoEstimado = TiempoEstimado;
    }
    
  
    
    
    
    
    
    
   
}
