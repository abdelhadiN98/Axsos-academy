<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1 style="margin: 20px 0px 50px 50px;">${dojo.name}  Location Ninjas</h1>
	
	<table class="table table-striped mx-5" style="width: 900px">
  <thead>
  
    <tr>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach var = "ninja" items = "${dojo.ninjas }">
    <tr>
      <th scope="row">${ninja.firstName}</th>
      <th scope="row">${ninja.lastName}</th>
      <th scope="row">${ninja.age}</th>
    </tr>
    </c:forEach>
 
  </tbody>
</table>
</body>
</html>