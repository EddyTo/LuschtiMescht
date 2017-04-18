package dao;

import risk.app.model.Game;
import risk.app.model.User;
import risk.app.model.UserList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserDAO implements AbstractUserDAO {
	
	@PersistenceContext
	private static EntityManager em;
	private static UserDAO instance=null;
	
	private UserDAO(EntityManager em) {
		super();
		UserDAO.em = em;
	}
	
	public static UserDAO getInstance() {
		if(instance == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("risk.app");
			em = factory.createEntityManager();
			instance = new UserDAO(em);
		}
		return instance;
	}
	
	public static UserList getUsers() {
		UserDAO.getInstance();
		
		UserList users = UserDAO.findAllUsers();
		return users;
	}

	private static UserList findAllUsers() {
		UserList users = new UserList();
		Query q = em.createQuery("SELECT t from User t");
		List<User> userList = q.getResultList();
		for(User user : userList) {
			users.put(user.getId(), user);
		}
		return users;
	}

	@Override
	public void createUser(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateUserMail(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}

	@Override
	public void updateUserPassword(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateUserScore(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateUserGameList(User user, Game newGame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userConnection(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
