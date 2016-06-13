
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class SaveUserServlet extends HttpServlet{
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nom");
        String apellido = req.getParameter("ape");
        String correo = req.getParameter("corr");
        String telefono = req.getParameter("tel");
        String user = req.getParameter("usr");
        String contrasena = req.getParameter("pass");
        String repass = req.getParameter("repass");
     
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setTelefono(telefono);
        usuario.setUsuario(user);
        usuario.setContrasena(contrasena);
        
        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8");
        String saved = usuarioDAO.agregarUsuario(usuario,repass);
        resp.getWriter().write(saved);
        
    }
    
    
    
    
}
