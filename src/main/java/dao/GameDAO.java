package dao;

import java.util.ArrayList;

import risk.app.model.User;

public abstract class GameDAO {

	public abstract void createGame(ArrayList<User> playersList, User gameWinner);
	
}
