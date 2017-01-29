<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Failed! Please Login Again</title>
</head>
<body>
	<h3>Your UserID and Password Does not match! Please relogin</h3>
	<br>
	<form method="post" action="/login">
		User Name:<input type="text" name="userID"/>
	<br>Password: <input type="password" name="password">
		<br><input type="submit" >
	</form>

</body>
</html>