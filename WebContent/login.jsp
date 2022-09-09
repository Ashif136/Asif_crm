<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	

		<h2>Login here...</h2>
		<hr>
		<%
		if(request.getAttribute("error")!=null) {
			
			    out.println(request.getAttribute("error"));
		}
		
		%>
		<form action="verifyLogin" method="post">
		<pre>
				email <input type="text" name="email"/>
				password <input type="text" name="password"/>
				<input type="submit" value="Login"/>
				
		</pre>
		</form>
		
		

</body>
</html>