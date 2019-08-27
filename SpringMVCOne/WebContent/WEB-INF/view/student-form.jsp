<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title> Student-Form </title>
</head>
<body>
<center>
	<form:form action = "processingForm" modelAttribute = "student">
		FirstName : <form:input path = "firstName"/><br/><br/>
		LastName : <form:input path = "lastName"/><br/><br/>	
		Country : <form:select path = "country">
			<form:options items = "${student.countryOption}"/>
 		</form:select><br/><br/>
 		Select your Language => 
 		JAVA       : <form:radiobutton path = "languageSelect" value = "JAVA"/>
 		Python     : <form:radiobutton path = "languageSelect" value = "Python"/>
 		JavaScript : <form:radiobutton path = "languageSelect" value = "JavaScript"/>
 		CSS		   : <form:radiobutton path = "languageSelect" value = "CSS"/><br/>
 		Operating System =>
 		Windows : <form:checkbox path = "multiSelect" value = "windows"/>
 		Linux   : <form:checkbox path = "multiSelect" value = "Linux"/>
 		Mac Os  : <form:checkbox path = "multiSelect" value = "Mac Os"/><br/> 
		<input type = "submit" value = "submit"/>
	</form:form>
</center>
</body>
</html>