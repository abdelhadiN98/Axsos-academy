<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Project Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
	body {
	margin: 30px 0px 0px 60px;
}
</style>
</head>
<body>
<h1>Create a Project</h1>
<form:form action="/createProject" method="post"  modelAttribute="project">
	<div class="row">
	<div class="col-auto">
  <div class="row">
    <form:label path="title"  class="col-form-label">Project Title </form:label>
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
  <div>
  <button type="submit" class="btn btn-primary mt-3">Create</button>
  </div>
    </form:form>
    <div>
    <a href="/home"> <button class="btn btn-primary mt-3">Cancel</button></a>
    </div>
</body>
</html>