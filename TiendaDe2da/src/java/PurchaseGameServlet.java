
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Juego;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Factura;
import models.FacturaDAO;
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
public class PurchaseGameServlet extends HttpServlet {

    Date date = new Date();
    DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Factura factura = new Factura();
    FacturaDAO facturaDao = new FacturaDAO();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        ArrayList total = new ArrayList();
        total = (ArrayList) session.getAttribute("Carrito");
        int suma = 0;
        for (int i = 0; i < total.size(); i++) {
            Producto producto = new Producto();
            producto = (Producto) total.get(i);
            String[] partes = producto.getPrecio().split(" ");
            int a = Integer.parseInt(partes[2]);
            suma += Integer.parseInt(partes[2]);
        }
        int idCliente = (int) session.getAttribute("IdUser");
        String hora = hourFormat.format(date);
        String fecha = dateFormat.format(date);
        
        factura.setFecha(fecha);
        factura.setHora(hora);
        factura.setIdCliente(idCliente);
        factura.setTotal(suma);
        
        String res = facturaDao.agregarFactura(factura);
        
        int idFactura = facturaDao.obtenerUltimaFactura();
        for (int i = 0; i < total.size(); i++) {
            Producto producto = new Producto();
            producto = (Producto) total.get(i);
            int h = producto.getId();
            facturaDao.agregarFacturaProducto(idFactura,producto.getId());
        }

        if(res != null){
        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(res);
        
        total.clear();
        session.setAttribute("Carrito",total);
        
        }else{
        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("no");
        }
        }
    }
    

