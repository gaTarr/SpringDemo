<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "mvc" %>
<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Roster Builder</h2>
<mvc:form modelAttribute="player" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="name">Name</mvc:label></td>
	        <td><mvc:input path="name" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="number">Number</mvc:label></td>
	        <td><mvc:input path="number" /></td>
	    </tr>
	    <tr>
            <td><mvc:label path="position">Position</mvc:label></td>
            <td><mvc:select path="position" items="${positions}" /></td>
        </tr>
   	    <tr>
	        <td><mvc:label path="enrollYear">Enroll Year</mvc:label></td>
	        <td><mvc:input path="enrollYear" /></td>
	    </tr>
        <tr>
            <td><mvc:label path="redshirted">Used Redshirt</mvc:label></td>
            <td><mvc:checkbox path="redshirted" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View Roster</a>


</body>
</html>