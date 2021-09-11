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

    public Ronda(int num, boolean isPassed) {
        this.num = num;
        this.isPassed = isPassed;
    }

    public int getNum() {
        return num;
    }

    public boolean isIsPassed() {
        return isPassed;
    }
    
}
