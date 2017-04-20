package risk.app.metier;

public class Carte {

	private String arme;
	private String id;

	/**
	 * un constructeur d'un objet carte par attribution d'un territoire et d'une
	 * arme
	 */
	public Carte(String arme, String id) {
		this.arme = arme;
		this.id = id;
	}

	/**
	 * un constructeur d'un objet carte par copie d'un autre objet carte
	 */
	public Carte(Carte C) {
		this.arme = C.arme;
		this.id = C.id;
	}

	public String getArme() {
		return arme;
	}

	/**
	 * affiche une carte
	 */
	public void afficher() {
		System.out.print(this.id + " " + this.arme + "\n");
	}

	/**
	 * renvoie une chaine de caractères avec les paramètres de la carte.
	 */
	public String toString() {
		String S = "" + this.id + " " + this.getArme();
		return S;
	}

	/**
	 * initialise un tableau de cartes.
	 */
	public static Carte[] initDeck() {
		Carte C[];
		C = new Carte[44];

		C[0] = new Carte("Laser", "-2;-5");
		C[1] = new Carte("Canon de Gauss", "-3;-4");
		C[2] = new Carte("Canon de Gauss", "-2;-3");
		C[3] = new Carte("Plasma", "-1;-4");
		C[4] = new Carte("Laser", "0;-3");
		C[5] = new Carte("Laser", "-1;-2");
		C[6] = new Carte("Laser", "-4;1");
		C[7] = new Carte("Laser", "-5;2");
		C[8] = new Carte("Plasma", "-4;3");
		C[9] = new Carte("Canon de Gauss", "-5;4");
		C[10] = new Carte("Laser", "-3;2");
		C[11] = new Carte("Plasma", "-2;3");
		C[12] = new Carte("Plasma", "-3;4");
		C[13] = new Carte("Canon de Gauss", "0;3");
		C[14] = new Carte("Canon de Gauss", "-1;4");
		C[15] = new Carte("Laser", "-6;-1");
		C[16] = new Carte("Canon de Gauss", "-5;-2");
		C[17] = new Carte("Plasma", "-4;-1");
		C[18] = new Carte("Canon de Gauss", "-5;0");
		C[19] = new Carte("Laser", "4;-1");
		C[20] = new Carte("Plasma", "4;1");
		C[21] = new Carte("Laser", "4;3");
		C[22] = new Carte("Laser", "5;-2");
		C[23] = new Carte("Plasma", "6;-1");
		C[24] = new Carte("Canon de Gauss", "5;0");
		C[25] = new Carte("Canon de Gauss", "6;1");
		C[26] = new Carte("Plasma", "5;2");
		C[27] = new Carte("Canon de Gauss", "6;3");
		C[28] = new Carte("Canon de Gauss", "5;4");
		C[29] = new Carte("Laser", "7;-2");
		C[30] = new Carte("Plasma", "7;0");
		C[31] = new Carte("Plasma", "0;1");
		C[32] = new Carte("Plasma", "2;-1");
		C[33] = new Carte("Laser", "1;0");
		C[34] = new Carte("Plasma", "2;1");
		C[35] = new Carte("Laser", "3;-2");
		C[36] = new Carte("Canon de Gauss", "3;0");
		C[37] = new Carte("Canon de Gauss", "3;2");
		C[38] = new Carte("Canon de Gauss", "2;-5");
		C[39] = new Carte("Laser", "4;-5");
		C[40] = new Carte("Plasma", "3;-4");
		C[41] = new Carte("Plasma", "5;-4");
		C[42] = new Carte("Joker", "");
		C[43] = new Carte("Joker", "");

		return C;
	}

	public String getId() {
		return id;
	}

}