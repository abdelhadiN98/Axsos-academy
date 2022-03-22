<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1 style="color: blue;">Save Travels</h1>
	<table class="table table-striped" style="width: 900px">
  <thead>
  
    <tr>
      <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  	
  	<c:forEach var = "travel" items = "${travel }">
    <tr>
      <th scope="row"><a href="/expenses/${travel.id}"><c:out value="${travel.name }"></c:out></a></th>
      <th scope="row"><c:out value="${travel.vendor }"></c:out></th>
      <th scope="row"><c:out value="${travel.amount }"></c:out></th>
      <th scope="row"><p><a href="/expenses/edit/${travel.id}">Edit</a>
      	<form:form action="/delete/${travel.id}" method="post" modelAttribute="travels">
	<input type="hidden" name="_method" value="delete">
      <button type="submit" class="btn btn-danger" style="margin-left: 20px">Delete</button>
      </form:form> </p>
      </th>
      

    </tr>
    </c:forEach>
  </tbody>
</table>


<h2 style="color: blue;">Add an expense : </h2> 
<form:form action="/create" method="post" modelAttribute="travels">
    <p>
        <form:label path="name">Expense</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>  
        <form:textarea path="description"/>   
        
    </p>    
    <input type="submit" value="Submit"/>
</form:form>  

  

</body>
</html>