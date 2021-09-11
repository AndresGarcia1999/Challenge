/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Categoria {
    
    private int id;
    private String dificultad;
    private ArrayList<Pregunta> preguntas;

    public Categoria(int id, String dificultad, ArrayList<Pregunta> preguntas) {
        this.id = id;
        this.dificultad = dificultad;
        this.preguntas = preguntas;
    }

    public int getId() {
        return id;
    }

    public String getDificultad() {
        return dificultad;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    
}
