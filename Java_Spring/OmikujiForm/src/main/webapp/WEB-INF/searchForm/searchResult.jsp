<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Result</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="m-5">
		<p class="text-center bg-info border border-dark">
			In <span><c:out value="${ numberPick}" /></span> years, you will
			live in <span><c:out value="${ city}" /></span> with 
			<span><c:out value="${ person}" /></span> as your
			roommate, <span><c:out value="${ hobby}" /></span> for a living.
			The next time you see a <span><c:out value="${ living}" /></span>, you will
			have good luck. Also,<span><c:out value="${ comment}" /></span>
		</p>
		<br />
		<a href="/omikuji" class="mx-auto">Home</a>
	</div>
</body>
</html>