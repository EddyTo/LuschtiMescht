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

@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public UpdatePassword() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getSession().getAttribute("login");
		
		if(username == null){
			response.sendRedirect("index.html");
		}else{
			RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/updatePassword.jsp");
			dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getSession().getAttribute("login");
		UserDAO dao = null;
		User user = dao.getUser(username);
		
		String previousPassword = request.getParameter("previousPassword");
		String newPassword = request.getParameter("newPassword");
		
		boolean isPasswordGood = previousPassword.equals(user.getPassword());

		if (isPasswordGood) {
			user.setPassword(newPassword);
			
			dao.updateUserPassword(user);
			

			request.getSession().setAttribute("message", "");
			
			RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/views/jsp/detailUser.jsp");
			dispatch.forward(request, response);
		}
		else {
			request.getSession().setAttribute("message", "Wrong password !!");
			response.sendRedirect("UpdatePassword");
		}
		
		
	
	}

}
