<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
h1 {
	color: #9900ff;
	margin: 30px 0px 0px 30px;
}
p {
	margin: 30px 0px 0px 30px;
}
a {
	margin: 0px 0px 0px 30px;
}
</style>
</head>
<body>
	<h1>Welcome  , ${thisUser.userName } !</h1>
	<p>This is your dashboard , Nothing to see here yet !</p>
	<a href="/logout">Log out</a>
</body>
</html>