<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1>Fruit Stores</h1>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="onefruit" items="${fruits}"></c:forEach>
    <tr>
      <th scope="row">1</th>
      <td><c:out value="${onefruit.name}"></c:out></td>
      <td><c:out value="${onefruit.price}"></c:out></td>
    </tr>
    <tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>