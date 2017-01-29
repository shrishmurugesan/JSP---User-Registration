

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import services.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		
		boolean result=loginService.authenticate(userID, password);
		
		if(result)
		{
			User user = loginService.getUserDetails(userID); 
			//request.getSession().setAttribute("User", user);
			//response.sendRedirect("LoginSuccess.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			request.setAttribute("User", user);
			dispatcher.forward(request, response);
			return;
		}
		else
		{
			response.sendRedirect("relogin.jsp");
		}
	}

}
 	