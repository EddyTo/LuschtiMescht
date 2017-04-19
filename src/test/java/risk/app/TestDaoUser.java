package risk.app;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.UserDAO;
import risk.app.model.User;
import risk.app.model.UserList;


public class TestDaoUser{
	private static UserDAO dao=null;
	@BeforeClass
	public static void SetUpBeforeClass() throws Exception{
		dao=UserDAO.getInstance();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{}
	@Test
	public void testEmptyBase(){
			UserList listEmptyTable=UserDAO.findAllUsers();
			assertEquals(0,listEmptyTable.size());
	}
	@Test
	public void testAddFirst(){
		User userTest=new User();
		dao.createUser(userTest);
		assertEquals(1,UserDAO.findAllUsers().size());
		dao.deleteUser(userTest);
		userTest=null;
	}
	@Test
	public void testRemoveUser(){
		User userTest=new User();
		dao.createUser(userTest);
		dao.deleteUser(userTest);
		assertEquals(0,UserDAO.findAllUsers().size());
		userTest=null;
	}
	@Test
	public void testGetUser(){
		User userTest=new User();
		dao.createUser(userTest);
		long userId=userTest.getId();
		assertEquals(userTest,dao.getUser(userId));
		dao.deleteUser(userTest);
		userTest=null;
	}
	@Test
	public void testUpdateUsermail(){
		User userTest=new User();
		userTest.setEmail("emailorigin");
		dao.createUser(userTest);
		long userId=userTest.getId();
		userTest.setEmail("nouvelEmail");
		dao.updateUserMail(userTest);
		assertEquals("nouvelEmail",dao.getUser(userId).getEmail());//le test passe meme sans l'appel updateUserMail meme si la base de donnée n'est pas modifiée... l'updateUserMail modifie la base de donnée. 
		dao.deleteUser(userTest);
	}
	@Test
	public void testUpdateUserPassword(){
		User userTest=new User();
		userTest.setPassword("passwordOrigin");
		dao.createUser(userTest);
		long userId=userTest.getId();
		userTest.setPassword("passwordModifie");
		dao.updateUserPassword(userTest);
		assertEquals("passwordModifie",dao.getUser(userId).getPassword());
		dao.deleteUser(userTest);
	}
	@Test
	public void testUpdateUserScore(){
		User userTest=new User();
		userTest.setScore(1);
		dao.createUser(userTest);
		long userId=userTest.getId();
		userTest.setScore(2);
		dao.updateUserScore(userTest);
		assertEquals(2,dao.getUser(userId).getScore());
		dao.deleteUser(userTest);
	}
	@Test
	public void testUserExists(){
		User userTest=new User();
		String nom="NomUtilisateur";
		userTest.setUsername(nom);
		dao.createUser(userTest);
		assertEquals(true,dao.userExist(nom));
		dao.deleteUser(userTest);
	}
	@Test
	public void testUserConnexion(){
		User userTest=new User();
		String nom="NomUtilisateur";
		String mdp="MotDePasse";
		userTest.setUsername(nom);
		userTest.setPassword(mdp);
		dao.createUser(userTest);
		assertEquals(true,dao.userConnection(nom,mdp));
		dao.deleteUser(userTest);
	}
	@Test
	public void testUserGameList(){
		//TODO
	}

}
