<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Roster</title>
</head>
<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Name</td>
				<td>${item.name}</td>
			</tr>
			<tr>
				<td>Number</td>
				<td>${item.number}</td>
			</tr>
			<tr>
				<td>Position</td>
				<td>${item.position}</td>
			</tr>
			<tr>
				<td>Freshman Year</td>
				<td>${item.enrollYear}</td>
			</tr>
			<tr>
				<td>Elegibility Through</td>
				<td>${item.gradYear}</td>
			</tr>
			<tr>
				<td>Redshirted</td>
				<td>${item.redshirted}</td>
			</tr>

		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="form.mvc">Add a new Player</a>
</body>
</html>