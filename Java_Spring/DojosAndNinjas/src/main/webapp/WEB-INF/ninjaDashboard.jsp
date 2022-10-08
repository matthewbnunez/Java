<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas and Dojos</title>
</head>
<body>
	<div>
		<h1>Ninjas and Dojos</h1>
		<p>
			<a href="/dojos/new">Create a New Dojo</a>
			<a href="/ninjas/new">Create a New Ninja</a>
		</p>
		<h2>Ninja Table</h2>
		<table>
			<thead>
				<tr>
					<th> ID </th>
					<th> First Name </th>
					<th> Last Name </th>
					<th> Age </th>
					<th colspan=2> Actions </th> 
				</tr>
			</thead>
			<tbody>
				<c:forEach var="eachNinja" items="${ninjaList}">
					<tr>
						<td>${eachNinja.id} </td>
						<td> 
						<a href="/ninjas/${eachNinja.id}">
						<c:out value="${eachNinja.firstName}"/></a>
						</td>
						<td> ${eachNinja.lastName}</td>
						<td> ${eachNinja.age}</td>
						<td> <c:out value="${eachNinja.dojo.name}" /></td>
						<td>
						<a href="/ninjas/${eachNinja.id}" >View</a> |
						<a href="/ninjas/edit/${eachNinja.id}" >Edit</a> |
						</td>
						<td>
						<form action="/ninjas/delete/${eachNinja.id}" method="POST">
							<input type="hidden" name="_method" value="delete" />
							<button type="submit">Delete</button>
						</form>
						
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table> 
		<h1>Dojo table</h1>
		<table>
			<thead>
				<tr>
					<th> ID </th>
					<th> Name </th>
					<th> Number of donations </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="eachDojo" items="${dojoList}">
					<tr>
						<td>
							${eachDojo.id}
						</td>
						<td> 
							<c:out value="${eachDojo.name}"/>
						</td>
						<td>
							${eachDojo.ninjas.size()}
						</td>
						<td> 
							<a href="/dojos/${eachDojo.id}">View</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>     
	</div>
</body>
</html>