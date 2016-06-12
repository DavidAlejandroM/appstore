package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<div id=\"contenedorAdmin\">\n");
      out.write("    <div class=\"row\" id=\"contenedor\">\n");
      out.write("        <div class=\"col s3\" id=\"categoriaBar\">\n");
      out.write("            <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\"><i class=\"material-icons\">Administrar Juegos</i></div>\n");
      out.write("                    <div class=\"collapsible-body adminJuego\">\n");
      out.write("                        <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formAddGame')\">Registrar</a><br>\n");
      out.write("                        <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListar')\">Actualizar</a><br>\n");
      out.write("                        <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListarEliminar')\">Eliminar</a><br>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col s9\">\n");
      out.write("<!----TABLA LISTAR--->\n");
      out.write("            <div id=\"formListar\">\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th data-field=\"name\">Nombre Juego</th>\n");
      out.write("                        <th data-field=\"name\">Categoria</th>\n");
      out.write("                        <th data-field=\"name\">Pataforma</th>\n");
      out.write("                        <th data-field=\"price\">Precio</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("<!--\n");
      out.write("                   \n");
      out.write("                    <tr class=\"mouseColor tableItemUpdate\" id=\"1\">\n");
      out.write("                        <td>Call of Duty Black Ops</td>\n");
      out.write("                        <td>Accion</td>\n");
      out.write("                        <td >Pc</td>\n");
      out.write("                        <td>$ 100000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"mouseColor tableItemUpdate\" id=\"2\">\n");
      out.write("                        <td>World of Warcraft</td>\n");
      out.write("                        <td>Roll</td>\n");
      out.write("                        <td>PS4</td>\n");
      out.write("                        <td>$ 80000</td>\n");
      out.write("                    </tr>\n");
      out.write("-->\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("<!----TABLA LISTAR ELIMINAR-->\n");
      out.write("            <div id=\"formListarEliminar\">\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th data-field=\"name\">Nombre Juego</th>\n");
      out.write("                        <th data-field=\"name\">Categoria</th>\n");
      out.write("                        <th data-field=\"name\">Pataforma</th>\n");
      out.write("                        <th data-field=\"price\">Precio</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                    <tr class=\"mouseColor tableItemDelete\" id=\"1\">\n");
      out.write("                        <td>Call of Duty Black Ops</td>\n");
      out.write("                        <td>Accion</td>\n");
      out.write("                        <td >Pc</td>\n");
      out.write("                        <td>$ 100000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"mouseColor tableItemDelete\" id=\"2\">\n");
      out.write("                        <td>World of Warcraft</td>\n");
      out.write("                        <td>Roll</td>\n");
      out.write("                        <td>PS4</td>\n");
      out.write("                        <td>$ 80000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"mouseColor tableItemDelete\" id=\"3\">\n");
      out.write("                        <td>World of Warcraft</td>\n");
      out.write("                        <td>Roll</td>\n");
      out.write("                        <td>PS4</td>\n");
      out.write("                        <td>$ 80000</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("     <!--AGREGAR JUEGO  ----------------------------------------------------------------------------------->\n");
      out.write("         <div id=\"formAddGame\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s8\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s6\">\n");
      out.write("                                <select id=\"select_categoria\">\n");
      out.write("                                    <option value=\"0\" disabled selected>Elija una opción</option>\n");
      out.write("                                    <option value=\"1\">Accion</option>\n");
      out.write("                                    <option value=\"2\">Estrategia</option>\n");
      out.write("                                    <option value=\"3\">Roll</option>\n");
      out.write("                                </select>\n");
      out.write("                                <label>Categoria</label>\n");
      out.write("\n");
      out.write("                            </div><div class=\"input-field col s6\">\n");
      out.write("                                <select id=\"select_plataforma\">\n");
      out.write("                                    <option value=\"\" disabled selected>Elija una opción</option>\n");
      out.write("                                    <option value=\"1\">PC</option>\n");
      out.write("                                    <option value=\"2\">Xbox One</option>\n");
      out.write("                                    <option value=\"3\">PS4</option>\n");
      out.write("                                </select>\n");
      out.write("                            <label>Plataforma</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <input id=\"nombre_game\" type=\"text\" class=\"validate\">\n");
      out.write("                                <label for=\"nombre_game\">Nombre Juego</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s6\">\n");
      out.write("                                <input id=\"precio_game\" type=\"text\" class=\"validate\" onchange=\"formatoMoneda(this.value)\" onkeyup=\"formatoMoneda(this.value)\">\n");
      out.write("                                <label for=\"precio_game\">Precio</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                    <div class=\"file-field input-field\">\n");
      out.write("                                        <div class=\"btn\">\n");
      out.write("                                            <span>Imagen</span>\n");
      out.write("                                            <input type=\"file\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"file-path-wrapper\">\n");
      out.write("                                            <input class=\"file-path validate\" type=\"text\" placeholder=\"Seleciona una Imagen\" id=\"pathImagen\" onchange=\"mostrarImagenMiniatura('caratula','pathImagen')\" >\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <textarea id=\"text_area_descripcion\" class=\"materialize-textarea\"></textarea>\n");
      out.write("                                <label for=\"text_area_descripcion\">Descripción</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s4\">\n");
      out.write("                        <img class=\"z-depth-2\" src=\"\" id=\"caratula\" width=\"150\" height=\"200\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s2 offset-s6\">\n");
      out.write("                        <a class=\"waves-effect waves-light btn\" onclick=\"guardarJuego()\">Guardar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<div id=\"footerAdmin\">\n");
      out.write("    Bienvenido al Modulo de Administración\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juegos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("juego");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr class=\"mouseColor tableItemUpdate\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNameCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNamePlataforma()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        </tr>\n");
          out.write("                        ");
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
