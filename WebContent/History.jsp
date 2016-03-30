<!--  
TO DO:
-Get user session like in userLogged2 JUST AFTER <body>
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="User.UserBean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="font-awesome/css/font-awesome.min.css" />

<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<style>
#container1 {
	margin-bottom: 120px;
	padding: 20px;
	background-color: #f5f5f5;
}

div.skill {
	background: #5cb85c;
	border-radius: 3px;
	color: white;
	font-weight: bold;
	padding: 3px 4px;
	width: 70px;
}

.skillLine {
	display: inline-block;
	width: 100%;
	min-height: 90px;
	padding: 3px 4px;
}

skillLineDefault {
	padding: 3px 4px;
}
</style>

<!-- you need to include the shieldui css and js assets in order for the charts to work -->
<link rel="stylesheet" type="text/css"
	href="https://www.shieldui.com/shared/components/latest/css/shieldui-all.min.css" />
<link rel="stylesheet" type="text/css"
	href="https://www.shieldui.com/shared/components/latest/css/light/all.min.css" />
<script type="text/javascript"
	src="https://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>

</head>

<body>

	<center>
		<!-- Creates a new UserBean and it assigns to UserBean the user (currentSessionUser) saved in LoginServlet.java -->

	</center>

	<div class="container">

		<div class="page-header">
			<h1>
				History <small>Login History</small>
			</h1>
		</div>


		<div class="container" id="container1">
			<div class="col-md-4"></div>

			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="text-center">
							<% UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));%>
							<%= currentUser.getUsername()%>
							<span class="glyphicon glyphicon-saved pull-right"></span>
						</h4>
					</div>
					<div class="panel-body text-center">
						<p class="lead">
							<strong>History</strong>
						</p>
					</div>
					<ul class="list-group list-group-flush text-center">
						<li class="list-group-item">
							<div class="skillLineDefault">
								<div class="skill pull-left text-center">Current</div>

							</div>
						</li>
						<li class="list-group-item text-center">
							<div class="skillLineDefault">
								<div class="skill pull-left text-center">Last</div>

							</div>
						</li>
						<li class="list-group-item text-center">
							<div class="skillLineDefault">
								<div class="skill pull-left text-center">Last psw</div>

							</div>
						</li>
						<li class="list-group-item text-center">
							<div class="skillLineDefault">
								<div class="skill pull-left text-center">Wrong Log</div>

							</div>
						</li>
					</ul>
					<div class="panel-footer text-center">
						<button type="button" class="btn btn-primary btn-lg btn-block">
							Home</button>
					</div>
				</div>
			</div>
		</div>




	</div>


</body>
</html>