package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeAdminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Admin Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template.jsp", out, false);
      out.write("\n");
      out.write("    <td valign=\"top\" colspan=\"80\">\n");
      out.write("        <table>\n");
      out.write("            <tr><td><font color='darkblue'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Domestic Flights</a></td>\n");
      out.write("<td><font color='darkblue'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>International Flights</a></td>\n");
      out.write("<td><font color='darkblue'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Hotels</a></td>\n");
      out.write("<td><font color='darkblue'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Car Rentals</a></td>\n");
      out.write("<td><font color='darkblue'><a href='");
out.println(response.encodeURL("TourPackage.jsp").toString());
      out.write("'>Tour Packages</a></td>\n");
      out.write("<td><font color='darkblue'><a href='");
out.println(response.encodeURL("GetLogDetails.jsp").toString());
      out.write("'>Get Log Details</a></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>\n");
      out.write("<font color='darkblue' size='+2'>Welcome to the Exotica Travels Website!!\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
