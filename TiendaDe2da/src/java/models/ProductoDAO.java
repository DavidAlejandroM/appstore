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
public class ProductoDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

   public void agregarJuego(Producto j)
    {

         try {
            conn = conexion.getConexion();
            String query = "INSERT INTO producto (nombre, detalle, precio, categoria, imagen, plataforma) values (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, j.getNombre());
            ps.setString(2, j.getDetalle());
            ps.setString(3, j.getPrecio());
            ps.setInt(4, Integer.parseInt(j.getCategoria()));
            ps.setString(5, j.getImagen());
            ps.setInt(6, Integer.parseInt(j.getPlataforma()));
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

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList<Producto>();
       
        try {
            conn = DB.getConexion();
            String query = "SELECT pr.id,pr.nombre,pr.detalle,pr.precio,pr.imagen,c.id,c.nombre,p.id,p.nombre FROM producto pr "
                    + "inner join categoria c on pr.categoria = c.id  "
                    + "inner join plataforma p on pr.plataforma = p.id";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            Blob img = null;

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("pr.id"));
                producto.setNombre(rs.getString("pr.nombre"));
                producto.setDetalle(rs.getString("pr.detalle"));
                producto.setPrecio(rs.getString("pr.precio"));
                producto.setImagen(rs.getString("pr.imagen"));
                producto.setCategoria(rs.getString("c.id"));
                //producto.setNameCategoria(rs.getString("c.nombre"));
                producto.setPlataforma(rs.getString("p.id"));
                //producto.setNamePlataforma(rs.getString("p.nombre"));
                productos.add(producto);
                
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return productos;
    }

    public String obtenerProductoJSON(String id) {
        Producto producto = new Producto();
        String json = null;
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM producto WHERE id="+id;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDetalle(rs.getString("detalle"));
                producto.setPrecio(rs.getString("precio"));
                producto.setImagen(rs.getString("imagen"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPlataforma(rs.getString("plataforma"));
                
                json = producto.getJSONProducto();
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
        return json;
    }
    
    public String obtenerNombreCategoria(String cat)
    {
        String categoria = null;
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM categoria WHERE id="+cat;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                categoria = rs.getString("nombre");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
        return categoria;
    }
    /**
     * 
     * @param plat
     * @return 
     */
    public String obtenerNombrePlataforma(String plat)
    {
        String plataforma = null;
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM plataforma WHERE id="+plat;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                plataforma = rs.getString("nombre");
            }
      
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
        return plataforma;
    }
    
    public void actualizarJuego(Producto j)
    {
        try {
            conn = conexion.getConexion();
            String query = "UPDATE producto SET nombre = ?, detalle = ?, precio = ?, categoria = ?, imagen = ?, plataforma = ? WHERE id="+String.valueOf(j.getId());
            ps = conn.prepareStatement(query);
            ps.setString(1, j.getNombre());
            ps.setString(2, j.getDetalle());
            ps.setString(3, j.getPrecio());
            ps.setInt(4, Integer.parseInt(j.getCategoria()));
            ps.setString(5, j.getImagen());
            ps.setInt(6, Integer.parseInt(j.getPlataforma()));
            
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

}
