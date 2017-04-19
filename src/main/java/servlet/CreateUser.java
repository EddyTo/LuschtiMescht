package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import risk.app.model.User;

@WebServlet("/CreateUser")
public class CreateUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public CreateUser() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		DeleteUser.resetSessionVar(request, response);
		LogIn.resetSessionVar(request, response);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/createUser.jsp");
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDAO dao = null;
		dao.createUser(user);
		
		request.getSession().setAttribute("displayModalLogIn", false);
		request.getSession().setAttribute("message", null);
		request.getSession().setAttribute("login", username);
		response.sendRedirect("index.html");
	}

}
