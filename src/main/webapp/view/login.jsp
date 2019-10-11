<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<a href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
	<% 
		if(request.getAttribute("error") != null){
	%>
	<%= request.getAttribute("error") %>
	<% } 
	%>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<label for="username">Username</label>
		<input name="username" type="text" id="username" >
		<label for="password">Password</label>
		<input name="password" type="password" id="password">
		<input type="submit" value="Aceptar" > 
	</form>
</body>
</html>