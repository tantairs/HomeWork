<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../favicon.ico">

	<title>Sign in &#151; Tongji BANK</title>

	<!-- Bootstrap core CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="bootstrap/css/main.css" rel="stylesheet">
  </head>
  <body>

  	<body class="sign">
  		<div class="container-fluid">
  			<div class="row">
  				<div class=" col-md-4 sidebar text-center">
  					<div class="top50p">
  						<h1>Tongji <em>BANK</em></h1>
  					</div>
  					<form class="form-horizontal col-md-9 top50" role="form" action="LoginServlet" method="POST">
  						<div class="form-group">
  							<div class="col-sm-offset-2 col-sm-12">
  								<input type="text" class="form-control" id="username" name="un" placeholder="Username" autocomplete="off" onkeypress="check_values();" autocomplete="off">
  								<input type="password" class="form-control" id="password" name="pw" placeholder="Password" onkeypress="check_values();" autocomplete="off">
  								<button type="submit" class="btn btn-default login-btn">Sign in</button>
  							</div>
  						</div>
  					</form>
  					<div class="col-sm-offset-2 col-sm-7 bott">
  						<ul class="list-inline bott-border">
  							<li class="#"><a href="#">Help</a></li>
  							<li class="col-sm-offset-1"><a href="#">Contact</a></li>
  							<li class="col-sm-offset-1"><a href="#">Blog</a></li>
  						</ul>
  					</div>
  				</div>
  			</div>
  			<div class="col-sm-1 col-sm-offset-1 col-md-5 col-md-offset-1 main">
  				<h1><strong>Quick, safe and convenient</strong>
  					<br><small>&#151; Online Banking made easy</small></h1>
  				</div>
  			</div>
  		</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="bootstrap/js/jquery-1.11.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap/js/docs.min.js"></script>
    <script type="text/javascript">
    jQuery(function ($) {
    	function check_values() {
    		if ($("#username").val().length != 0 && $("#password").val().length != 0) {
    			$("#button1").removeClass("hidden").animate({ left: '250px' });
    			$("#lock1").addClass("hidden").animate({ left: '250px' });
    		}
    	}
    });
    </script>
</body>
</html>