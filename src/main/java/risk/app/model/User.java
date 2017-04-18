package risk.app.model;

import java.util.ArrayList;

public class User {
	
	private Long id;
	
	private String username;
	private String email;
	private String password;
	private int score;
	private ArrayList<Game> gameList;
	
	public User() {
		super();
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
	public ArrayList<Game> getGameList() {
		return gameList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGameList(ArrayList<Game> gameList) {
		this.gameList = gameList;
	}
	
	
}
