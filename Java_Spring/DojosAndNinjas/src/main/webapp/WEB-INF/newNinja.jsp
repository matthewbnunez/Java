<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas</title>
</head>
<body>
	<div>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/process" method="POST" modelAttribute="newNinja">
		<p>	
			<form:label path="dojo">Dojo: </form:label>
			<form:select path="dojo">
				<c:forEach var="eachDojo" items="${dojoList}">
					<form:option value="${eachDojo.id}">${eachDojo.name}</form:option>
				</c:forEach>
			</form:select>
			<form:errors style="color:red" path="dojo" />			
		</p>
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:input path="firstName" />
			<form:errors style="color:red" path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:input path="lastName" />
			<form:errors style="color:red" path="lastName" />
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:input type="number" path="age" />
			<form:errors style="color:red" path="age" />
		</p>
		<button type="submit">Create</button>
	</form:form>
	</div>
</body>
</html>