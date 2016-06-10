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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author HP VPRO
 */
public class PlataformaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;


    public String obtenerPlataformasJSON() {
        Producto producto = new Producto();
        String json = "[";
        try {
            conn = conexion.getConexion();
            String query = "SELECT * FROM plataforma ORDER BY nombre ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            JSONObject js = new JSONObject();
            int contador = 0;
            
            while (rs.next()) {
                if (contador != 0) {
                    json = json + ",";
                }
                Object id = rs.getObject("id");
                Object nombre = rs.getObject("nombre");
                try {
                        js.put("id", id);
                        js.put("nombre", nombre);
                        json = json + js.toString();
                        
                } 
                catch (JSONException ex) {
                        Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
                }
                contador ++;
            }
            
            json = json + "]";
            
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();
                } catch (Exception e) { /* ignored */ }
            }
                
        return json;
    }

    public String modificarPlataforma(String id, String nombre) {
        String a = null;
        
        try {
            conn = conexion.getConexion();
            String query = "UPDATE plataforma SET nombre = ? WHERE id="+id;
            ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            
            
            ps.executeUpdate();
            //ps.executeUpdate(query);
            a = "yes";
            
        } catch (Exception e) {
            e.printStackTrace();
            a = "no";
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
        return a;
    }

    public String agregarPlataforma(String nombre) {
        String a = null;
        
        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO plataforma (nombre) values (?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            
            
            ps.executeUpdate();
            //ps.executeUpdate(query);
            a = "yes";
            
        } catch (Exception e) {
            e.printStackTrace();
            a = "no";
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
        return a;
    }
    
}
