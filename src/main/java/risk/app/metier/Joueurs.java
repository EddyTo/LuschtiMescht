package risk.app.metier;

import java.util.HashMap;
import java.util.Map;

public class Joueurs {

	private Map<Integer, String> joueurs = new HashMap<Integer, String>();

	public Joueurs() {
	}

	public void listeJoueurs(int nombre) {
		for (int i = 0; i < nombre; i++) {
			this.joueurs.put(i, "Joueur " + i);
		}
	}

}
