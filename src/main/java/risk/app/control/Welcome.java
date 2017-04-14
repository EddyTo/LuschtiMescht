package risk.app.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String WEB_URL="/WEB-INF/welcome.jsp"; //$NON-NLS-1$
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("IMG_ALT", Messages.getString("Welcome.IMG_ALT")); //$NON-NLS-1$ //$NON-NLS-2$
		request.getRequestDispatcher(WEB_URL).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
