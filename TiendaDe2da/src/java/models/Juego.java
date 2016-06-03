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
    private int categoria;
    private String imagen;
    private int plataforma;

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

    public int getCategoria() {
        return categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public int getPlataforma() {
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

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPlataforma(int plataforma) {
        this.plataforma = plataforma;
    }

    
}