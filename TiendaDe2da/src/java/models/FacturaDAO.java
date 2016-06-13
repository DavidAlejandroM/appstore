/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db.DB;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP VPRO
 */
public class FacturaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

    public String agregarFactura(Factura f) {
        String res = null;
        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO factura (fecha, hora, idCliente, total) values (?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, f.getFecha());
            ps.setString(2, f.getHora());
            ps.setInt(3, f.getIdCliente());
            ps.setInt(4, f.getTotal());
            ps.executeUpdate();
            res = "yes";
            //ps.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return res;
    }

    public void agregarFacturaProducto(int idfac, int idpro) {
        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO factura_producto (idProducto, idFactura) values (?, ?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, idpro);
            ps.setInt(2, idfac );
            ps.executeUpdate();
            //ps.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }

    }

    public int obtenerUltimaFactura() {
        int id = 0;
        try {
            conn = conexion.getConexion();
            String query = "SELECT id FROM factura ORDER BY id DESC LIMIT 1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt("id");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return id;
    }

}
