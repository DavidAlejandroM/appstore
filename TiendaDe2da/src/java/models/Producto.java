/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HP VPRO
 */
public class Producto {

    private ProductoDAO productoDAO = new ProductoDAO();
    
    private Integer id;
    private String nombre;
    private String detalle;
    private String categoria;
    private String nameCategoria;
    private String precio;
    private String imagen;
    private String plataforma;
    private String namePlataforma;

    public String getNameCategoria() {
        return nameCategoria;
    }

    public String getNamePlataforma() {
        return namePlataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.namePlataforma = productoDAO.obtenerNombrePlataforma(plataforma);
        this.plataforma = plataforma;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.nameCategoria = productoDAO.obtenerNombreCategoria(categoria);
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

}
