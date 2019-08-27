<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Student</title>
</head>
<body>
<center>
<p> Student Last Name is  : ${student.lastName}</p><br/>
<p> Student First Name is : ${student.firstName}</p><br/>
<p> Student country is    : ${student.country}</p><br/>
<p> Student language is   : ${student.languageSelect}</p><br/>
Operating System:
<ul>
	<c:forEach var = "temp" items = "${student.multiSelect}">
		<li>${temp} </li>
	</c:forEach>
</ul>
</center>
</body>
</html>