/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Categoria;
import Entity.Jugador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Categoria_DAO {
    
    Connection_ con = new Connection_();
    
    public boolean saveCategoria(Categoria categoria) {
        boolean result = true;
        String sql = "insert into categoria (id,dificultad) values(?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setInt(1, categoria.getId());
            p.setString(2, categoria.getDificultad());
            p.execute();
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
        public String getCategoriaDificultad(int id){
        ResultSet r=null;
        String result= null;
        try{
            String sql = "SELECT dificultad FROM categoria where id=?";
            PreparedStatement p= con.getCon().prepareStatement(sql);
            p.setInt(1, id);
            r= p.executeQuery();
            if(r.next()){
                    result = r.getString("dificultad");
            }
            con.closeDB();
        }catch(Exception e){
            System.out.println(e.getMessage());
            con.closeDB();
        }
        return result;
    }
    
    
    
}
