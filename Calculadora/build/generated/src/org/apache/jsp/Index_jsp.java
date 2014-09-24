package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <title>Calculadora Web</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Proyecto N° 1 de Fundamentos de Programación Web\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1, maximum-scale=1\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../CalculadoraWeb/images/favicon.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/normalize.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/estilos.css\" />\n");
      out.write("        \n");
      out.write("   </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <figure id = \"logo\">\n");
      out.write("\t\t<img src = \"images/logo.png\" />\n");
      out.write("            </figure>\n");
      out.write("            <h1> Proyecto N°1 Calculadora Cientifica Uned</h1>\n");
      out.write("            <figure id = \"avatar\"></figure>\n");
      out.write("        </header>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Calculadora</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Manual de Usuario</a></li>\n");
      out.write("                <li><a href=\"#\">Acerca de la App</a></li>\n");
      out.write("            </ul>\n");
      out.write("\t</nav>\n");
      out.write("        <section id=\"contenido\">\n");
      out.write("            <article class = \"item\">\n");
      out.write("                <div class = \"titulo_item\">\n");
      out.write("                    <form method= get action=\"\" id=\"formulario\" class=\"formulario\">\n");
      out.write("                        <input type=\"text\" placeholder=\"0\" id=\"titulo\" name=\"titulo\" readonly=\"\">\n");
      out.write("                        <!--<input type=\"text\" placeholder=\"Link\" id=\"link\" name=\"link\" >\n");
      out.write("                        <input type=\"submit\" value=\"Agregar\">-->\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </article>\n");
      out.write("            <article class=\"item\">\n");
      out.write("\t\t\t<figure class=\"imagen_item\">\n");
      out.write("\t\t\t\t<img src=\"imagen.jpg\" />\n");
      out.write("\t\t\t</figure>\n");
      out.write("\t\t\t<h2 class=\"titulo_item\">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\tFacebook prueba una forma de monetizar aplicaciones para móviles\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t\t<div class=\"autor_item\">\n");
      out.write("\t\t\t\tpor <a href=\"#\">Joana Muñoz</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"datos_item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"tag_item\">pony</a>\n");
      out.write("\t\t\t\t<span class=\"fecha_item\">\n");
      out.write("\t\t\t\t\thace <strong>5</strong> min\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"votacion\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"up icon-flecha-arriba\"></a>\n");
      out.write("\t\t\t\t720\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"down icon-flecha-abajo\"></a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"comentarios_item\">69</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"guardar_item icon-estrella\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</article>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--<script src = \"http://code.jquery.com/jquery-1.10.1.min.js\"></script>-->\n");
      out.write("        \n");
      out.write("        <script src = \"CSS/prefixfree.js\"></script>\n");
      out.write("        <script src=\"scriptAvatar.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
