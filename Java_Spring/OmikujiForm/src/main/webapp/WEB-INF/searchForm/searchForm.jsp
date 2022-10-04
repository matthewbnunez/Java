<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1>Send a Omikuji!</h1>
	<form action="omikuji/process" method="post">
		<p>Pick any number from 5 to 25</p>
		<input max="25" min="5" type="number" value="0" name="numberPick" /> 
		<br />
		<p>Enter the name of any city.</p>
		<input type="text" name="city" />
		<br /> 
		<p>Enter the name of any real person.</p>
		<input type="text" name="person" />
		<br /> 
		<p>Enter professional endeavor or hobby:</p>
		<input type="text" name="hobby" />
		<br /> 
		<p>Enter any type of living thing.</p>
		<input type="text" name="living" />
		<br /> 
		<p>Say something nice to someone</p>
		<textarea cols="30" rows="5" name="comment"></textarea>
		<p>Send and show a friend</p>
		<button type="submit" value="Submit">Send</button>
	</form>
</body>
</html>