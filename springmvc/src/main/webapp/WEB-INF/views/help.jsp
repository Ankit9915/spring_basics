<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>

	<h1>This is homepage</h1>

	<%
	/* String name=(String)request.getAttribute("name"); */
	%>
	<%-- <h1>My Name Is<%=name %></h1> --%>
	<h1>my name is ${name }</h1>
	<hr>
	<c:forEach var="item" items="${marks }">

		<h1>${item }</h1>


	</c:forEach>

</body>
</html>