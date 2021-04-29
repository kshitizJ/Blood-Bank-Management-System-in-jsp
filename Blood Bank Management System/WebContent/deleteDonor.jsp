<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@include file="header.html"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	try{
		Connection con = ConnectionProvider.getCon();
		Statement st = con.createStatement();
		st.executeUpdate("delete from donor where id = "+id+" ;");
		response.sendRedirect("editDeleteList.jsp?msg=deleted");
	} catch (Exception e) {
		response.sendRedirect("editDeleteList.jsp?msg=invalid");
		System.out.println(e.getMessage());
	}
%>