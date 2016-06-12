
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Juego;
import models.JuegoDAO;
import models.Producto;
import models.ProductoDAO;
import models.Usuario;
import models.UsuarioDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP VPRO
 */
public class LoginUserServlet extends HttpServlet{
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("user");
        String contrasena = req.getParameter("pass");
     
        usuario.setUsuario(user);
        usuario.setContrasena(contrasena);

        HttpSession session1 = req.getSession(true);
        HttpSession session2 = req.getSession(true);
        HttpSession session3 = req.getSession(true);
        String name = usuarioDAO.obtenerSesion(usuario);
        int id = usuarioDAO.obtenerId(usuario);
        if(name!=null){
            
        ArrayList juegosCar = new ArrayList();
        session1.setAttribute("Nombre", name);
        session2.setAttribute("Carrito",juegosCar);
        session3.setAttribute("IdUser",id);
        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("yes");
        }else{
        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("no");
        }
        
        
   
        
    }
    
    
    
    
}
