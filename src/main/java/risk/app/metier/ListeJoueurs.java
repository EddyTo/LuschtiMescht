package risk.app.metier;

import java.util.HashMap;
import java.util.Map;

public class ListeJoueurs {

	private Map<Integer, String> joueurs = new HashMap<Integer, String>();

	public ListeJoueurs() {
	}

	public ListeJoueurs(String nom1, String nom2, String nom3) {
		this.joueurs.put(1, nom1);
		this.joueurs.put(2, nom2);
		this.joueurs.put(3, nom3);
	}

	public ListeJoueurs(String nom1, String nom2, String nom3, String nom4) {
		this.joueurs.put(1, nom1);
		this.joueurs.put(2, nom2);
		this.joueurs.put(3, nom3);
		this.joueurs.put(4, nom4);
	}

	public ListeJoueurs(String nom1, String nom2, String nom3, String nom4, String nom5) {
		this.joueurs.put(1, nom1);
		this.joueurs.put(2, nom2);
		this.joueurs.put(3, nom3);
		this.joueurs.put(4, nom4);
		this.joueurs.put(5, nom5);
	}

	public String getJoueurPlace(int i) {
		String joueur = this.joueurs.get(i);
		return joueur;
	}

}