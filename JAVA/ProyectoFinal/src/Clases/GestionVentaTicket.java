/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celes
 */
public class GestionVentaTicket extends GestionViajes {
    
    private int CantidaTickets;

    public GestionVentaTicket(int CantidaTickets, String IDViaje, String PlacaBus, String CedulaChofer, String IDRuta, int Fecha, int Hora) {
        super(IDViaje, PlacaBus, CedulaChofer, IDRuta, Fecha, Hora);
        this.CantidaTickets = CantidaTickets;
        
    }

    public GestionVentaTicket() {
         this.CantidaTickets = 0;
    }

    public int getCantidaTickets() {
        return CantidaTickets;
    }

    public void setCantidaTickets(int CantidaTickets) {
        this.CantidaTickets = CantidaTickets;
    }
    

    
}
