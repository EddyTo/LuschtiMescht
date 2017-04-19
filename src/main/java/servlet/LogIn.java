package servlet;

import java.awt.SecondaryLoop;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;


@WebServlet("/Login")
public class LogIn extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public LogIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeleteUser.resetSessionVar(request, response);
		LogIn.resetSessionVar(request, response);
		
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeleteUser.resetSessionVar(request, response);
		LogIn.resetSessionVar(request, response);
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDAO dao = null;
		boolean ok = dao.userConnection(username, password);
		
		if(ok){
			request.getSession().setAttribute("displayModalLogIn", false);
			request.getSession().setAttribute("message", null);
			request.getSession().setAttribute("login", username);
			response.sendRedirect("index.html");
		}else{
			request.getSession().setAttribute("displayModalLogIn", true);
			request.getSession().setAttribute("message", "Connection failed :/");
			response.sendRedirect("index.html");
		}
	}
	
	public static void resetSessionVar(HttpServletRequest request, HttpServletResponse response){
		request.getSession().setAttribute("displayModalLogIn", null);
		request.getSession().setAttribute("message", "");
		request.getSession().setAttribute("login", null);
	}
	
}
