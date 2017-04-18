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
		
String userId = (String) request.getSession().getAttribute("login");
		
		if(userId == null){
			getServletContext().setAttribute("error", "User doesn't exist");
			response.sendRedirect("index.jsp");
		}else{
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/updatePassword.jsp");
		dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = (User) request.getSession().getAttribute("login");
		long userId = user.getId();
		
		String previousPassword = request.getParameter("previousPassword").trim();
		String newPassword = request.getParameter("newPassword");
		
		boolean isPasswordGood = previousPassword.equals(user.getPassword());

		if (isPasswordGood) {
			user.setPassword(newPassword);
			UserDAO.updateUserPassword(userId, newPassword);
		
			RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/views/jsp/detailUser.jsp");
			dispatch.forward(request, response);
			
		}
		else {

			response.sendRedirect("UpdatePassword?login=" + user.getId());
		}
		
		
	
	}

}
