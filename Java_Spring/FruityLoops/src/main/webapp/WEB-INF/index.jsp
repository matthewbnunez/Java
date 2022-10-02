<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="table table-striped table-hover">
		<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
			<c:forEach var="oneItem" items="${itemsFromItemController}">
				<tr>
					<td><c:out value="${oneItem.name}"></c:out></td>
					<td><c:out value="${oneItem.price}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>