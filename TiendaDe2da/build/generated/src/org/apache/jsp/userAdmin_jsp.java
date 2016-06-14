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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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

<<<<<<< HEAD
=======
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
>>>>>>> origin/Sofia
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
<<<<<<< HEAD
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
=======
      out.write("    <nav style=\"background-color: gray;\">\r\n");
      out.write("        <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul id=\"slide-out\" class=\"side-nav\">\r\n");
      out.write("            <li><a href=\"#!\">First Sidebar Link</a></li>\r\n");
      out.write("            <li><a href=\"#!\">Second Sidebar Link</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <body>\r\n");
      out.write("\n");
      out.write("           <div id=\"formLoguin\">\n");
      out.write("                <div class=\"row col s6 offset-s3\">\n");
      out.write("                    <h3 id=\"titleH3\">INICIO SESIÓN ADMIN</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row col s12 divider\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s4 offset-s4\">\n");
      out.write("                        <input id=\"usuario_admin\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"usuario_admin\">Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s4 offset-s4\">\n");
      out.write("                        <input id=\"contraseña_admin\" type=\"password\" class=\"validate\">\n");
      out.write("                        <label for=\"contraseña_admin\">Contraseña</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s4 offset-s4\">\n");
      out.write("                        <a class=\"waves-effect waves-light btn\" href=\"./admin\">Ingresar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
>>>>>>> origin/Sofia
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.Nombre}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                \r\n");
        out.write("                    ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("                    \r\n");
        out.write("                    <li><a href=\"#\" onclick=\"logout()\">Salir</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("Bienvenido ${sessionScope.Nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li><a href=\"registrarUsuario.jsp\">Registrarse</a></li>\r\n");
        out.write("                    <li><a href=\"userAdmin.jsp\">Administrador</a></li>\r\n");
        out.write("                    <li><a class=\"waves-effect waves-light btn modal-trigger\" href=\"#modal2\">Entrar</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
