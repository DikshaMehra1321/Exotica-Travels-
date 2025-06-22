package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Cart Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template.jsp", out, false);
      out.write("\n");
      out.write("<td valign=\"top\" rowspan=\"200\"colspan=\"80\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Domestic Flights</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>International Flights</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Hotels</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("ConstructionPage.jsp").toString());
      out.write("'>Car Rentals</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='");
out.println(response.encodeURL("TourPackage.jsp").toString());
      out.write("'>Tour Packages</a></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<font align='center' color='darkblue' size='+1'>You have added the following contents to your cart:\n");
      out.write("</font>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("    <table cellspacing='10' align='center'border='2' bordercolor='black'>\n");
      out.write("<tr><td bordercolor='white'>Destination:<td COLSPAN='2'bordercolor='white'>");
out.println(session.getAttribute("selDestination").toString()); 
      out.write("\n");
      out.write("<tr><td bordercolor='white'>Hotel:<td COLSPAN='2' bordercolor='white'>");
out.println(session.getAttribute("selHotel").toString());
      out.write("\n");
      out.write("<tr><td bordercolor='white'>Total number of days for stay:<td bordercolor='white'>");
out.println(session.getAttribute("numDays").toString());
      out.write("\n");
      out.write("<tr><td bordercolor='white'>Airline:<td bordercolor='white'>");
out.println(session.getAttribute("selAirline").toString());
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
