/**
 * 
 */

$(document).ready(function(){
	
	//***********//
	//CSS styling//
	//***********//
	
	//Submit Button
	$("#submit-button").mouseenter(function() {
		  $("#submit-button").css("background-color", "#e6e600"); });
	$("#submit-button").mouseleave(function() {
		  $("#submit-button").css("background-color", "#DCDCDC"); });
	
	//Page Links
	$("a").css({ "color": "black", 
		 "text-decoration": "underline", 
		 "font-weight": "530"});

	
	//**************//
	//Form Validaion//
	//**************//
	
	//Declare error message variables
	$("#name-error-message").hide();
	$("#number-error-message").hide();
	$("#enrollYear-error-message").hide();
	
	
	

	

	//Test name input
	$("#name").focusout(function() {	
	var input = $("#name").val();	
	if(input === '') {
		$("#name-error-message").html("This field can not be left blank");
		$("#name-error-message").show();
	} else {
		$("#name-error-message").hide();
	}
	});
	
	//Test Number Input
	$("#number").focusout(function() {
		var input = $("#number").val();
		if ($.isNumeric(input)) {
		$("#number-error-message").hide();
	} else {
		$("#number-error-message").html("You must enter a number");
		$("#number-error-message").show();
	}
	});
	
	//Test Enroll Year input
	$("#enrollYear").focusout(function() {
		var input = $("#enrollYear").val();
		if ($.isNumeric(input)) {
		$("#enrollYear-error-message").hide();
	} else {
		$("#enrollYear-error-message").html("You must enter an numeric enrollment year");
		$("#enrollYear-error-message").show();
	}
	});
	

	
	
});



/*$(function() {
	
	// Set all error messages hidden
	$("#name-error-message").hide();
	$("#number-error-message").hide();
	$("#enrollYear-error-message").hide();
	
	// Declare variables for error messages
	var error-name = false;
	var error-number = false;
	var error-enrollYear = false;*/

