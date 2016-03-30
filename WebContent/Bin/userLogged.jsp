<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="User.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Logged Successfully</title>
</head>
<body>
	<center>
		<!-- Creates a new UserBean and it assigns to UserBean the user (currentSessionUser) saved in LoginServlet.java -->
		<% UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));%>
		Welcome
		<%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
	</center>
</body>
</html>