<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
	String name = request.getParameter("uname");
	String pass = request.getParameter("pass");
	if("admin".equals(name) && "admin".equals(pass)){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("adminLogin.jsp?msg=invalid");
	}
%>