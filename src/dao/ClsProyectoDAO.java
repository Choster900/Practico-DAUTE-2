/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connectionBD.ClsConection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClsProyecto;

/**
 *
 * @author 16ado
 */
public class ClsProyectoDAO extends ClsConection {

    public ArrayList<ClsProyecto> readProyectos() {
        ArrayList<ClsProyecto> listaProyectos = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM PROYECTO";
            PreparedStatement pre = this.getConexion().prepareStatement(sql);
            ResultSet rs;

            rs = pre.executeQuery();

            while (rs.next()) {
                ClsProyecto p = new ClsProyecto()    ;
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getNString(2));
                
                listaProyectos.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.getMessage());

        } finally {
            this.desconectar();
        }
        return listaProyectos;
    }
}
