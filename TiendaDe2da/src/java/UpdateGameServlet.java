
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Producto;
import models.ProductoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP VPRO
 */
public class UpdateGameServlet extends HttpServlet{
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nom");
        String categoria = req.getParameter("cat");
        String plataforma = req.getParameter("plat");
        String descripcion = req.getParameter("des");
        String precio = req.getParameter("prec");
        String imagen = req.getParameter("img");
        
        
        producto.setId(id);
        producto.setNombre(nombre);
        producto.setCategoria(categoria);
        producto.setPlataforma(plataforma);
        producto.setDetalle(descripcion);
        producto.setPrecio(precio);
        producto.setImagen(imagen);
        productoDAO.actualizarJuego(producto);
        resp.getWriter().write("yes");
        
    }
    
    
    
    
}
