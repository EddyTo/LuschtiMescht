package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import risk.app.model.Game;
import risk.app.model.User;

public class GameDAO implements AbstractGameDAO {

	@PersistenceContext
	private static EntityManager em;
	private static GameDAO instance=null;
	
	private GameDAO(EntityManager em) {
		super();
		GameDAO.em = em;
	}
	
	public static GameDAO getInstance() {
		if(instance == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("risk.app");
			em = factory.createEntityManager();
			instance = new GameDAO(em);
		}
		return instance;
	}
	
	@Override
	public void createGame(Game game) {
		GameDAO.getInstance();
		em.getTransaction().begin();
		em.persist(game);
		em.getTransaction().commit();
		
	}
	
	@Override
	public void updateGame(Game game) {
		GameDAO.getInstance();
		em.getTransaction().begin();
		em.merge(game);
		em.getTransaction().commit();
	}

//	@Override
//	public void updateScore(Game game) {
//		GameDAO.getInstance();
//		int newScore;
//		ArrayList<Long> playersList = game.getPlayersIdList();
//		UserDAO dao = UserDAO.getInstance();
//		for(int i = 0; i < playersList.size(); i++) {
//			Long playerId = playersList.get(i);
//			User player = dao.getUser(playerId);
//			if(playerId == game.getGameWinnerId()) {
//				newScore = player.getScore() + 1;
//				player.setScore(newScore);
//			} else {
//				newScore = player.getScore();
//				player.setScore(newScore);
//			}
//			em.getTransaction().begin();
//			em.merge(player);
//			em.getTransaction().commit();
//		}
//		
//	}

}
