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
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("risk.app.game");
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

}
