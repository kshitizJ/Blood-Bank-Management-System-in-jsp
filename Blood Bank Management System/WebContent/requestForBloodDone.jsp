<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
	String number = request.getParameter("number");
try {
	Connection con = ConnectionProvider.getCon();
	PreparedStatement preparedStatement = con
	.prepareStatement("update bloodrequest set status='completed' where mobile_no = ? ;");
	preparedStatement.setString(1, number);
	preparedStatement.executeUpdate();
	response.sendRedirect("requestForBlood.jsp?msg=valid");
} catch (Exception e) {
	response.sendRedirect("requestForBlood.jsp?msg=invalid");
	System.out.println(e.getMessage());
}
%>