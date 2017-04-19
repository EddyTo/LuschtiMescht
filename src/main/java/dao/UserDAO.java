package dao;

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
	private static final String PERSISTENCE_UNIT_NAME="risk.app";
	
	private UserDAO(EntityManager em) {
		super();
		UserDAO.em = em;
	}
	
	public static UserDAO getInstance() {
		if(instance == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
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

	public static UserList findAllUsers() {
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
		em.merge(user);
		em.getTransaction().commit();
	}

	@Override
	public void updateUserPassword(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateUserScore(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateUserGameList(User user, Long newGameId) {
		UserDAO.getInstance();
		user.getGameIdList().add(newGameId);
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteUser(User user) {
		UserDAO.getInstance();
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		
	}

	@Override
	public User getUser(String username) {
		UserList users = getUsers();
		User userResult = null;
		for(User user: users.values()) {
			if(user.getUsername() == username) {
				userResult = user;
			}
		}
		return userResult;
	}

	@Override
	public User getUser(Long userId) {
		UserList users = getUsers();
		User userResult = null;
		for(User user: users.values()) {
			if(user.getId() == userId) {
				userResult = user;
			}
		}
		return userResult;
	}

	@Override
	public boolean userConnection(String username, String password) {
		UserList users = getUsers();
		boolean connectionResult = false;
		for(User user : users.values()) {
			if(user.getUsername() == username && user.getPassword() == password) {
				connectionResult = true;
			}
		}
		return connectionResult;
	}

	@Override
	public boolean userExist(String username) {
		UserList users = getUsers();
		boolean userExist = false;
		for(User user : users.values()) {
			if(user.getUsername() == username) {
				userExist = true;
			}
		}
		return userExist;
	}

}
