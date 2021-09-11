/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Opcion;
import java.sql.PreparedStatement;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Opcion_DAO {
    
    Connection_ con = new Connection_();
    
    public boolean saveOpcion(Opcion opcion) {
        boolean result = true;
        String sql = "insert into opciones (texto,iscorrect,id_pregunta) values(?,?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setString(1, opcion.getText());
            p.setBoolean(2, opcion.isIsCorrect());
            p.setInt(3, opcion.getId_pregunta());
            p.execute();
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    

    
}
