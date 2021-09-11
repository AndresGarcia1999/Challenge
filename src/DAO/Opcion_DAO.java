/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Opcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    
        public ArrayList<Opcion> getOpciones(int id_pregunta) {
        ResultSet r = null;
        ArrayList<Opcion> data = new ArrayList<Opcion>();
        int cont= 1;
        
        try {
            String sql = "SELECT * FROM opciones WHERE id_pregunta=?";
            PreparedStatement p = con.getCon().prepareStatement(sql);
            
             p.setInt(1, id_pregunta);
             r = p.executeQuery();
             
             Opcion opc;
             while(r.next()){
                 
                 opc = new Opcion(r.getString("texto"),r.getBoolean("iscorrect"),r.getInt("id_pregunta"));
                 data.add(opc);
             
             }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
    

    
}
