<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Travel Plan</h1>
	<c:out value="${expense.name}"></c:out>
	<c:out value="${expense.vendor}"></c:out>
	<c:out value="${expense.amount}"></c:out>
	<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td><c:out value="${expense.name}"></c:out></td>
				<td><c:out value="${expense.vendor}"></c:out></td>
				<td><c:out value="${expense.amount}"></c:out></td>
				<td><a href="/edit/${expense.id}">edit</a></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
	<h1>Add an expense:</h1>
	<form:form action="/expenses" method="post" modelAttribute="expense">
	
		<div>
			<form:label path="name">Expense Name: </form:label><br />
			<form:errors path="name"/>
			<form:input path="name"/>
		</div>
	
		<div>
			<form:label path="vendor">Vendor: </form:label><br />
			<form:errors path="vendor"/>
			<form:input path="vendor"/>
		</div>
		
		<div>
			<form:label path="amount">Amount: </form:label><br />
			<form:errors path="amount"/>
			<form:input type="double" path="amount"/>
		</div>
		
		<div>
			<form:label path="description">Description: </form:label><br />
			<form:errors path="description"/>
			<form:textarea rows="3" path="description"/>
		</div>
		
		<div>
			<input type="submit" value="Submit"/>
		</div>
	</form:form>
</body>
</html>