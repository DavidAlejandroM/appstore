package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write(" <footer class=\"page-footer\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col l6 s12\">\n");
      out.write("                <h5 class=\"white-text\">VideoGame Store</h5>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Tienda virtual para video juegos</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Contactenos</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Pedido</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Registro</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Direccion</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            © 2014 Copyright Text\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">Redes sociales</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("</html>\n");
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
