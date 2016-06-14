package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Tienda De2da</title>\r\n");
      out.write("        <script src=\"javascript/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>   \r\n");
      out.write("        <script src=\"javascript/header.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"javascript/materialize.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"javascript/scriptsAdmin.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"iconos/css3/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("           <div id=\"formLoguin\">\r\n");
      out.write("                <div class=\"row col s6 offset-s3\">\r\n");
      out.write("                    <h3 id=\"titleH3\">INICIO SESIÓN ADMIN</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row col s12 divider\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"input-field col s4 offset-s4\">\r\n");
      out.write("                        <input id=\"usuario_admin\" type=\"text\" class=\"validate\">\r\n");
      out.write("                        <label for=\"usuario_admin\">Usuario</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"input-field col s4 offset-s4\">\r\n");
      out.write("                        <input id=\"contrasena_admin\" type=\"password\" class=\"validate\">\r\n");
      out.write("                        <label for=\"contrasena_admin\">Contraseña</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col s4 offset-s4\">\r\n");
      out.write("                        <a class=\"waves-effect waves-light btn\" href=\"#\" onclick=\"loginAdmin()\">Ingresar</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write(" <footer class=\"page-footer\" style=\"background-color: gray;\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col l6 s12\">\r\n");
      out.write("                <h5 class=\"white-text\">HardCore Game</h5>\r\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Tienda en linea para videojuegos</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col l4 offset-l2 s12\">\r\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Contactenos</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Pedido</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Registro</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Direccion</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"footer-copyright\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            © 2014 Copyright Text\r\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">Redes sociales</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
