
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
public class SaveGameServlet extends HttpServlet{
    
    JuegoDAO juegoDAO = new JuegoDAO();
    Juego juego = new Juego();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException { 
        //Despliega fomulario para mostrar
        RequestDispatcher view = request.getRequestDispatcher("admin.jsp");
        view.forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nom");
        int categoria = Integer.parseInt(req.getParameter("cat"));
        int plataforma = Integer.parseInt(req.getParameter("plat"));
        String descripcion = req.getParameter("des");
        String precio = req.getParameter("prec");
        String imagen = req.getParameter("img");
        
        juego.setNombre(nombre);
        juego.setCategoria(1);
        juego.setPlataforma(1);
        juego.setDescripcion(descripcion);
        juego.setPrecio(precio);
        juego.setImagen(imagen);
        
        juegoDAO.agregarJuego(juego);
        resp.getWriter().write("yes");
        System.out.println(nombre);
    }
    
    
    
    
}
