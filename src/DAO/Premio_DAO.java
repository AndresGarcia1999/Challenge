/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Premio;
import java.sql.PreparedStatement;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Premio_DAO {
    
    Connection_ con = new Connection_();

    public boolean savePremio(Premio premio) {
        boolean result = true;
        String sql = "insert into premio (cantidad,id_jugador) values(?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setInt(1, premio.getCantidad());
            p.setInt(2, premio.getId_jugador());
            p.execute();
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
}
