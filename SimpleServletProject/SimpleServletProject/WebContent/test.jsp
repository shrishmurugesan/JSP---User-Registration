<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP page</title>
</head>
<body>

<h3>Hello from JSP page! </h3>
<%!
	public int add(int a, int b)
	{
		return a+b;
	}
%>
<%

out.println("This is some dynamically generated text inside a script");

int k = add(1000,1000);

%>

<br>

This is some HTML text. the value of 1000 + 1000 is <%= k %>
	
</body>
</html>