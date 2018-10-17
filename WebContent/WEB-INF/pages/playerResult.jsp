<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "mvc" %>
<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results Page</title>
</head>
<body> <h2>Add Player Result</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${p.name}</td>
        </tr>
        <tr>
            <td>Number</td>
            <td>${p.number}</td>
        </tr>
        <tr>
            <td>Position</td>
            <td>${p.position}</td>
        </tr>
        <tr>
            <td>Enrolled</td>
            <td>${p.enrollYear}</td>
        </tr>
        <tr>
        	<td>Graduation Year</td>
        	<td>${p.gradYear}</td>
        </tr>
        <tr>
            <td>Redshirted</td>
            <td>${p.redshirted}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View Roster</a>
</body>

</html>