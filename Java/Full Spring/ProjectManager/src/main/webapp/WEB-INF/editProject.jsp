<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Project</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
	body {
	margin: 30px 0px 0px 60px;
}
</style>
</head>
<body>
<h1>Edit Project</h1>
<div class="row">
	<div class="col">
		<form:form action="/edit/${projects.id }" method="post"  modelAttribute="project">
		<input type="hidden" name="_method" value="put">
	<div class="row">
	<div class="col-auto">
  <div class="row">
    <form:label path="title"  class="col-form-label">Title </form:label>
  </div>
  <form:errors path="title"/>
  <div class="row">
    <form:input path="title"  class="form-control" aria-describedby="nameHelpInline"/>
  </div>
   <div class="row">
    <form:label path="description"  class="col-form-label">Project Description </form:label>
  </div>
  <form:errors path="description"/>
  <div class="row">
    <form:input path="description"  class="form-control" aria-describedby="emailHelpInline"/>
  </div>
   <div class="row">
    <form:label path="duedate"  class="col-form-label">Due Date </form:label>
  </div>
  <form:errors path="duedate"/>
  <div class="row">
    <form:input type="date" path="duedate"  class="form-control" aria-describedby="emailHelpInline"/>
  </div>
  <button type="submit" class="btn btn-primary mt-3">Edit</button>
  </form:form>



</body>
</html>