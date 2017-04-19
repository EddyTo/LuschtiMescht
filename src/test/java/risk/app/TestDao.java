package risk.app;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.UserDAO;
import risk.app.model.UserList;


public class TestDao{
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

}
