package risk.app.model;

import java.util.ArrayList;
import java.util.Date;

public class Game {

	private Long id;
	private User gameWinner;
	private ArrayList<User> playersList;
	private Date date;

	public Game() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getGameWinner() {
		return gameWinner;
	}

	public void setGameWinner(User gameWinner) {
		this.gameWinner = gameWinner;
	}

	public ArrayList<User> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(ArrayList<User> playersList) {
		this.playersList = playersList;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
