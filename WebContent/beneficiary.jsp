<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Beneficiary</title>

<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="bootstrap/css/main.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="bootstrap/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->
</head>

<body>
	<!-- Steps Navigation - START -->
	<div class="container" style="margin-top: 100px; margin-bottom: 100px;">
		<div class="row">
			<div class="row step">

				<div class="col-md-2">
					<form action="addbeneficiary.jsp" target="_self">
						<input type="submit" value="Add benefit">
					</form>
				</div>

				<div class="col-md-2">
					<form action="editBeneficiary.jsp" target="_self">
						<input type="submit" value="Edit benefit">
					</form>
				</div>

				<div class="col-md-2">
					<form action="removeBeneficiary.jsp" target="_self">
						<input type="submit" value="Remove benefit">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>