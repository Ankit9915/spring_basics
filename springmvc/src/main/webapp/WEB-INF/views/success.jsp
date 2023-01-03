<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h class="text-center">${desc }</h>
<h1 style="color:red">${msg }</h1>
<h1>Welcome ${user.userName }</h1>
<h1>Your email is ${user.email }</h1>
<h1>Your password is ${user.userPassword }</h1>

</body>
</html>