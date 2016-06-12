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
public class UsuarioDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

    public String agregarUsuario(Usuario u, String repass) {
        if (u.getContrasena().equals(repass)) {
            try {
                conn = conexion.getConexion();
                String query = "INSERT INTO cliente (nombre, apellido, correo, telefono, usuario, contrasena,tipo) values (?, ?, ?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(query);
                ps.setString(1, u.getNombre());
                ps.setString(2, u.getApellido());
                ps.setString(3, u.getCorreo());
                ps.setString(4, u.getTelefono());
                ps.setString(5, u.getUsuario());
                ps.setString(6, u.getContrasena());
                ps.setInt(7, 1);
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
            return "yes";
        } else {
            return "no";
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

    public Producto obtenerProducto(int id) {
        return null;
    }

    public String obtenerNombreCategoria(String cat) {
        String categoria = null;
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM categoria WHERE id=" + cat;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.err.println(rs.getInt("id"));
                System.err.println(rs.getString("nombre"));
                categoria = rs.getString("nombre");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return categoria;
    }

    /**
     *
     * @param plat
     * @return
     */
    public String obtenerNombrePlataforma(String plat) {
        String plataforma = null;
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM plataforma WHERE id=" + plat;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.err.println(rs.getInt("id"));
                System.err.println(rs.getString("nombre"));
                plataforma = rs.getString("nombre");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return plataforma;
    }

    public String obtenerSesion(Usuario u) {
        String nombres = null;
        try {
            conn = DB.getConexion();
            String query = "SELECT CONCAT(nombre,' ',apellido) as NombresUsuario FROM cliente WHERE usuario='"+u.getUsuario()+"' and contrasena='"+u.getContrasena()+"'";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                nombres = rs.getString("NombresUsuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return nombres;
    }
    
    public int obtenerId(Usuario u) {
        int  id = 0;
        try {
            conn = DB.getConexion();
            String query = "SELECT id idUsuario FROM cliente WHERE usuario='"+u.getUsuario()+"' and contrasena='"+u.getContrasena()+"'";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("idUsuario");
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
