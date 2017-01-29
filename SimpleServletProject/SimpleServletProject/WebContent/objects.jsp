<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String userName = request.getParameter("name");

if(userName != null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageUserName", userName);
}
%>

Welcome <%=userName %>! Good to see ya!
<br>
The name in the request Object is <%=userName %>
<br>
The name in the session Object is <%= session.getAttribute("sessionUserName") %>
<br>
the name in the application Object is <%= application.getAttribute("applicationUserName") %>
<br>
the name in the pageContext Object is <%= pageContext.getAttribute("pageUserName") %>

</body>
</html>