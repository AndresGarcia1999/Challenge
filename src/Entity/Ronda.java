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
public class Ronda {
    
    private int num;
    private boolean isPassed;
    private int id_categoria;
    private int id_jugador;

    public Ronda(int num, boolean isPassed, int id_categoria, int id_jugador) {
        this.num = num;
        this.isPassed = isPassed;
        this.id_categoria = id_categoria;
        this.id_jugador = id_jugador;
    }

 

    public int getNum() {
        return num;
    }

    public boolean isIsPassed() {
        return isPassed;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setIsPassed(boolean isPassed) {
        this.isPassed = isPassed;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
}
