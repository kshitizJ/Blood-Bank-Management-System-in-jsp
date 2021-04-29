<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String fname = request.getParameter("fname");
	String mname = request.getParameter("mname");
	String number = request.getParameter("number");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	String brgp = request.getParameter("brgp");
	String address = request.getParameter("address");
	try {
		Connection con = ConnectionProvider.getCon();
		PreparedStatement preparedStatement = con.prepareStatement(
		"update donor set name=?, father=?, mother=?, mobile_no=?, gender=?, email=?, bloodgroup=?, address=? where id = "+id+" ;");
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, fname);
		preparedStatement.setString(3, mname);
		preparedStatement.setString(4, number);
		preparedStatement.setString(5, gender);
		preparedStatement.setString(6, email);
		preparedStatement.setString(7, brgp);
		preparedStatement.setString(8, address);
		preparedStatement.executeUpdate();
		response.sendRedirect("editDeleteList.jsp?msg=valid");
	} catch (Exception e) {
		response.sendRedirect("editDeleteList.jsp?msg=invalid");
		System.out.println(e.getMessage());
	}
%>