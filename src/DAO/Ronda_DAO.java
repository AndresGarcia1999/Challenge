/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Ronda;
import java.sql.PreparedStatement;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Ronda_DAO {
    
    Connection_ con = new Connection_();

    public boolean saveRonda(Ronda ronda) {
        boolean result = true;
        String sql = "insert into ronda (num,id_jugador,ispassed,id_categoria) values(?,?,?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setInt(1,ronda.getNum());
            p.setInt(2,ronda.getId_jugador());
            p.setBoolean(3,ronda.isIsPassed());
            p.setInt(4,ronda.getId_categoria());
            
            p.execute();
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
}
