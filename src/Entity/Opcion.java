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
public class Opcion {
    
    private String text;
    private boolean isCorrect;
    private int id_pregunta;

    public Opcion(String text, boolean isCorrect, int id_pregunta) {
        this.text = text;
        this.isCorrect = isCorrect;
        this.id_pregunta = id_pregunta;
    }

 

    public String getText() {
        return text;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }
    
    
    
}
