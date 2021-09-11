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
    private int id_categoria;
    private ArrayList<Opcion> opciones;

    public Pregunta(int id, String enunciado, int id_categoria, ArrayList<Opcion> opciones) {
        this.id = id;
        this.enunciado = enunciado;
        this.id_categoria = id_categoria;
        this.opciones = opciones;
    }

    

    public int getId() {
        return id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public int getId_categoria() {
        return id_categoria;
    }
    
    
    
}
