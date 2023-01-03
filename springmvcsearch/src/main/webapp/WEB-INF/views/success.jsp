<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Name is ${Student.name }</h1>
<h1>Id is ${Student.id }</h1>
<h1>Student dob is ${Student.date }</h1>
<h1>Courses is ${Student.courses }</h1>
<h1>Your gender is ${Student.gender }</h1>
<h1>Student type is ${Student.type} </h1>
<hr>
<h1>Student Street is ${Student.address.street }</h1>

</body>
</html>