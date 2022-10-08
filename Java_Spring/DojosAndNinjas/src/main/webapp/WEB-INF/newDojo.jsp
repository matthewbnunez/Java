<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojos</title>
</head>
<body>
	<div>
	<h1>New Dojo</h1>
	<form:form action="/dojos/process" method="POST" modelAttribute="newDojo">
		<p>
			<form:label path="name">Name: </form:label>
			<form:input path="name" />
			<form:errors style="color:red" path="name" />
		</p>	
		<button type="submit">Create</button>
	</form:form>
	</div>
</body>
</html>