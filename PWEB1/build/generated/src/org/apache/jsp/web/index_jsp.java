package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/web/header.jsp");
    _jspx_dependants.add("/web/footer.html");
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
      out.write("<!DOCTYPE html>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../template/css/bootstrap.min.css\">\n");
      out.write("        <title>Sistem Penjualan Apotek</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"/PWEB1/web/index.jsp\">Sistem Penjualan Apotek</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                ");
role.LoginData login = (role.LoginData) session.getAttribute("loginData");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    ");
 if(login==null){
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/gudang.jsp\">Gudang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/kasir.jsp\">Kasir</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/pemilik.jsp\">Laporan</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"login.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\">Login</button></a>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/gudang.jsp\">Gudang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/kasir.jsp\">Kasir</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/pemilik.jsp\">Laporan</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"/PWEB1/web/logout.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\">Logout</button></a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>                    \n");
      out.write("        </nav>\n");
      out.write("                <br/>\n");
      out.write("    <br/>\n");
      out.write("        <!-- End Header-->");
      out.write('\n');
      out.write('\n');

    if (login!=null) {
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Selamat Datang di Sistem Penjualan Apotek</h1>\n");
      out.write("        <img class=\"img-fluid\" src=\"../template/wall.jpg\">\n");
      out.write("    </center>\n");
      out.write("        ");
} else {

      out.write("\n");
      out.write("<center>\n");
      out.write("    <div class=\"w-75 p-3\">\n");
      out.write("        <h1>Selamat Datang di Sistem Penjualan Apotek</h1>\n");
      out.write("        <div class=\"container alert alert-danger alert-dismissible fade show\" role=\"alert\">\n");
      out.write("            Silahkan Login\n");
      out.write("            untuk mengakses!!<br/>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <img class=\"img-fluid\" src=\"../template/wall.jpg\">\n");
      out.write("</center>\n");
}
      out.write('\n');
      out.write("<!-- Start Footer-->\r\n");
      out.write("            <div class=\"card text-center sticky-bottom\" style=\"bottom: 0;\">\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  Copyright &copy; 2019 by Kontrakan Penikmat Senja. No Rights Reserved\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"../template/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write('\n');
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
