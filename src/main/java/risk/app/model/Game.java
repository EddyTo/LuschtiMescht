package risk.app.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import javax.persistence.*;


@Entity
public class Game implements Serializable{
	private static final long serialVersionUID=1L;

	private Long id;
	private Long gameWinnerId;
	private Long[] playersListId;
	private Date date;

	public Game() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public Long getId() {
		return id;}

	public void setId(Long id) {
		this.id = id;}
	
	public Long[] getPlayersListId() {
		return playersListId;
	}

	public void setPlayersList(Long[] playersListId) {
		this.playersListId = playersListId;
	}

	public Long getGameWinnerId() {
		return gameWinnerId;
	}

	public void setGameWinnerId(Long gameWinnerId) {
		this.gameWinnerId = gameWinnerId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
