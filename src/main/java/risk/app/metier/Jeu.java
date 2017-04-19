package risk.app.metier;

public class Jeu {

	private Player P1;
	private Player P2;
	private Player P3;
	private Player P4;
	private Player P5;
	private Player P6;
	private Hand table;
	String Fichier;

	/**
	 * Constructeur par initialisation.
	 */
	public Jeu() {
		P1 = new Player();
		P2 = new Player();
		P3 = new Player();
		P4 = new Player();
		P5 = new Player();
		P6 = new Player();
		table = new Hand();
	}

	/**
	 * renvoie un joueur selon son numero. <br>
	 */
	public Player getPlayer(int a) {
		if (a == 1) {
			return this.P1;
		} else if (a == 2) {
			return this.P2;
		} else if (a == 3) {
			return this.P3;
		} else if (a == 4) {
			return this.P4;
		} else if (a == 5) {
			return this.P5;
		} else if (a == 6) {
			return this.P6;
		} else {
			return null;
		}
	}

	/**
	 * renvoie une main qui présente la table du jeu.
	 */
	public Hand getTable() {
		return this.table;
	}

	/**
	 * initialise un tableau de cartes.
	 */
	public static Carte[] init() {
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

	/**
	 * battre un jeu de carte.
	 */
	public static Carte[] battre(Carte C[]) {
		int i;
		int j;
		Carte t;

		for (i = 0; i < 44; i++) {

			double k = Math.random() * (44 - i) + i;
			j = (int) Math.floor(k);
			t = C[i];
			C[i] = C[j];
			C[j] = t;
		}
		return C;
	}

	/**
	 * distribuer un jeu de carte sur les n joueurs.
	 */
	public void distribuer(Carte C[], int nbJoueurs) {

		int i = 0;
		if (C != null) {
			if (nbJoueurs == 3) {
				while (i < 14) {
					this.P1.addCard(C[i]);
					i++;
				}
				while (i < 29) {
					this.P2.addCard(C[i]);
					i++;
				}
				while (i < 44) {
					this.P3.addCard(C[i]);
					i++;
				}
			}

			if (nbJoueurs == 4) {
				while (i < 11) {
					this.P1.addCard(C[i]);
					i++;
				}
				while (i < 22) {
					this.P2.addCard(C[i]);
					i++;
				}
				while (i < 33) {
					this.P3.addCard(C[i]);
					i++;
				}
				while (i < 44) {
					this.P4.addCard(C[i]);
					i++;
				}
			}

			if (nbJoueurs == 5) {
				while (i < 8) {
					this.P1.addCard(C[i]);
					i++;
				}
				while (i < 17) {
					this.P2.addCard(C[i]);
					i++;
				}
				while (i < 26) {
					this.P3.addCard(C[i]);
					i++;
				}
				while (i < 35) {
					this.P4.addCard(C[i]);
					i++;
				}
				while (i < 44) {
					this.P5.addCard(C[i]);
					i++;
				}
			}

			if (nbJoueurs == 6) {
				while (i < 7) {
					this.P1.addCard(C[i]);
					i++;
				}
				while (i < 14) {
					this.P2.addCard(C[i]);
					i++;
				}
				while (i < 21) {
					this.P3.addCard(C[i]);
					i++;
				}
				while (i < 28) {
					this.P4.addCard(C[i]);
					i++;
				}
				while (i < 36) {
					this.P5.addCard(C[i]);
					i++;
				}
				while (i < 44) {
					this.P6.addCard(C[i]);
					i++;
				}
			}
		}
	}

}
