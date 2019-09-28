<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List - Spring Boot Web Application Exaple</title>
</head>
<body>

	<h1>Nationwide Insurance FDN List</h1>
	</br>

	<table border="1" cellpadding="10">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Country</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.name}</td>
				<td>${contact.email}</td>
				<td>${contact.country}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>