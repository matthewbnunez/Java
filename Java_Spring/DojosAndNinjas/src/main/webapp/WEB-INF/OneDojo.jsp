<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Details</title>
</head>
<body>
	<div class="container mt-5">
		<h1> <c:out value="${dojo.name}" /></h1>
		<table>
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="eachNinja" items="${dojo.ninjas}">
				<tr>
					<td> ${eachNinja.firstName}</td>
					<td> ${eachNinja.lastName}</td>
					<td> ${eachNinja.age}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
   </div>
</body>
</html>