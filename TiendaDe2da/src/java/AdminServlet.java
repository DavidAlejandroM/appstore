
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Juego;
import models.JuegoDAO;

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
    
    JuegoDAO juegoDAO = new JuegoDAO();
    Juego juego = new Juego();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException { 
        //Despliega fomulario para mostrar
        
        RequestDispatcher view = request.getRequestDispatcher("admin.jsp");
        request.setAttribute("juegos", juegoDAO.obtenerProductos());
        view.forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre_game");
        
        System.out.println(nombre);
    }
    
    
    
    
}
