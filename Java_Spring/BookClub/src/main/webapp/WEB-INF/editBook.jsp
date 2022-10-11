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
<title>Edit Book</title>
</head>
<body>
	<div>
		<h1>Edit Book</h1>
		<form:form action="/books/edit/${book.id}" method="POST" modelAttribute="book">
			<input type="hidden" name="_method" value="put" />
			<p>
				<form:label path="title">Title: </form:label>
				<form:input path="title" />
				<form:errors style="color:red" path="title" />
			</p>
			<p>
				<form:label path="author">Author: </form:label>
				<form:input path="author" />
				<form:errors style="color:red" path="author" />
			</p>
			<form:hidden path="user" />
			<button type="submit">Edit</button>
		</form:form>
	</div>
</body>
</html>