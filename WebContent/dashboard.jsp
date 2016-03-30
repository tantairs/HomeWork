<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="User.UserBean" 
import="java.util.ArrayList" import="DBViews.DBViews" import="History.HistoryBean" import="History.HistoryDAO"
import="Account.AccountDAO" import="Account.AccountBean"
%>


<% UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));%>

<% 
	//ArrayList that contains all the account numbers for the current user
	ArrayList <String> a_numberList = DBViews.getCustomerA_number (currentUser.getUsername());
			
	//Account Summary
	ArrayList <AccountBean> listAccountBean = new ArrayList <AccountBean>();
	System.out.println("**************************");
	for (int i=0; i<a_numberList.size(); i++) {
		listAccountBean.add(new AccountBean());
		listAccountBean.add(AccountDAO.getAccount(listAccountBean.get(i), a_numberList.get(i)));		
		System.out.println(listAccountBean.get(i).getA_number() + ": " + listAccountBean.get(i).getAmount());
	}
	System.out.println("**************************");
	
		
	
			
	//Login History. historyBean contains all the login information about the current user
	HistoryBean historyBean = new HistoryBean();
	HistoryDAO.getHistory(historyBean, currentUser.getUsername()); 
	//methods the get the history information:
	historyBean.getWrong_login_attempt();
	historyBean.getCurrentLoginTime();
	historyBean.getLastLoginTime();
	historyBean.getLastLoginWrong();
	historyBean.getLastPswChangeTime();
	
%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../favicon.ico">

	<title>My dashboard &#151; Tongji BANK</title>

	<!-- Bootstrap core CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="bootstrap/css/main.css" rel="stylesheet">
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Tongji <em>BANK</em></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><p class="navbar-text">Welcome <a href="#"><%= currentUser.getUsername()%></a></p></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Your settings</a></li>
							<li><a href="#">Your subscription</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li><a href="#">Support</a></li>
							<li class="divider"></li>
							<li><a href="#"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 main">
				<div class="col-md-4">
					<!-- Split button -->
					<div class="btn-group">
						<button type="button" class="btn btn-default">Account: </button>
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
							<span class="caret"></span>
							<span class="sr-only">Toggle Dropdown</span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-8">
					<ul class="nav nav-tabs nav-justified">
						<li role="presentation" class="active"><a href="history.jsp">History</a></li>
						<li role="presentation"><a href="beneficiary.jsp">Beneficiary</a></li>
						<li role="presentation"><a href="loan.jsp">Loans</a></li>
						<li role="presentation"><a href="transaction.jsp">Transactions</a></li>
						<li role="presentation"><a href="bill.jsp">Bills</a></li>
					</ul>
				</div>
			</div>  
			<div class="col-md-4 main">
				<h2 class="sub-header">Login history</h2>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Attributes</th>
								<th>#</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Current login</td>
								<td>20.08.2014</td>
							</tr>
							<tr>
								<td>Last login</td>
								<td>12.08.2014</td>
							</tr>
							<tr>
								<td>Last password change</td>
								<td>12.08.2014</td>
							</tr>
							<tr>
								<td>Wrong login attempt number</td>
								<td>1</td>
							</tr>
							<tr>
								<td>Wrong login attempt time</td>
								<td>12.08.2014</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-4 main">
				<h2 class="sub-header">Account Information</h2>
			</div>
			<div class="col-md-4 main">
				<h2 class="sub-header">Account Information</h2>
			</div>	
		</div>
	</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="bootstrap/js/jquery-1.11.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap/js/docs.min.js"></script>
</body>
</html>