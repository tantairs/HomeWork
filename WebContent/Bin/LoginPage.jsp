<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<title>Login Page</title>
</head>
<body>

	<!-- NO BOOTSTRAP ***********************************************
		<form action="LoginServlet"> 
			Please enter your username <input type="text" name="un"/>
			<br> 
			Please enter your password <input type="text" name="pw"/> 
			<input type="submit" value="submit"> 
		</form>
		**************************************************************** -->


	<form class="navbar-form navbar-left" role="search"
		action="LoginServlet">
		<div class="form-group">
			<input type="text" name="un" class="form-control"
				placeholder="Username">
		</div>
		<br>
		<div class="form-group">
			<input type="text" name="pw" class="form-control"
				placeholder="Password">
		</div>
		<button type="submit" value="submit" class="btn btn-default">Submit</button>
	</form>

</body>
</html>