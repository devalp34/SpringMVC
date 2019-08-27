<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title> Customer-Form </title>
	<style>
		.error {color: "red"}
	</style>
</head>
<body>

<i> Fill out the form. asterisk(*) means required.</i>
<form:form action = "cust-formProcess" modelAttribute = "customer">
	first Name : <form:input path = "firstName"/><br/>
	last Name(*)  : <form:input path = "lastName"/>
	<form:errors path = "lastName" cssClass = "error"/><br/>
	free Passes : <form:input path = "freePasses" />
	<form:errors path = "freePasses" /><br/>
	post Code : <form:input path = "postCode" />
	<form:errors path = "postCode" /><br/>
	<input type = "submit" value = "submit" />
</form:form>
</body>
</html>