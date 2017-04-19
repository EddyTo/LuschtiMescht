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
		System.out.print(this.territoire + " " + this.arme + "\n");
	}

	/**
	 * renvoie une chaine de caractères avec les paramètres de la carte.
	 */
	public String toString() {
		String S = "" + this.territoire + " " + this.getArme();
		return S;
	}

	/**
	 * initialise un tableau de cartes.
	 */
	public static Carte[] initDeck() {
		Carte C[];
		C = new Carte[44];

		C[0] = new Carte("Afrique du Nord", "fantassin");
		C[1] = new Carte("Afrique du Sud", "canon");
		C[2] = new Carte("Afrique Orientale", "canon");
		C[3] = new Carte("Congo", "cavalier");
		C[4] = new Carte("Egypte", "fantassin");
		C[5] = new Carte("Madagascar", "fantassin");
		C[6] = new Carte("Alaska", "fantassin");
		C[7] = new Carte("Alberta", "fantassin");
		C[8] = new Carte("Amérique Centrale", "cavalier");
		C[9] = new Carte("Etat de l'Est", "canon");
		C[10] = new Carte("Etat de l'Ouest", "fantassin");
		C[11] = new Carte("Groenland", "cavalier");
		C[12] = new Carte("Ontario", "cavalier");
		C[13] = new Carte("Québec", "canon");
		C[14] = new Carte("Territoire du Nord Ouest", "canon");
		C[15] = new Carte("Argentine", "fantassin");
		C[16] = new Carte("Brésil", "canon");
		C[17] = new Carte("Pérou", "cavalier");
		C[18] = new Carte("Venezuela", "canon");
		C[19] = new Carte("Afghanistan", "fantassin");
		C[20] = new Carte("Chine", "cavalier");
		C[21] = new Carte("Inde", "fantassin");
		C[22] = new Carte("Japon", "fantassin");
		C[23] = new Carte("Kamchatka", "cavalier");
		C[24] = new Carte("Mongolie", "canon");
		C[25] = new Carte("Moyen Orient", "canon");
		C[26] = new Carte("Oural", "cavalier");
		C[27] = new Carte("Siam", "canon");
		C[28] = new Carte("Sibérie", "canon");
		C[29] = new Carte("Tchita", "fantassin");
		C[30] = new Carte("Yakoutie", "cavalier");
		C[31] = new Carte("Europe du Nord", "cavalier");
		C[32] = new Carte("Europe du Sud", "cavalier");
		C[33] = new Carte("Europe Occidentale", "fantassin");
		C[34] = new Carte("Grande Bretagne", "cavalier");
		C[35] = new Carte("Islande", "fantassin");
		C[36] = new Carte("Scandinavie", "canon");
		C[37] = new Carte("Ukraine", "canon");
		C[38] = new Carte("Australie Occidentale", "canon");
		C[39] = new Carte("Australie orientale", "fantassin");
		C[40] = new Carte("Indonésie", "cavalier");
		C[41] = new Carte("Nouvelle Guinée", "cavalier");
		C[42] = new Carte("Joker1", "Joker");
		C[43] = new Carte("Joker2", "Joker");

		return C;
	}

}