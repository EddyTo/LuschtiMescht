package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cfranc.UserManger.model.Utilisateur;


@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateUser() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String userId = (String) request.getSession().getAttribute("login");
		
		if(userId == null){
			getServletContext().setAttribute("error", "User doesn't exist");
			response.sendRedirect("index.jsp");
		}else{
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/updateUser.jsp");
		dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = (User) request.getSession().getAttribute("login");
		
		
		String pseudo = request.getParameter("pseudo");
		String email = request.getParameter("email");
		
		if (pseudo != "") {
			user.setPseudo(pseudo);
		}
		if (email != "") {
			user.setEmail(email);
		}
		
		Service.updateUser(user);
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/views/jsp/detailUser.jsp");
		dispatch.forward(request, response);
	}

}
