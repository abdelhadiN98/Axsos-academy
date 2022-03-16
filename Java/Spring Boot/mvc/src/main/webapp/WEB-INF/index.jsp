<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
margin-left: 50px

}
</style>
</head>
<body>
	<p>Book Title : <h1>${book.title}</h1></p>
		<p>Book Description : <h2>${book.description}</h2></p>
			<p> Book Language :<h3>${book.language}</h3></p>
	<p> Pages : <h4>${book.numberOfPages}</h4></p>


</body>
</html>