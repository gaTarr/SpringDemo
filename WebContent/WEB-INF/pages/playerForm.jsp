<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "mvc" %>
<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel='stylesheet' type='text/css' href= 'styles.css'>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
<!-- <script src="https://code.jquery.com/jquery-3.3.1.js"></script> -->

<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js">
</script>
<!-- <script>
$(document).ready(function(){


$("#name").focusout(function() {
	
	$("h2").hide();
	//check_name();
	
});
});
</script> -->


<title>Spring MVC Form Handling</title>
</head>
<body>
<div class="wrapper">

<h2>Roster Builder</h2>
<mvc:form id="playerForm" modelAttribute="player" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="name">Name</mvc:label></td>
	        <td><mvc:input path="name" class="name" id="name" /></td>
	        <td><span class="error-form" id="name-error-message"></span></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="number">Number</mvc:label></td>
	        <td><mvc:input path="number" class="number" id="number"/></td>
	        <td><span class="error-form" id="number-error-message"></span></td>
	    </tr>
	    <tr>
            <td><mvc:label path="position">Position</mvc:label></td>
            <td><mvc:select path="position" items="${positions}" /></td>
        </tr>
   	    <tr>
	        <td><mvc:label path="enrollYear">Enroll Year</mvc:label></td>
	        <td><mvc:input path="enrollYear" class="enrollYear" id="enrollYear"/></td>
	        <td><span class="error-form" id="enrollYear-error-message"></span></td>
	    </tr>
        <tr>
            <td><mvc:label path="redshirted">Used Redshirt</mvc:label></td>
            <td><mvc:checkbox path="redshirted" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" id="submit-button" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View Roster</a>

</div> <!-- End div Wrapper -->

<script src="main.js"></script> 
 
</body>



</html>