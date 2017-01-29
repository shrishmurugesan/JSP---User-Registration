package com.shrish.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("<h3>You have reached Shrish's first servlet</h3>\n");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("/XmlServlet");
		//PrintWriter writer = response.getWriter();
		System.out.println("Hello From the XML Servlet");
		//writer.println("\n<h3>Hello in HTML</h3>");
		//response.sendRedirect("http://www.google.com");
		PrintWriter writer = response.getWriter();
		writer.println("\nYour initParams username is: "+this.getServletConfig().getInitParameter("userName")+" And you are married to: "+ this.getServletConfig().getInitParameter("marriedTo"));

	}
}
