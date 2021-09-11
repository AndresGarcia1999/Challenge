/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Opcion;
import Entity.Pregunta;
import java.sql.PreparedStatement;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Pregunta_DAO {
    
    Connection_ con = new Connection_();
    
    public boolean savePregunta(Pregunta pregunta) {
        boolean result = true;
        String sql = "insert into pregunta (id,enunciado,id_categoria) values(?,?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setInt(1, pregunta.getId());
            p.setString(2,pregunta.getEnunciado());
            p.setInt(3, pregunta.getId_categoria());
            p.execute();
            
            Opcion_DAO odao = new Opcion_DAO();
            
            for (Opcion opcion : pregunta.getOpciones()) {
                
                odao.saveOpcion(opcion);
                
            }
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
}
