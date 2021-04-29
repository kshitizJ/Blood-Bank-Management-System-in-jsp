<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="project.ConnectionProvider"%>
<%@include file="header.html"%>
<!DOCTYPE html>
<html lang="en">

<head>
<style>
.container {
	margin-top:25px;
}

.form {
	margin-top: 20px;
}
</style>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<%
					String msg = request.getParameter("msg");
				if ("valid".equals(msg)) {
				%>
				<p class="text-center text-danger">Your request was submitted
					successfully..</p>
				<%
					}
				if ("invalid".equals(msg)) {
				%>
				<p class="text-center text-danger">Invalid data try again..</p>
				<%
					}
				%>
				<h1 class="text-center">Enter Donor Details</h1>
			</div>
			<div class="col-12">
				<%
					int id = 1;
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
				Date date = new Date(System.currentTimeMillis());
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					ResultSet rs = st.executeQuery("select max(id) from donor;");
					if (rs.first()) {
						System.out.println();
						id = rs.getInt(1);
						id = id + 1;
					}
				%>
				<h3 class="text-center text-danger">
					Donor ID:
					<%
					out.print(id);
				%>
				</h3>
			</div>
			<%
				} catch (Exception e) {
			System.out.println(e.getMessage());
			}
			%>
			<div class="col-12">
				<form class="form row d-flex justify-content-center"
					action="addNewDonorAction.jsp" method="POST">
					<input type="hidden" class="form-control" name="id"
						value="<%out.print(id);%>">
					<div class="mb-3 col-md-3">
						<label for="name" class="form-label">Full Name</label> <input
							type="text" class="form-control" id="name" name="name"
							placeholder="Full Name">
					</div>
					<div class="mb-3 col-md-3">
						<label for="fname" class="form-label">Father Name</label> <input
							type="text" class="form-control" id="fname" name="fname"
							placeholder="Father Name">
					</div>
					<div class="mb-3 col-md-3">
						<label for="mname" class="form-label">Mother Name</label> <input
							type="text" class="form-control" id="mname" name="mname"
							placeholder="Mother Name">
					</div>
					<div class="mb-3 col-md-3">
						<label for="number" class="form-label">Number</label> <input
							type="text" class="form-control" id="number" name="number"
							placeholder="Mobile Number">
					</div>
					<div class="mb-3 col-md-3">
						<label for="gender" class="form-label">Gender</label> <select
							class="form-select" id="gender" name="gender">
							<option selected>Choose...</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Others">Others</option>
						</select>
					</div>
					<div class="mb-3 col-md-3">
						<label for="email" class="form-label">Email address</label> <input
							type="email" class="form-control" id="email" name="email"
							placeholder="name@example.com">
					</div>
					<div class="mb-3 col-md-3">
						<label for="brgp" class="form-label">Blood Group</label> <select
							class="form-select" id="brgp" name="brgp">
							<option selected>Choose...</option>
							<option value="A+">A+</option>
							<option value="A-">A-</option>
							<option value="B+">B+</option>
							<option value="B-">B-</option>
							<option value="O+">O+</option>
							<option value="O-">O-</option>
							<option value="AB+">AB+</option>
							<option value="AB-">AB-</option>

						</select>
					</div>
					<div class="mb-3 col-md-3">
						<span class="form-label">Address</span>
						<textarea class="form-control" aria-label="With textarea"
							name="address"></textarea>
					</div>
					<input type="hidden" class="form-control"
						value="<%out.print(date);%>"
						name="date">
					<button type="submit" class="btn btn-primary col-3">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>