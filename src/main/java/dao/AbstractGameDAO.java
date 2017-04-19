package dao;

import risk.app.model.Game;

public interface AbstractGameDAO {

	public abstract void createGame(Game game);
	public abstract void updateGame(Game game);
	public abstract void updateScore(Game game);
}
