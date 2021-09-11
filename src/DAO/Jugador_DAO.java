/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Jugador;
import java.sql.PreparedStatement;
import utilities.Connection_;

/**
 *
 * @author andre
 */
public class Jugador_DAO {
    
    Connection_ con = new Connection_();

    public boolean saveJugador(Jugador jugador) {
        boolean result = true;
        String sql = "insert into jugador (id,nombre) values(?,?)";
        try {
            PreparedStatement p = con.getCon().prepareStatement(sql);
            p.setInt(1, jugador.getId());
            p.setString(2, jugador.getNombre());
            p.execute();
            con.closeDB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }

    
}
