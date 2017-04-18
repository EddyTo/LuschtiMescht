package dao;

import java.util.ArrayList;

import risk.app.model.User;

public interface AbstractGameDAO {

	public abstract void createGame(ArrayList<User> playersList, User gameWinner);
	
}
