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
import model.ClsCoordinador;
import model.ClsProyecto;

/**
 *
 * @author 16ado
 */
public class ClsCoordinadorDAO extends ClsConection {

    public void insertCoordinador(ClsCoordinador C) {
        try {
            this.conectar();
            String sql = "INSERT INTO COORDINADOR VALUES (?,?,?,?,?)";
            PreparedStatement pre = this.getConexion().prepareStatement(sql);
            pre.setInt(1, C.getCodigo());
            pre.setString(2, C.getNombre());
            pre.setInt(3, C.getEdad());
            pre.setDouble(4, C.getSueldo());
            pre.setInt(5, C.getCodigoProyecto());

            pre.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.getMessage());

        } finally {
            this.desconectar();
        }
    }

    public ArrayList<ClsCoordinador> readCoordinador() {
        ArrayList<ClsCoordinador> lista = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT \n"
                    + "    codigoCoordinador, E.NOMBRE, EDAD, sueldoBase, C.NOMBRE\n"
                    + "FROM\n"
                    + "    COORDINADOR E\n"
                    + "        INNER JOIN\n"
                    + "    PROYECTO C ON C.codigoProyecto = E.codigoProyecto";
            PreparedStatement pre = this.getConexion().prepareStatement(sql);
            ResultSet rs;

            rs = pre.executeQuery();

            while (rs.next()) {
                ClsCoordinador C = new ClsCoordinador();
                C.setCodigo(rs.getInt(1));
                C.setNombre(rs.getNString(2));
                C.setEdad(rs.getInt(3));
                C.setSueldo(rs.getDouble(4));
                C.setNombreProyecto(rs.getString(5));

                lista.add(C);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.getMessage());

        } finally {
            this.desconectar();
        }
        return lista;
    }

    public void updateCoordinador(ClsCoordinador C) {
        try {
            this.conectar();
            String sql = "UPDATE COORDINADOR SET NOMBRE=?,EDAD=?,SUELDOBASE=?,CODIGOPROYECTO=? WHERE CODIGOCOORDINADOR = ?";
            PreparedStatement pre = this.getConexion().prepareStatement(sql);
            
            
            pre.setString(1, C.getNombre());
            pre.setInt(2, C.getEdad());
            pre.setDouble(3, C.getSueldo());
            pre.setInt(4, C.getCodigoProyecto());
            
            pre.setInt(5, C.getCodigo());

            pre.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.getMessage());

        } finally {
            this.desconectar();
        }
    }

    public void deleteCoordinador(ClsCoordinador C) {
        try {
            this.conectar();
            String sql = "DELETE FROM COORDINADOR  WHERE CODIGOCOORDINADOR = ?";
            PreparedStatement pre = this.getConexion().prepareStatement(sql);

            pre.setInt(1, C.getCodigo());

            pre.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error: " + e.getMessage());

        } finally {
            this.desconectar();
        }
    }
}
