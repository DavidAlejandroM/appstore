/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author deiry.navas
 */
import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

    public void agregar(Persona p) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO persona (nombre, correo) values (?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCorreo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
        }
    }

    public ArrayList<Persona> obtenerPersonas() {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        try {
            conn = DB.getConexion();
            String query = "SELECT * FROM persona";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setCorreo(rs.getString("correo"));
                personas.add(persona);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return personas;
    }
}
