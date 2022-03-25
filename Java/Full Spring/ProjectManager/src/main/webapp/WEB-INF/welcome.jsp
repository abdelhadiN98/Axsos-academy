<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Manager Dashboard</title>
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
	<a href="/logout">Log out</a>
	<a href="/projects/new"><button>+ New Project</button></a>
	
	<p>All projects</p>
	<table class="table table-striped mx-5" style="width: 900px">
  <thead>
  
    <tr>
      <th scope="col">Project</th>
      <th scope="col">Team Lead</th>
      <th scope="col">Due Date</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var = "project" items = "${allProjects }">
    <tr>
      <th scope="row"><a href="/projects/${project.id }">${project.title }</a></th>
      <th scope="row">${project.user.userName}</th>
      <th scope="row">${project.duedate }</th>
      <th scope="row"><a href="join/${project.id }">Join Team</a></th>
    </tr>
    </c:forEach>
  </tbody>
</table>

<p>Your Projects</p>
<table class="table table-striped mx-5" style="width: 900px">
  <thead>
    <tr>
      <th scope="col">Project</th>
      <th scope="col">Lead</th>
      <th scope="col">Due Date</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var = "project" items = "${allProjectsTable2 }">
    <tr>
      <th scope="row"><a href="/projects/${project.id }">${project.title }</a></th>
      <th scope="row">${project.user.userName }</th>
      <th scope="row">${project.duedate }</th>
      <c:choose>
      <c:when test="${thisUser.id == project.user.id}"><th scope="row"><a href="/projects/edit/${project.id }">Edit</a></th></c:when>
      <c:otherwise><th scope="row"><a href="/leave/${project.id }">Leave Team</a></th></c:otherwise>
      </c:choose>
    </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>