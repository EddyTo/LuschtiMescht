package dao;

import risk.app.model.Game;
import risk.app.model.User;

public class UserDAO implements AbstractUserDAO {

	@Override
	public void createUser(String username, String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserMail(Long userId, String newEmail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserPassword(Long userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserScore(Long userId, int scoreModif) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserGameList(Long userId, Game newGame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long userId) {
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
