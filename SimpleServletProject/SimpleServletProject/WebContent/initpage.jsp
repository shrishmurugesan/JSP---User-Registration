<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public void jspinit()
{
	String userName = getServletConfig().getInitParameter("userName");
	ServletContext context = getServletContext();
	context.setAttribute("defaultUserName", userName);
}

%>


The default value from initParams is <%=getServletConfig().getInitParameter("userName") %>
<br>
The default value of userName in servlet context <%= getServletContext().getAttribute("defaultUserName") %>
<br>
The default value of userName defined in InitParams within Web.xml is: <%=getServletConfig().getInitParameter("userName") %>

</body>
</html>