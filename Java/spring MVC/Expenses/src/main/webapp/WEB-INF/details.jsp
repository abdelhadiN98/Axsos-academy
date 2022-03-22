<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<style>
body {
	margin:60px 0px 0px 50px;
	font-family: cursive;
}
p {
	font-size: 22px;
}
</style>
</head>
<body>
	<h1 style="color: blue;">Expense Details <a href="/expenses">Go Back</a></h1>
	<p>Expense Name :<c:out value="${details.name }"></c:out></p>
	<p>Expense Description : <c:out value="${details.description }"></c:out></p>
	<p>Vendor : <c:out value="${details.vendor }"></c:out></p>
	<p>Amount Spent : $ <c:out value="${details.amount }"></c:out></p>
	
	
</body>
</html>