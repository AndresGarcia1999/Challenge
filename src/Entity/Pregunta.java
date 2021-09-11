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
public class Pregunta {
    
    private int id;
    private String enunciado;
    private ArrayList<Opciones> opciones;

    public Pregunta(int id, String enunciado, ArrayList<Opciones> opciones) {
        this.id = id;
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public ArrayList<Opciones> getOpciones() {
        return opciones;
    }
    
}
