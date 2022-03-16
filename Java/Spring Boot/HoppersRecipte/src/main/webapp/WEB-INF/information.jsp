<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Receipt</title>
</head>
<body>
	<h1>Customer Name :<c:out value="${name}"></c:out></h1>
	<p>item Name :<c:out value="${itemName}"></c:out><p>
	<p>price :<c:out value="${price}"></c:out><p>
	<p>description :<c:out value="${description}"></c:out><p>
	<p>vendor :<c:out value="${vendor}"></c:out><p>
</body>
</html>