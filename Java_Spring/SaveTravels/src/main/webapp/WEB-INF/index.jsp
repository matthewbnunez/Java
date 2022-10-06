<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Travel Plan</h1>
	<p><c:out value="${expense.name}"></c:out></p>
	<p><c:out value="${expense.vendor}"></c:out></p>
	<p><c:out value="${expense.amount}"></c:out></p>
	<p><c:out value="${expense.description}"></c:out></p>
	<h1>Add an expense:</h1>
	<form:form action="/expenses" method="post" modelAttribute="expense">
	
		<div>
			<form:label path="name">Expense Name: </form:label><br />
			<form:errors path="name" class="text-danger"/>
			<form:input style="width:250px;" path="name"/>
		</div>
	
		<div>
			<form:label path="vendor">Vendor: </form:label><br />
			<form:errors path="vendor" class="text-danger"/>
			<form:input style="width:250px;" path="vendor"/>
		</div>
		
		<div>
			<form:label path="amount">Amount: </form:label><br />
			<form:errors path="amount" class="text-danger"/>
			<form:input style="width:250px;" type="double" path="amount"/>
		</div>
		
		<div>
			<form:label path="description">Description: </form:label><br />
			<form:errors path="description" class="text-danger"/>
			<form:textarea style="width:250px;" rows="3" path="description"/>
		</div>
		
		<div>
			<input type="submit" value="Submit"/>
		</div>
		
		
	
	</form:form>
</body>
</html>