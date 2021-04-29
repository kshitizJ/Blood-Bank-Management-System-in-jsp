<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@include file="header.html"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
	<br>
	<h1 class="text-center">List Of Donors</h1>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12">
				<%
					String msg = request.getParameter("msg");
				if ("valid".equals(msg)) {
				%>
				<p class="text-center text-danger">Donor details were updated..</p>
				<%
					}
				if ("invalid".equals(msg)) {
				%>
				<p class="text-center text-danger">Invalid data try again..</p>
				<%
					}
				if ("deleted".equals(msg)) {
				%>
				<p class="text-center text-danger">Successfully deleted the data..</p>
				<%
					}
				%>
			</div>
			<div class="col-12">
				<table class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Father name</th>
							<th scope="col">Mother Name</th>
							<th scope="col">Number</th>
							<th scope="col">Gender</th>
							<th scope="col">Email</th>
							<th scope="col">Blood Group</th>
							<th scope="col">Address</th>
							<th scope="col">Date</th>
							<th scope="col">Edit</th>
							<th scope="col">Delete</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<%
								try {
								Connection con = ConnectionProvider.getCon();
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select * from donor;");
								while (rs.next()) {
							%>
							<td><%=rs.getInt(1)%></td>
							<td><%=rs.getString(2)%></td>
							<td><%=rs.getString(3)%></td>
							<td><%=rs.getString(4)%></td>
							<td><%=rs.getString(5)%></td>
							<td><%=rs.getString(6)%></td>
							<td><%=rs.getString(7)%></td>
							<td><%=rs.getString(8)%></td>
							<td><%=rs.getString(9)%></td>
							<td><%=rs.getDate(10)%></td>
							<td><a class="btn btn-warning"
								href="updateDonor.jsp?id=<%=rs.getInt(1)%>">Edit</a></td>
							<td><a class="btn btn-danger"
								href="deleteDonor.jsp?id=<%=rs.getInt(1)%>">Delete</a></td>
						</tr>
						<%
							}
						} catch (Exception e) {
						System.out.print(e.getMessage());
						}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>