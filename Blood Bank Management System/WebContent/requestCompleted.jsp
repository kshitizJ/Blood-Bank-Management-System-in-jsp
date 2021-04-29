<%@page import="java.sql.*"%>
<%@page import="project.ConnectionProvider"%>
<%@include file="header.html"%>
<!DOCTYPE html>
<html lang="en">

<head>
<style>
.container {
	margin-top: 25px;
}
.table{
	margin-top: 20px;
}
</style>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h1 class="text-center">Request For Blood Completed</h1>
			</div>
			<div class="col-12">
				<table class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Number</th>
							<th scope="col">Email</th>
							<th scope="col">Blood Group</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<%
								try {
								Connection con = ConnectionProvider.getCon();
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select * from bloodrequest where status = 'completed';");
								while (rs.next()) {
							%>
							<td><%=rs.getString(1)%></td>
							<td><%=rs.getString(2)%></td>
							<td><%=rs.getString(3)%></td>
							<td><%=rs.getString(4)%></td>
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