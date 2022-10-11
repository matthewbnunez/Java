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
<title>One Book</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td>Title:</td>
				<td>${book.title}</td>
			</tr>
			<tr>
				<td>Author:</td>
				<td>${book.author}</td>
			</tr>
			<tr>
				<td>Posted By:</td>
				<td>${book.user.userName}</td>
			</tr>
		</table>
		<a href="/books">Home</a>
	</div>
</body>
</html>