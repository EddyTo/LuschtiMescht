package risk.app.metier;

public class Carte {

	private String territoire;
	private String arme;
	private String id;

	/**
	 * un constructeur d'un objet carte par attribution d'un territoire et d'une
	 * arme
	 */
	public Carte(String territoire, String arme, String id) {
		this.territoire = territoire;
		this.arme = arme;
		this.id = id;
	}

	/**
	 * un constructeur d'un objet carte par copie d'un autre objet carte
	 */
	public Carte(Carte C) {

		this.territoire = C.territoire;
		this.arme = C.arme;
		this.id = C.id;
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

		C[0] = new Carte("Afrique du Nord", "fantassin", "-2;-5");
		C[1] = new Carte("Afrique du Sud", "canon", "-3;-4");
		C[2] = new Carte("Afrique Orientale", "canon", "-2;-3");
		C[3] = new Carte("Congo", "cavalier", "-1;-4");
		C[4] = new Carte("Egypte", "fantassin", "0;-3");
		C[5] = new Carte("Madagascar", "fantassin", "-1;-2");
		C[6] = new Carte("Alaska", "fantassin", "-4;1");
		C[7] = new Carte("Alberta", "fantassin", "-5;2");
		C[8] = new Carte("Amérique Centrale", "cavalier", "-4;3");
		C[9] = new Carte("Etat de l'Est", "canon", "-5;4");
		C[10] = new Carte("Etat de l'Ouest", "fantassin", "-3;2");
		C[11] = new Carte("Groenland", "cavalier", "-2;3");
		C[12] = new Carte("Ontario", "cavalier", "-3;4");
		C[13] = new Carte("Québec", "canon", "0;3");
		C[14] = new Carte("Territoire du Nord Ouest", "canon", "-1;4");
		C[15] = new Carte("Argentine", "fantassin", "-6;-1");
		C[16] = new Carte("Brésil", "canon", "-5;-2");
		C[17] = new Carte("Pérou", "cavalier", "-4;-1");
		C[18] = new Carte("Venezuela", "canon", "-5;0");
		C[19] = new Carte("Afghanistan", "fantassin", "4;-1");
		C[20] = new Carte("Chine", "cavalier", "4;1");
		C[21] = new Carte("Inde", "fantassin", "4;3");
		C[22] = new Carte("Japon", "fantassin", "5;-2");
		C[23] = new Carte("Kamchatka", "cavalier", "6;-1");
		C[24] = new Carte("Mongolie", "canon", "5;0");
		C[25] = new Carte("Moyen Orient", "canon", "6;1");
		C[26] = new Carte("Oural", "cavalier", "5;2");
		C[27] = new Carte("Siam", "canon", "6;3");
		C[28] = new Carte("Sibérie", "canon", "5;4");
		C[29] = new Carte("Tchita", "fantassin", "7;-2");
		C[30] = new Carte("Yakoutie", "cavalier", "7;0");
		C[31] = new Carte("Europe du Nord", "cavalier", "0;1");
		C[32] = new Carte("Europe du Sud", "cavalier", "2;-1");
		C[33] = new Carte("Europe Occidentale", "fantassin", "1;0");
		C[34] = new Carte("Grande Bretagne", "cavalier", "2;1");
		C[35] = new Carte("Islande", "fantassin", "3;-2");
		C[36] = new Carte("Scandinavie", "canon", "3;0");
		C[37] = new Carte("Ukraine", "canon", "3;2");
		C[38] = new Carte("Australie Occidentale", "canon", "2;-5");
		C[39] = new Carte("Australie orientale", "fantassin", "4;-5");
		C[40] = new Carte("Indonésie", "cavalier", "3;-4");
		C[41] = new Carte("Nouvelle Guinée", "cavalier", "5;-4");
		C[42] = new Carte("Joker1", "Joker", "");
		C[43] = new Carte("Joker2", "Joker", "");

		return C;
	}

	public String getId() {
		return id;
	}

}