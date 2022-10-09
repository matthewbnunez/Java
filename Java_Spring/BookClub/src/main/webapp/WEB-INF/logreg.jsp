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
<title>Book Club Login/Registration</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<h1>Register</h1>
		<form:form action="/register" method="POST" modelAttribute="newUser">
			<div>
				<form:label path="userName">User Name:</form:label>
				<form:input path="userName" />
				<form:errors path="userName" />
			</div>
			<div>
				<form:label path="email">Email:</form:label>
				<form:input path="email" />
				<form:errors path="email" />
			</div>
			<div>
				<form:label path="password">Password:</form:label>
				<form:input path="password" type="password" />
				<form:errors path="password" />
			</div>
			<div>
				<form:label path="confirm">Confirm password:</form:label>
				<form:input path="confirm" type="password" />
				<form:errors path="confirm" />
			</div>
			<button type="submit">Register</button>
		</form:form>
		<h1>Login</h1>
		<form:form action="/login" method="POST" modelAttribute="newLogin">
			<div>
				<form:label path="email">Email:</form:label>
				<form:input path="email" />
				<form:errors path="email" />
			</div>
			<div>
				<form:label path="password">Password:</form:label>
				<form:input path="password" type="password" />
				<form:errors path="password" />
			</div>
			<button type="submit">Login</button>
		</form:form>
	</div>
</body>
</html>