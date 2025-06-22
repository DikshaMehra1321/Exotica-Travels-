package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeCustomerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Customer Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("<tr>\n");
      out.write("<td bgcolor='#000080' align='center'>\n");
      out.write("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>\n");
      out.write("</td>\n");
      out.write("<td bgcolor='#000080' align='left' width='180'>\n");
      out.write("<img src='Images/CompanyLogo.png' width='180' height='120' align='right'/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='response.encodeURL(\"ConstructionPage.jsp\")'>Domestic Flights</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='ConstructionPage.jsp '>International Flights</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='ConstructionPage.jsp '>Hotels</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='ConstructionPage.jsp'>Car Rentals</a></td>\n");
      out.write("<td><font color='darkblue' size='+1'><a href='TourPackage.jsp'>Tour Packages</a></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<font color='darkblue' size='+2'>Welcome to the Exotica Travels Website!!</font>\n");
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
