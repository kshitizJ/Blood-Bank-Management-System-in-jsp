<!DOCTYPE html>
<html lang="en">

<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css" type="text/css" media="screen">
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img class="logo img-fluid"
				src="Logo1.png"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-end"
				id="navbarNav">
				<ul class="navbar-nav ">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
					<li class="nav-item"><a
						class="nav-link btn btn-outline-danger active"
						href="adminLogin.jsp">Admin Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12">
				<%
					String msg = request.getParameter("msg");
				if ("invalid".equals(msg)) {
				%>
				<p class="text-centre text-danger">Invalid username or password,
					please try again..</p>
				<%
					}
				%>
			</div>
			<div class="col-12">
				<h1 class="text-center text-uppercase">Admin Panel</h1>
			</div>
			<div class="col-12">
				<form class="row d-flex justify-content-center"
					action="adminLoginAction.jsp" method="POST">
					<div class="mb-3 col-md-3">
						<label for="uname" class="form-label">Username</label> <input
							type="text" class="form-control" id="uname" name="uname">
					</div>
					<div class="mb-3 col-md-3">
						<label for="pass" class="form-label">Password</label> <input
							type="password" class="form-control" id="pass" name="pass">
					</div>
					<div class="offset-md-3"></div>
					<button type="submit" class="btn btn-primary col-3">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>

</html>