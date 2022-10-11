<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Club Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<h1>Welcome, ${userName}</h1>
		<p><a href="/books/new">+ Add to my shelf!</a></p>
		<p><a href="/logout">Logout</a></p>
		<table class="table">
			<thead>
				<tr>
					<th> ID </th>
					<th> Title </th>
					<th> Author </th>
					<th> Posted By </th>
					<th colspan=2> Actions </th> 
				</tr>
			</thead>
			<tbody>
				<c:forEach var="eachBook" items="${bookList}">
					<tr>
						<td>${eachBook.id} </td>
						<td> 
						<a href="/books/${eachBook.id}">
						<c:out value="${eachBook.title}"/></a>
						</td>
						<td> ${eachBook.author}</td>
						<td> <c:out value="${eachBook.user.userName}" /></td>
						<td>
						<a href="/books/edit/${eachBook.id}" >Edit</a>
						</td>
						<td>
						<form action="/books/delete/${eachBook.id}" method="POST">
							<input type="hidden" name="_method" value="delete" />
							<button type="submit">Delete</button>
						</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table> 
	</div>
</body>
</html>