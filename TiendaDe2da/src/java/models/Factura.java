/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author HP VPRO
 */
public class Factura {

    private Integer id;
    private String fecha;
    private String hora;
    private int idCliente;
    private int total;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getTotal() {
        return total;
    }

    public String getJSONFactura() {
        String Json = null;
        Object id = this.id;
        Object fecha = this.fecha;
        Object hora = this.hora;
        Object idCliente = this.idCliente;
        Object total = this.total;

        JSONObject js = new JSONObject();
        try {
            js.put("id", id);
            js.put("fecha", fecha);
            js.put("hora", hora);
            js.put("idCliente", idCliente);
            js.put("total", total);

            Json = js.toString();

        } catch (JSONException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Json;
    }

}
