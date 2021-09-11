/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author andre
 */
public class Premio {
    
    private int cantidad;
    private int id_jugador;

    public Premio(int cantidad, int id_jugador) {
        this.cantidad = cantidad;
        this.id_jugador = id_jugador;
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public int getId_jugador() {
        return id_jugador;
    }
    
    
}
