package dao;

import risk.app.model.Game;
import risk.app.model.User;

public abstract class UserDAO {

	public abstract void createUser(String username, String email, String password);
	public abstract void updateUserMail(Long userId, String newEmail);
	public abstract void updateUserPassword(Long userId, String newPassword);
	public abstract void updateUserScore(Long userId, int scoreModif);
	public abstract void updateUserGameList(Long userId, Game newGame);
	public abstract void deleteUser(Long userId);
	public abstract User getUser(String username);
	public abstract User getUser(Long userId);
	public abstract boolean userConnection(String username, String password);
	public abstract boolean userExist(String username);
	
}
