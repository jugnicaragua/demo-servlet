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
	
	<div class="card" style="width:50%; margin-left: auto; margin-right: auto">
		<div class="card-header">
			Login
		</div>
		<div class="card-body">
			<% 
				if(request.getAttribute("error") != null){
			%>
			<p style="color:red"> <%= request.getAttribute("error") %></p>
			<% } 
			%>
			<form action="${pageContext.request.contextPath}/login" method="post">
				<div class="form-group">
					<label for="username">Username</label>
					<input class="form-control" name="username" type="text" id="username" >
				</div>
				<div class="form-group">
					<label for="password">Password</label>
					<input class="form-control" name="password" type="password" id="password">
				</div>			
				<input class="btn btn-primary mb-2" type="submit" value="Aceptar" > 
			</form>
		</div>
	</div>
	
</body>
</html>