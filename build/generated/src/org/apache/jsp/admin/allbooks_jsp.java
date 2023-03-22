package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/allCss.jsp");
    _jspx_dependants.add("/admin/home_1.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin :All Books</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" \n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" \n");
      out.write("integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" \n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" \n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" \n");
      out.write("      integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" \n");
      out.write("      crossorigin=\"anonymous\" \n");
      out.write("      referrerpolicy=\"no-referrer\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"continer-fluid\" style=\"height: 10px;background-color: #29b6f6\"></div>\n");
      out.write("\n");
      out.write("<div class=\"continer-fluid p-3 bg-light\">\n");
      out.write("    <div class=\"row\"> \n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("        <h3>\n");
      out.write("            <i class=\"fa-solid fa-book\"></i>BookStore\n");
      out.write("        </h3> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\"> \n");
      out.write("        <a href=\"login.jsp\" class=\"btn btn-success\">Login</a> \n");
      out.write("        <a href=\"register.jsp\" class=\"btn btn-primary text-white\">Register</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\"/>\n");
      out.write("  <a class=\"navbar-brand\" href=\"\"><i class=\"fas fa-home\"></i></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <h3 class=\"text-center\">Hello Admin</h3>\n");
      out.write("        <table class=\"table table-striped \">\n");
      out.write("            <thead class=\"bg-primary text-white\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">Id</th>\n");
      out.write("                    <th scope=\"col\">Book Name</th>\n");
      out.write("                    <th scope=\"col\">Author</th>\n");
      out.write("                    <th scope=\"col\">Price</th>\n");
      out.write("                    <th scope=\"col\">Categories</th><!-- comment -->\n");
      out.write("                    <th scope=\"col\">Status</th><!-- comment -->\n");
      out.write("                    <th scope=\"col\">Action</th><!-- comment -->\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">1</th>\n");
      out.write("                    <td>Mark</td>\n");
      out.write("                    <td>Otto</td>\n");
      out.write("                    <td>@mdo</td>\n");
      out.write("                    <td>Otto</td>\n");
      out.write("                    <td>@mdo</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-sm btn-primary\">Edit</a>\n");
      out.write("                         <a href=\"#\" class=\"btn btn-sm btn-danger\">Delete</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">2</th>\n");
      out.write("                    <td>Jacob</td>\n");
      out.write("                    <td>Thornton</td>\n");
      out.write("                    <td>@fat</td>\n");
      out.write("                    <td>Otto</td>\n");
      out.write("                    <td>@mdo</td>\n");
      out.write("                     <td>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-sm btn-primary\">Edit</a>\n");
      out.write("                         <a href=\"#\" class=\"btn btn-sm btn-danger\">Delete</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">3</th>\n");
      out.write("                    <td>Larry</td>\n");
      out.write("                    <td>the Bird</td>\n");
      out.write("                    <td>@twitter</td>\n");
      out.write("                    <td>Otto</td>\n");
      out.write("                    <td>@mdo</td>\n");
      out.write("                     <td>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-sm btn-primary\">Edit</a>\n");
      out.write("                         <a href=\"#\" class=\"btn btn-sm btn-danger\">Delete</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
