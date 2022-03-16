<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1>All Books</h1>
<table class="table table-striped">
  <thead>
  
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Title</th>
      <th scope="col">Language</th>
      <th scope="col">N. Of Pages</th>
    </tr>
  </thead>
  <tbody>
  	
  	
  	<c:forEach var="books" items="${books}">
    <tr>
      <th scope="row"><c:out value="${books.id}"></c:out></th>
      <td><c:out value="${books.title}"></c:out></td>
      <td><c:out value="${books.language}"></c:out></td>
      <td><c:out value="${books.numberOfPages}"></c:out></td>
    </tr>
</c:forEach>
  </tbody>
</table>

</body>
</html>