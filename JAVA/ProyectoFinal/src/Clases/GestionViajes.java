/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celes
 */
public  class GestionViajes {
    
    protected String IDViaje;
    protected  String PlacaBus;
    protected String CedulaChofer;
    protected  String IDRuta;
    protected  int Fecha;
    protected  int Hora;

    public GestionViajes(String IDViaje, String PlacaBus, String CedulaChofer, String IDRuta, int Fecha, int Hora) {
        this.IDViaje = IDViaje;
        this.PlacaBus = PlacaBus;
        this.CedulaChofer = CedulaChofer;
        this.IDRuta = IDRuta;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public GestionViajes() {
        
        this.IDViaje = "";
        this.PlacaBus = "";
        this.CedulaChofer = "";
        this.IDRuta = "";
        this.Fecha = 0;
        this.Hora = 0;
        
        
    }

    public String getIDViaje() {
        return IDViaje;
    }

    public void setIDViaje(String IDViaje) {
        this.IDViaje = IDViaje;
    }

    public String getPlacaBus() {
        return PlacaBus;
    }

    public void setPlacaBus(String PlacaBus) {
        this.PlacaBus = PlacaBus;
    }

    public String getCedulaChofer() {
        return CedulaChofer;
    }

    public void setCedulaChofer(String CedulaChofer) {
        this.CedulaChofer = CedulaChofer;
    }

    public String getIDRuta() {
        return IDRuta;
    }

    public void setIDRuta(String IDRuta) {
        this.IDRuta = IDRuta;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }
    

    
    

    
}
