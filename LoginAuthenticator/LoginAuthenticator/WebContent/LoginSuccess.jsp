<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    import = "dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success!</title>
</head>
<body>
	<h3>You have successfully logged in</h3>
	

	
	<jsp:useBean id="User" class="dto.User" scope="request">
		<jsp:setProperty name="User" property="userName" value="SupremeOverlord" />
	
	</jsp:useBean>
	Hello <jsp:getProperty property="userName" name="User"/>!
</body>
</html>