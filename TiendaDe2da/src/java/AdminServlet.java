
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.*;
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
public class AdminServlet extends HttpServlet{
    ProductoDAO productoDAO = new ProductoDAO();
    Producto producto = new Producto();
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException { 
        //Despliega fomulario para mostrar
        
        RequestDispatcher view = request.getRequestDispatcher("admin.jsp");
        request.setAttribute("juegos", productoDAO.obtenerProductos());
        view.forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
    }
    
    
    
    
}
