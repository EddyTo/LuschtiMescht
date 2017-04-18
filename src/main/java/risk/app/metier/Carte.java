package risk.app.metier;

import java.util.ArrayList;
import java.util.List;

public class Carte {

	private String[] carte = new String[2];

	public Carte(String territoire, String arme) {
		this.carte[0] = territoire;
		this.carte[1] = arme;
	}

}
