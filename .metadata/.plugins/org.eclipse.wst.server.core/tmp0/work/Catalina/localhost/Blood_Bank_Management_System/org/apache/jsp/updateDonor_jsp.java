/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-04-28 11:41:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class updateDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.html", Long.valueOf(1619605900683L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("project.ConnectionProvider");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Admin Panel</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar sticky-top navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"home.jsp\">Home</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("\t\t\t\tdata-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbarNav\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse justify-content-end\"\r\n");
      out.write("\t\t\t\tid=\"navbarNav\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav \">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"editDeleteList.jsp\">List of Donors</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn btn-danger\"\r\n");
      out.write("\t\t\t\t\t\thref=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</body>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<h1 class=\"text-center\">Update Donor Details</h1>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t");

					int id = Integer.parseInt(request.getParameter("id"));
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from donor where id = " + id + ";");
					while (rs.next()) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<form class=\"form row d-flex justify-content-center\"\r\n");
      out.write("\t\t\t\t\taction=\"updateDonorAction.jsp\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"id\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
out.print(id);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"name\" class=\"form-label\">Full Name</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString(2));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"name\" name=\"name\" placeholder=\"Full Name\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"fname\" class=\"form-label\">Father Name</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString(3));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"fname\" name=\"fname\" placeholder=\"Father Name\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"mname\" class=\"form-label\">Mother Name</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString(4));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"mname\" name=\"mname\" placeholder=\"Mother Name\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"number\" class=\"form-label\">Number</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString(5));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"number\" name=\"number\" placeholder=\"Mobile Number\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"gender\" class=\"form-label\">Gender</label> <select\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-select\" id=\"gender\" name=\"gender\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Choose...</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								if ("Male".equals(rs.getString(6))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"Male\">Male</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Male\">Male</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("Female".equals(rs.getString(6))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"Female\">Female</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Female\">Female</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("Others".equals(rs.getString(6))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"Others\">Others</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Others\">Others</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"form-label\">Email address</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"email\" class=\"form-control\" id=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(rs.getString(7));
      out.write("\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"name@example.com\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"brgp\" class=\"form-label\">Blood Group</label> <select\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-select\" id=\"brgp\" name=\"brgp\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Choose...</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								if ("A+".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"A+\">A+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"A+\">A+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("A-".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"A-\">A-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"A-\">A-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("B+".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"B+\">B+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B+\">B+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("B-".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"B-\">B-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B-\">B-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("O+".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"O+\">O+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"O+\">O+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("O-".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"O-\">O-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"O-\">O-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("AB+".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"AB+\">AB+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"AB+\">AB+</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							if ("AB-".equals(rs.getString(8))) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"AB-\">AB-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"AB-\">AB-</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"form-label\">Address</span>\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" aria-label=\"With textarea\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"address\">");
      out.print(rs.getString(9));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary col-3\">Update</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");

					}
				} catch (Exception e) {
				System.out.println(e.getMessage());
				}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
