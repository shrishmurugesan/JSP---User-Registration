package com.shrish.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "This is a simple servlet", urlPatterns = { "/SimpleServletPath" }, initParams = {@WebInitParam(name = "userName", value = "Shrish Murugesan"), 
		@WebInitParam(name="marriedTo",value="Sharmila Shrish")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("<h3>You have reached Shrish's first servlet, this is the doGet method</h3>\n");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName") ;
		String marriedTo = request.getParameter("marriedTo");
		if(userName != "" && userName != null)
		{
			session.setAttribute("savedUserName", userName);	
			context.setAttribute("savedUserName", userName );
		}
		if(marriedTo != "" && marriedTo != null)
		{
			session.setAttribute("savedMarriedTo", marriedTo);			
			context.setAttribute("savedMarriedTo", marriedTo);		
		}
		writer.println();
		writer.println("\nYour stateless username is: "+ userName+" And you are married to: "+ marriedTo);
		writer.println("\nYour session username is: "+ (String)session.getAttribute("savedUserName")+" And you are married to: "+ (String)session.getAttribute("savedMarriedTo"));
		writer.println("\nYour context username is: "+ (String)context.getAttribute("savedUserName")+" And you are married to: "+ (String)context.getAttribute("savedMarriedTo"));
		writer.println("\nYour initParams username is: "+this.getServletConfig().getInitParameter("userName")+" And you are married to: "+ this.getServletConfig().getInitParameter("marriedTo"));


		
		//response.sendRedirect("http://www.google.com");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<h3>You have reached Shrish's first servlet, this is the doPost method!</h3>\n");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName") ;
		String marriedTo = request.getParameter("marriedTo");
		writer.println();
		writer.println("\nYour username is: "+userName +" And you are married to: "+marriedTo);
		String maritalStatus = request.getParameter("maritalStatus");
		if(maritalStatus.equals("Happily Married"))
			writer.println("<br>Congratulations! You two are "+maritalStatus);
		else
			writer.println("<br>That is sad to hear that you two are "+maritalStatus);
		
		String[] schools = request.getParameterValues("location");
		
		writer.println("<br>You attend these schoools <br>");
		for(String string : schools) {
			writer.println(string+" ");
		}
		//response.sendRedirect("http://www.google.com");
	}

}
