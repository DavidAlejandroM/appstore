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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
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
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.NombreAdmin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                \r\n");
        out.write("                    ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("                    \r\n");
        out.write("                    <li><a href=\"#\" onclick=\"logout()\">Salir</a></li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("Bienvenido ${sessionScope.Nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
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

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.NombreAdmin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                \r\n");
        out.write("        <div id=\"contenedorAdmin\">\r\n");
        out.write("            <div class=\"row\" id=\"contenedor\">\r\n");
        out.write("                <div class=\"col s3\" id=\"categoriaBar\">\r\n");
        out.write("                    <ul class=\"collapsible\" data-collapsible=\"accordion\">\r\n");
        out.write("                        <li>\r\n");
        out.write("                            <div class=\"collapsible-header\"><i class=\"material-icons\">Juegos</i></div>\r\n");
        out.write("                            <div class=\"collapsible-body adminJuego\">\r\n");
        out.write("                                <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formAddGame')\">Registrar</a><br>\r\n");
        out.write("                                <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListar')\">Actualizar</a><br>\r\n");
        out.write("                                <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListarEliminar')\">Eliminar</a><br>\r\n");
        out.write("                                <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListarPlataformas')\">Plataformas</a><br>\r\n");
        out.write("                                <a class=\"waves-effect waves-red btn btnAdmin\" onclick=\"showDiv('formListarCategorias')\">Categorias</a><br>\r\n");
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    </ul>\r\n");
        out.write("                </div>\r\n");
        out.write("\r\n");
        out.write("                <div class=\"col s9\">\r\n");
        out.write("                    <!----TABLA LISTAR--->\r\n");
        out.write("                    <div id=\"formListar\">\r\n");
        out.write("                        <table>\r\n");
        out.write("                            <thead>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <th data-field=\"name\"></th>\r\n");
        out.write("                                    <th data-field=\"name\">Nombre Juego</th>\r\n");
        out.write("                                    <th data-field=\"name\">Categoria</th>\r\n");
        out.write("                                    <th data-field=\"name\">Pataforma</th>\r\n");
        out.write("                                    <th data-field=\"price\">Precio</th>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("                            <tbody>\r\n");
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </tbody>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!----TABLA LISTAR ELIMINAR-->\r\n");
        out.write("                    <div id=\"formListarEliminar\">\r\n");
        out.write("                        <table>\r\n");
        out.write("                            <thead>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <th data-field=\"name\"></th>\r\n");
        out.write("                                    <th data-field=\"name\">Nombre Juego</th>\r\n");
        out.write("                                    <th data-field=\"name\">Categoria</th>\r\n");
        out.write("                                    <th data-field=\"name\">Pataforma</th>\r\n");
        out.write("                                    <th data-field=\"price\">Precio</th>\r\n");
        out.write("                                    <th data-field=\"price\"></th>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("\r\n");
        out.write("                            <tbody>\r\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                            </tbody>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!----TABLA LISTAR PLATAFORMAS-->\r\n");
        out.write("                    <div id=\"formListarPlataformas\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"input-field col s6\">\r\n");
        out.write("                                <input placeholder=\"Click aquí para ingresar\" id=\"nombrePlataforma\" type=\"text\" class=\"validate\">\r\n");
        out.write("                                <label for=\"first_name\">Nombre de la Plataforma</label>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-field col s6\">\r\n");
        out.write("                                <a class=\"waves-effect waves-light btn\" onclick=\"guardarPlataforma(document.getElementById('nombrePlataforma').value)\">Guardar</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <table>\r\n");
        out.write("                            <thead>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <th> </th>\r\n");
        out.write("                                    <th data-field=\"name\">Plataforma</th>\r\n");
        out.write("\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("\r\n");
        out.write("                            <tbody id=\"tbodyPlataforma\">\r\n");
        out.write("\r\n");
        out.write("                            </tbody>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!----TABLA LISTAR Categorias-->\r\n");
        out.write("                    <div id=\"formListarCategorias\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"input-field col s6\">\r\n");
        out.write("                                <input placeholder=\"Click aquí para ingresar\" id=\"nombreCategoria\" type=\"text\" class=\"validate\">\r\n");
        out.write("                                <label for=\"first_name\">Nombre de la Categoria</label>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-field col s6\">\r\n");
        out.write("                                <a class=\"waves-effect waves-light btn\" onclick=\"guardarCategoria(document.getElementById('nombreCategoria').value)\">Guardar</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <table>\r\n");
        out.write("                            <thead>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <th> </th>\r\n");
        out.write("                                    <th data-field=\"name\">Categorias</th>\r\n");
        out.write("\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("\r\n");
        out.write("                            <tbody id=\"tbodyCategoria\">\r\n");
        out.write("\r\n");
        out.write("                            </tbody>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!--DIV PARA ALMACENAR EL ID  ----------------------------------------------------------------------------------->\r\n");
        out.write("                    <div id=\"idJuego\" style=\"display: none\">\r\n");
        out.write("                        id\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!--ACTUALIZAR JUEGO  ----------------------------------------------------------------------------------->\r\n");
        out.write("                    <div id=\"formUpdateGame\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col s8\">\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s6\">\r\n");
        out.write("                                        <select id=\"select_categoriaU\">\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <label>Categoria</label>\r\n");
        out.write("                                    </div><div class=\"input-field col s6\">\r\n");
        out.write("                                        <select id=\"select_plataformaU\">\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <label>Plataforma</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <input placeholder=\"\" id=\"nombre_gameU\" type=\"text\" class=\"validate\">\r\n");
        out.write("                                        <label for=\"nombre_game\">Nombre Juego</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s6\">\r\n");
        out.write("                                        <input placeholder=\"\" id=\"precio_gameU\" type=\"text\" class=\"validate\" onchange=\"formatoMoneda(this.value, 'precio_gameU')\" onkeyup=\"formatoMoneda(this.value, 'precio_gameU')\">\r\n");
        out.write("                                        <label for=\"precio_game\">Precio</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <div class=\"file-field input-field\">\r\n");
        out.write("                                            <div class=\"btn\">\r\n");
        out.write("                                                <span>Imagen</span>\r\n");
        out.write("                                                <input type=\"file\">\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"file-path-wrapper\">\r\n");
        out.write("                                                <input class=\"file-path validate\" type=\"text\" placeholder=\"Seleciona una Imagen\" id=\"pathImagenU\" onchange=\"mostrarImagenMiniatura('caratulaU', 'pathImagenU')\" >\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <textarea placeholder=\"\" id=\"text_area_descripcionU\" class=\"materialize-textarea\"></textarea>\r\n");
        out.write("                                        <label for=\"text_area_descripcion\">Descripción</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col s4\">\r\n");
        out.write("                                <img class=\"z-depth-2\" src=\"\" id=\"caratulaU\" width=\"150\" height=\"200\">\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col s2 offset-s6\">\r\n");
        out.write("                                <a class=\"waves-effect waves-light btn\" onclick=\"actualizarJuego()\">Actualizar</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <!--AGREGAR JUEGO  ----------------------------------------------------------------------------------->\r\n");
        out.write("                    <div id=\"formAddGame\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col s8\">\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s6\">\r\n");
        out.write("                                        <select id=\"select_categoria\">\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <label>Categoria</label>\r\n");
        out.write("                                    </div><div class=\"input-field col s6\">\r\n");
        out.write("                                        <select id=\"select_plataforma\">\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <label>Plataforma</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <input id=\"nombre_game\" type=\"text\" class=\"validate\">\r\n");
        out.write("                                        <label for=\"nombre_game\">Nombre Juego</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s6\">\r\n");
        out.write("                                        <input id=\"precio_game\" type=\"text\" class=\"validate\" onchange=\"formatoMoneda(this.value, 'precio_game')\" onkeyup=\"formatoMoneda(this.value, 'precio_game')\">\r\n");
        out.write("                                        <label for=\"precio_game\">Precio</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <div class=\"file-field input-field\">\r\n");
        out.write("                                            <div class=\"btn\">\r\n");
        out.write("                                                <span>Imagen</span>\r\n");
        out.write("                                                <input type=\"file\">\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"file-path-wrapper\">\r\n");
        out.write("                                                <input class=\"file-path validate\" type=\"text\" placeholder=\"Seleciona una Imagen\" id=\"pathImagen\" onchange=\"mostrarImagenMiniatura('caratula', 'pathImagen')\" >\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row\">\r\n");
        out.write("                                    <div class=\"input-field col s12\">\r\n");
        out.write("                                        <textarea id=\"text_area_descripcion\" class=\"materialize-textarea\"></textarea>\r\n");
        out.write("                                        <label for=\"text_area_descripcion\">Descripción</label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col s4\">\r\n");
        out.write("                                <img class=\"z-depth-2\" src=\"\" id=\"caratula\" width=\"150\" height=\"200\">\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col s2 offset-s6\">\r\n");
        out.write("                                <a class=\"waves-effect waves-light btn\" onclick=\"guardarJuego()\">Guardar</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juegos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("juego");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr class=\"mouseColor tableItemDelete\" id =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"circle responsive-img imagenRedonda\">\r\n");
          out.write("                                        </td>                          \r\n");
          out.write("                                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNameCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNamePlataforma()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juegos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("juego");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr class=\"mouseColor tableItemDelete\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"circle responsive-img imagenRedonda\">\r\n");
          out.write("                                        </td>                          \r\n");
          out.write("                                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNameCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNamePlataforma()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <a href=\"#\" onclick=\"eliminar('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${juego.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">Eliminar</a>\r\n");
          out.write("                                        </td>\r\n");
          out.write("\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_redirect_0.setUrl("./userAdmin.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
