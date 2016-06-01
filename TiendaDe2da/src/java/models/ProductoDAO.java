/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP VPRO
 */
public class ProductoDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

    public void agregar(Producto p) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO producto (nombre, categoria, detalle) values (?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCategoria());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            conn = DB.getConexion();
            String query = "SELECT * FROM persona";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                productos.add(producto);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return productos;
    }

}
