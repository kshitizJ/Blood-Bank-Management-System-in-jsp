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
	Date date = Date.valueOf(request.getParameter("date"));
	try{
		Connection con = ConnectionProvider.getCon();
		PreparedStatement preparedStatement = con.prepareStatement("insert into donor values(?,?,?,?,?,?,?,?,?,?);");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, fname);
		preparedStatement.setString(4, mname);
		preparedStatement.setString(5, number);
		preparedStatement.setString(6, gender);
		preparedStatement.setString(7, email);
		preparedStatement.setString(8, brgp);
		preparedStatement.setString(9, address);
		preparedStatement.setDate(10, date);
		preparedStatement.executeUpdate();
		response.sendRedirect("addNewDonor.jsp?msg=valid");	
	} catch (Exception e){
		response.sendRedirect("addNewDonor.jsp?msg=invalid");	
		System.out.println(e.getMessage());
	}
%>