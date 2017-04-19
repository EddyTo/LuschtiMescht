package risk.app.metier;

public class Carte {

	private String territoire;
	private String arme;

	/**
	 * un constructeur d'un objet carte par attribution d'un territoire et d'une
	 * arme
	 */
	public Carte(String territoire, String arme) {
		this.territoire = territoire;
		this.arme = arme;
	}

	/**
	 * un constructeur d'un objet carte par copie d'un autre objet carte
	 */
	public Carte(Carte C) {

		this.territoire = C.territoire;
		this.arme = C.arme;
	}

	public String getTerritoire() {
		return territoire;
	}

	public String getArme() {
		return arme;
	}

	/**
	 * affiche une carte
	 */
	public void afficher() {
		System.out.print(this.territoire + " " + this.arme + " ");
	}

	/**
	 * renvoie une chaine de caractères avec les paramètres de la carte.
	 */
	public String toString() {
		String S = "" + this.territoire + " " + this.getArme();
		return S;
	}

}