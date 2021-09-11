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
public class Opciones {
    
    private String text;
    private boolean isCorrect;

    public Opciones( String text, boolean isCorrect) {
      
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public String getText() {
        return text;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }
    
    
    
}
