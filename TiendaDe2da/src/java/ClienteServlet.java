
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
public class ClienteServlet extends HttpServlet {

    ProductoDAO proDAO = new ProductoDAO();
    ArrayList<Producto> productos;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Despliega fomulario para mostrar
        productos = proDAO.obtenerProductos();
        RequestDispatcher view = request.getRequestDispatcher("inicio.jsp");
        request.setAttribute("productos", productos);
        view.forward(request, response);
    }
}
