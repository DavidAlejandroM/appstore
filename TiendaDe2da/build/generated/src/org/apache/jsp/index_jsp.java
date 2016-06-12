package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Tienda De2da</title>\n");
      out.write("        <script src=\"javascript/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>   \n");
      out.write("        <script src=\"javascript/header.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"javascript/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"javascript/itemProducoPublicidad.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"javascript/scriptsAdmin.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"iconos/css3/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <nav style=\"background-color: gray;\">\n");
      out.write("        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("      \n");
      out.write("                <li><a href=\"registrarUsuario.jsp\">Registrarse</a></li>\n");
      out.write("            <li><a href=\"userAdmin.jsp\">Administrador</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul id=\"slide-out\" class=\"side-nav\">\n");
      out.write("            <li><a href=\"#!\">First Sidebar Link</a></li>\n");
      out.write("            <li><a href=\"#!\">Second Sidebar Link</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div id=\"categoriaBar\" class=\"col s3\">\n");
      out.write("        <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("            <li id=\"categoria\">\n");
      out.write("                <div class=\"collapsible-header\"><i class=\"fa fa-info\" aria-hidden=\"true\"></i>Categoría</div>\n");
      out.write("\n");
      out.write("                <div class=\"collapsible-body\"><p>Aventura</p></div>\n");
      out.write("                <div class=\"collapsible-body\"><p>Defensa</p></div>\n");
      out.write("                <div class=\"collapsible-body\"><p>Música</p></div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div class=\"collapsible-header\"><i class=\"fa fa-braille\" aria-hidden=\"true\"></i>Plataforma</div>\n");
      out.write("\n");
      out.write("                <div class=\"collapsible-body\"><p>XBOX</p></div>\n");
      out.write("                <div class=\"collapsible-body\"><p>PC</p></div>\n");
      out.write("                <div class=\"collapsible-body\"><p>PS4</p></div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div class=\"collapsible-header\"><i class=\"fa fa-shopping-cart\"></i>Compra</div>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col s9\">\n");
      out.write("            <div class=\"slider\">\n");
      out.write("                <ul class=\"slides\">\n");
      out.write("                    <li>\n");
      out.write("                        <img src=\"/images/caratulas/Call-of-Duty-Black-Ops-III.jpg\"> <!-- random image -->\n");
      out.write("                        <div class=\"caption center-align\">\n");
      out.write("                            <h3>This is our big Tagline!</h3>\n");
      out.write("                            <h5 class=\"light grey-text text-lighten-3\">Here's our small slogan.</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img src=\"/images/caratulas/wowlegion.jpg\"> <!-- random image -->\n");
      out.write("                        <div class=\"caption left-align\">\n");
      out.write("                            <h3>Left Aligned Caption</h3>\n");
      out.write("                            <h5 class=\"light grey-text text-lighten-3\">Here's our small slogan.</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img src=\"/images/caratulas/Call-of-Duty-Black-Ops-III\"> <!-- random image -->\n");
      out.write("                        <div class=\"caption right-align\">\n");
      out.write("                            <h3>Right Aligned Caption</h3>\n");
      out.write("                            <h5 class=\"light grey-text text-lighten-3\">Here's our small slogan.</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img src=\"/images/caratulas/Call-of-Duty-Black-Ops-III\"> <!-- random image -->\n");
      out.write("                        <div class=\"caption center-align\">\n");
      out.write("                            <h3>This is our big Tagline!</h3>\n");
      out.write("                            <h5 class=\"light grey-text text-lighten-3\">Here's our small slogan.</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        <!-- Modal Structure -->\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty productos}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div id=\"modal1\" class=\"modal modal-fixed-footer\">\n");
        out.write("                <div class=\"modal-content\">\n");
        out.write("                    <div class=\"row\">\n");
        out.write("                        <h5 id=\"nombre-producto-modal\" class=\"col s12\"></h5>\n");
        out.write("                        <div  class=\"col s4\"> <img src=\"\" alt=\"Norway\" id=\"imagenItem\"> </div>\n");
        out.write("                        <div class=\"col s8\" id=\"descripcion\">\n");
        out.write("                            <h6>Detalle:</h6>\n");
        out.write("                            <p id=\"detalle-producto-modal\"></p>\n");
        out.write("                            <h6>Precio:</h6>\n");
        out.write("                            <p id=\"precio-producto-modal\"></p>\n");
        out.write("                            <h6>Plataforma:</h6>\n");
        out.write("                            <p id=\"plataforma-producto-modal\"></p>\n");
        out.write("                            <h6>Categoria:</h6>\n");
        out.write("                            <p id=\"categoria-producto-modal\"></p>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"modal-footer\">\n");
        out.write("                    <a class=\"waves-effect waves-light btn\"><i class=\"fa fa-shopping-cart\"></i>Comprar</a>\n");
        out.write("                    <a class=\"waves-effect waves-light btn\" id=\"botonCancelar\"></i>Cancelar</a>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"row\">\n");
        out.write("                <div style=\"margin-right:10%; margin-left: 10%\"> \n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </div>                \n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pro");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div style=\"float: left;\" class=\"itemProducto\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Norway\" id=\"imagenItem\">\n");
          out.write("                            <div style=\"text-align:center;\" class=\"container\">\n");
          out.write("                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                <p class=\"p-description\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNameCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNamePlataforma()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <!-- Modal Trigger -->\n");
          out.write("                                <a class=\"waves-effect waves-light btn modal-trigger\" href=\"#modal1\" onclick=\"cargarDatosModal('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getDetalle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNameCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNamePlataforma()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">Comprar</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
