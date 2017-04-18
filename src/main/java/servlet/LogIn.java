package servlet;

import java.awt.SecondaryLoop;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class LogIn extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public LogIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		InterfaceDAO dao = null;
		boolean ok = dao.userExists(username, pwd);
		
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

}
