package dao;

import risk.app.model.Game;
import risk.app.model.User;

public interface AbstractUserDAO {

	public abstract void createUser(User user);
	public abstract void updateUserMail(User user);
	public abstract void updateUserPassword(User user);
	public abstract void updateUserScore(User user);
	public abstract void updateUserGames(User user, Game game);
	public abstract void deleteUser(User user);
	public abstract User getUser(String username);
	public abstract User getUser(Long userId);
	public abstract boolean userConnection(String username, String password);
	public abstract boolean userExist(String username);

}
