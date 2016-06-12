
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
public class AddGameToCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        Producto producto = new Producto();

        String id = req.getParameter("id");
        String nombre = req.getParameter("nom");
        String precio = req.getParameter("prec");

        producto.setId(Integer.parseInt(id));
        producto.setNombre(nombre);
        producto.setPrecio(precio);

        if (session != null) {
            ArrayList juegosCar;
            juegosCar = (ArrayList) session.getAttribute("Carrito");
            juegosCar.add(producto);
            session.setAttribute("Carrito",juegosCar);
            resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write("yes");
        }
    }

}
