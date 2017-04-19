package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import risk.app.model.User;

@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public UpdateUser() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		String username = (String) request.getSession().getAttribute("login");

		if (username == null) {
			response.sendRedirect("index.html");
		} else {
			//UserDAO dao = null;
			request.getSession().setAttribute("email", "test");//dao.getUser(username).getEmail());
			RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/updateUser.jsp");
			dispatch.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String username = (String) request.getSession().getAttribute("login");
		
		//UserDAO dao = null;
		boolean ok = true; // = dao.userConnection(username, pwd);
		
		if(ok){
			resetSessionVar(request, response);
			UserDAO dao = null;
			User newuser = dao.getUser(username);
			newuser.setEmail(request.getParameter("email"));
			dao.updateUserMail(newuser);
			RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/views/jsp/detailUser.jsp");
			dispatch.forward(request, response);
		}else{
			request.getSession().setAttribute("displayModalConfirmPwd", true);
			request.getSession().setAttribute("message", "Your password does not match :/");
			response.sendRedirect("UpdateUser");
		}
	}
	
	public static void resetSessionVar(HttpServletRequest request, HttpServletResponse response){
		request.getSession().setAttribute("displayModalConfirmPwd", false);
		request.getSession().setAttribute("message", "");
	}

}
