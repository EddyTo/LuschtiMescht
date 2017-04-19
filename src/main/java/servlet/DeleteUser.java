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

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public DeleteUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.html");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = (String) request.getSession().getAttribute("login");
		String pwd = request.getParameter("password");
		
		UserDAO dao = null;
		boolean ok = dao.userConnection(username, pwd);
		
		if(ok){
			dao.deleteUser(dao.getUser(username));
			request.getSession().setAttribute("displayModalDeleted", true);
			request.getSession().setAttribute("login", null);
			request.getSession().setAttribute("message", null);
			request.getSession().setAttribute("displayModalDelete", null);
			response.sendRedirect("index.html");
			
		}else{
			request.getSession().setAttribute("displayModalDeleted", false);
			request.getSession().setAttribute("displayModalDelete", true);
			request.getSession().setAttribute("message", "Mistake in password :/");
			response.sendRedirect("DetailUser");
		}
		
	}
	
	public static void resetSessionVar(HttpServletRequest request, HttpServletResponse response){
		request.getSession().setAttribute("displayModalDeleted", false);
		request.getSession().setAttribute("displayModalDelete", false);
		request.getSession().setAttribute("message", "");
	}

}
