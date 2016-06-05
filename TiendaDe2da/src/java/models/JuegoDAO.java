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
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class JuegoDAO {
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;
    
    
    public void agregarJuego(Juego j)
    {

         try {
            conn = conexion.getConexion();
            String query = "INSERT INTO producto (nombre, detalle, precio, categoria, imagen, plataforma) values (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, j.getNombre());
            ps.setString(2, j.getDescripcion());
            ps.setString(3, j.getPrecio());
            ps.setInt(4, j.getCategoria());
            ps.setString(5, j.getImagen());
            ps.setInt(6, j.getPlataforma());
            ps.setInt(7, j.getId());
            ps.executeUpdate();
            //ps.executeUpdate(query);
                    
       
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
    }
    
    public ArrayList<Juego> obtenerProductos() {
        ArrayList<Juego> juegos = new ArrayList<Juego>();
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM producto";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            Blob img = null;

            while (rs.next()) {
                
                Juego juego = new Juego();
                
                juego.setId(rs.getInt("id"));
                juego.setNombre(rs.getString("nombre"));
                juego.setDescripcion(rs.getString("detalle"));
                juego.setPrecio(rs.getString("precio"));
                juego.setImagen(rs.getString("imagen"));
                juego.setCategoria(rs.getInt("categoria"));
                juego.setPlataforma(rs.getInt("plataforma"));
                
                juegos.add(juego);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return juegos;
    }

    public Juego obtenerJuego(int id) {
        return null;
    }
}
