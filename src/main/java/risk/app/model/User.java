package risk.app.model;

import java.io.Serializable;
//import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String username;
	private String email;
	private String password;
	private int score;
	private int gamesPlayed;
	private int gamesWon;
	// private ArrayList<Long> gameIdList;

	public User() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// public ArrayList<Long> getGameIdList() {
	// return gameIdList;
	// }
	//
	//
	// public void setGameIdList(ArrayList<Long> gameIdList) {
	// this.gameIdList = gameIdList;
	// }

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
}
