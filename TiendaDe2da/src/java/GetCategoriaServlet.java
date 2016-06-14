
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CategoriaDAO;
import models.PlataformaDAO;

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
public class GetCategoriaServlet extends HttpServlet{
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
   


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String r = null;
        String id = req.getParameter("id");
        String nombre = req.getParameter("nombre");
        boolean a = !id.equals("0");
        
        if (a) {
           if (!nombre.isEmpty()) 
            {
                r = categoriaDAO.modificarCategoria(id,nombre);
            }
           else
           {
               r = "vacio";
           }
        }
        else
        {
            if (!nombre.isEmpty()) 
            {
                r = categoriaDAO.agregarCategoria(nombre);
            }
            else
            {
               r = "vacio";
            }
        }
        resp.getWriter().write(r);
  
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String respuesta;
        respuesta = categoriaDAO.obtenerCategoriasJSON();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(respuesta);
    }
    
    
    
    
    
    
}
