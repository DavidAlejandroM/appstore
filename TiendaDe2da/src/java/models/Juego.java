/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Alejandro
 */
public class Juego {
    private int id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String categoria;
    private String pathImagen;
    private String plataforma;

    public Juego() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
                  
}
