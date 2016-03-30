<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add beneficiary</title>
</head>

<body>
<body>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-12">
				<form class="form-horizontal col-md-9 top50p" role="form"
					method="post" action="AddBenefitiaryServlet">
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-12">
							<input type="text" class="form-control" name="an"
								id="account_number" placeholder="Account Number"> <input
								type="text" class="form-control" name="ban"
								id="beneficiary_account_number"
								placeholder="Beneficiary Account Number"> <input
								type="text" class="form-control" name="bn" id="bank_name"
								placeholder="Bank Name"> <input type="text"
								class="form-control" name="li" id="limit" placeholder="Limit">
							<input type="text" class="form-control" name="na" id="name"
								placeholder="Name">
							<button type="submit" class="btn btn-default login-btn">Send</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>