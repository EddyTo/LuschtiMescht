package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cfranc.UserManger.model.ListeUtilisateur;
import com.cfranc.UserManger.model.Utilisateur;

import dao.UserDAO;
import risk.app.model.User;


@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteUser() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("user");
		if(userId == null)
		{
			getServletContext().setAttribute("error", "User doesn't exist");
			response.sendRedirect("index.jsp");
		}
		else
		{
			RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/updatePassword.jsp");
			dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = (User) request.getSession().getAttribute("login");
		long userId = user.getId();
		
		UserDAO.deleteUser(userId);
		System.out.println("User " + user.getId() + " has been deleted");
		response.sendRedirect("Login");
		
	}

}
