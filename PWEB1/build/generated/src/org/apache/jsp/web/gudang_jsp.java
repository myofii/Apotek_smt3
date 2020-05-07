package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gudang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/web/headersp.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Sistem Inventory Apotek</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Sistem Inventory Apotek</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("              \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                      <a class=\"nav-link\" href=\"index.jsp\">Beranda <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"gudang.jsp\">Gudang</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link disabled\" href=\"kasir.jsp\">Kasir</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              </nav>\n");
      out.write("<!-- End Header-->\n");
      out.write('\n');
 
    String[] nama_brg = {"Paracetamol","OBH","Minyak Kayu Putih"};
    int[] stok_brg = {10,15,20};
    int[] harga_brg = {20000,40000,10000};

      out.write("\n");
      out.write("<table class=\"table text-center\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">No</th>\n");
      out.write("      <th scope=\"col\">Nama Barang</th>\n");
      out.write("      <th scope=\"col\">Stok</th>\n");
      out.write("      <th scope=\"col\">Harga</th>\n");
      out.write("      <th scope=\"col\">Aksi</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");
 for (int i = 0; i < nama_brg.length; i++) {
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print((i+1));
      out.write("</th>\n");
      out.write("      <td>");
      out.print(nama_brg[i]);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(stok_brg[i]);
      out.write("</td>\n");
      out.write("      <td>Rp.");
      out.print(harga_brg[i]);
      out.write("</td>\n");
      out.write("      <td><div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("    Tambah Stok\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("    <div class=\"dropdown-divider\"></div>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Separated link</a>\n");
      out.write("  </div>\n");
      out.write("</div></td>\n");
      out.write("    </tr>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("<!-- Start Footer-->\r\n");
      out.write("              <div class=\"card text-center\" style=\"position:absolute;bottom:0px;width:100%;\">\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  Copyright &copy; 2019 By : Muhammad Yofi Indrawan\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
}
