package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GameDAO;
import dao.UserDAO;
import risk.app.model.Game;
import risk.app.model.User;

@WebServlet("/Lobby")
public class Lobby extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lobby() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = (String) request.getSession().getAttribute("login");
		
		if(username == null){
			response.sendRedirect("index.html");
		}else{
			RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/lobby.jsp");
			dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO userdao = null;
		String username = (String) request.getSession().getAttribute("login");
		User user = new User(); //userdao.getUser(username);
		user.setEmail("a@a");
		user.setId(1L);
		user.setUsername(username);
		List<Game> gameList = null;
		gameList = (List<Game>)request.getSession().getAttribute("gameList");
		// Service.getGame(user);
		//RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/waitingForPlayers.jsp");
		//dispatch.forward(request, response); // attente
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/views/jsp/gameInAction.jsp");
		dispatch.forward(request, response); // game
		
		
//		if (gameList == null){
//			List<User> playersList = null;
//			Game game = new Game();
//			playersList.add(user);
//			game.setPlayersList((ArrayList<User>) playersList);
//			gameList.add(game);
//			request.getSession().setAttribute("gameList", gameList);
//			response.sendRedirect("WEB-INF/views/jsp/WaitingForPlayers.jsp"); // attente
//		}
//		
//		
//		for (int i = 0; i < ((List<Game>) gameList).size(); i++){
//			Game game =  gameList.get(i);
//			List<User> playersList = game.getPlayersList();
//			if (playersList.size() < 3 ){
//				playersList.add(user);
//				game.setPlayersList((ArrayList<User>) playersList);
//				gameList.add(game);
//				request.getSession().setAttribute("gameList", gameList);
//				if (playersList.size() == 3){
//					response.sendRedirect(""); // début du jeu
//				} else {
//					response.sendRedirect(""); // attente
//				}
//				
//				
//			} else {
//				playersList = null;
//				game = new Game();
//				playersList.add(user);
//				game.setPlayersList((ArrayList<User>) playersList);
//				gameList.add(game);
//				request.getSession().setAttribute("gameList", gameList);
//				response.sendRedirect(""); // attente
//			}
//			
//		}
//		
//		
//		
		
	}

}
