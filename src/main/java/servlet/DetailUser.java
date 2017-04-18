package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DetailUser")
public class DetailUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DetailUser() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userId = (String) request.getSession().getAttribute("login");
		
		if(userId == null){
			getServletContext().setAttribute("error", "User doesn't exist");
			response.sendRedirect("index.jsp");
		}else{
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/detailUser.jsp");
		dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
