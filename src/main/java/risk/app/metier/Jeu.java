package risk.app.metier;

public class Jeu {

	private Player P1;
	private Player P2;
	private Player P3;
	private Player P4;
	private Player P5;
	private Player P6;
	private Hand table;
	private Plateau plateau;
	String Fichier;

	/**
	 * Constructeur par initialisation.
	 */
	public Jeu() {
		P1 = new Player("Rouge");
		P2 = new Player("Jaune");
		P3 = new Player("Rose");
		P4 = new Player("Noir");
		P5 = new Player("Bleu");
		P6 = new Player("Vert");
		table = new Hand();
		plateau = new Plateau();

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
				this.P1.setNbArmees(35 + P1.countTerritoires() + 1 * P1.countFantassins() + 2 * P1.countCavaliers()
						+ 3 * P1.countCanons());
				this.P2.setNbArmees(35 + P2.countTerritoires() + 1 * P2.countFantassins() + 2 * P2.countCavaliers()
						+ 3 * P2.countCanons());
				this.P3.setNbArmees(35 + P3.countTerritoires() + 1 * P3.countFantassins() + 2 * P3.countCavaliers()
						+ 3 * P3.countCanons());
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
				this.P1.setNbArmees(30 + P1.countTerritoires() + 1 * P1.countFantassins() + 2 * P1.countCavaliers()
						+ 3 * P1.countCanons());
				this.P2.setNbArmees(30 + P2.countTerritoires() + 1 * P2.countFantassins() + 2 * P2.countCavaliers()
						+ 3 * P2.countCanons());
				this.P3.setNbArmees(30 + P3.countTerritoires() + 1 * P3.countFantassins() + 2 * P3.countCavaliers()
						+ 3 * P3.countCanons());
				this.P4.setNbArmees(30 + P4.countTerritoires() + 1 * P4.countFantassins() + 2 * P4.countCavaliers()
						+ 3 * P4.countCanons());
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
				this.P1.setNbArmees(25 + P1.countTerritoires() + 1 * P1.countFantassins() + 2 * P1.countCavaliers()
						+ 3 * P1.countCanons());
				this.P2.setNbArmees(25 + P2.countTerritoires() + 1 * P2.countFantassins() + 2 * P2.countCavaliers()
						+ 3 * P2.countCanons());
				this.P3.setNbArmees(25 + P3.countTerritoires() + 1 * P3.countFantassins() + 2 * P3.countCavaliers()
						+ 3 * P3.countCanons());
				this.P4.setNbArmees(25 + P4.countTerritoires() + 1 * P4.countFantassins() + 2 * P4.countCavaliers()
						+ 3 * P4.countCanons());
				this.P5.setNbArmees(25 + P5.countTerritoires() + 1 * P5.countFantassins() + 2 * P5.countCavaliers()
						+ 3 * P5.countCanons());
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
				this.P1.setNbArmees(20 + P1.countTerritoires() + 1 * P1.countFantassins() + 2 * P1.countCavaliers()
						+ 3 * P1.countCanons());
				this.P2.setNbArmees(20 + P2.countTerritoires() + 1 * P2.countFantassins() + 2 * P2.countCavaliers()
						+ 3 * P2.countCanons());
				this.P3.setNbArmees(20 + P3.countTerritoires() + 1 * P3.countFantassins() + 2 * P3.countCavaliers()
						+ 3 * P3.countCanons());
				this.P4.setNbArmees(20 + P4.countTerritoires() + 1 * P4.countFantassins() + 2 * P4.countCavaliers()
						+ 3 * P4.countCanons());
				this.P5.setNbArmees(20 + P5.countTerritoires() + 1 * P5.countFantassins() + 2 * P5.countCavaliers()
						+ 3 * P5.countCanons());
				this.P6.setNbArmees(20 + P6.countTerritoires() + 1 * P6.countFantassins() + 2 * P6.countCavaliers()
						+ 3 * P6.countCanons());
			}
		}
	}

	public Plateau getPlateau() {
		return plateau;
	}

	/**
	 * dispatcher les armées sur les territoires.
	 */
	// Attribue 1 armée à chaque territoire occupé (min obligatoire)

	public void attribuerCouleur(Player player) {
		for (int i = 0; i < plateau.getCasePlateau().size(); i++) {
			for (int j = 0; j < player.getHand().getNCard(); j++) {
				String plateauID = plateau.getCasePlateau().get(i).getId();
				String territoireID = player.getHand().getListeCard()[j].getId();
				String playerCouleur = player.getCouleur();
				Position territoire = plateau.getCasePlateau().get(i);

				if (plateauID.equals(territoireID)) {
					territoire.setCouleur(playerCouleur);
				}
			}
		}
	}
	
	public Position identifierCase(String territoireID) {
		for (int i = 0; i < plateau.getCasePlateau().size(); i++) {
			String plateauID = plateau.getCasePlateau().get(i).getId();
			Position territoire = plateau.getCasePlateau().get(i);
			if (plateauID.equals(territoireID)) {
				return territoire;
			}
		}
		return null;
	}

	public void occuperDeBase(Player player) {

		for (int i = 0; i < plateau.getCasePlateau().size(); i++) {
			String playerCouleur = player.getCouleur();
			String territoireCouleur = plateau.getCasePlateau().get(i).getCouleur();
			Position territoire = plateau.getCasePlateau().get(i);
			int nbArmeeInit = player.getArmee().getNbArmees();
			if (playerCouleur.equals(territoireCouleur)) {
				territoire.setContenu(1);
				player.setNbArmees(nbArmeeInit - 1);
			}
		}
	}

	public void ajouterArmees(Player player, String territoireID, int nbArmeesPositionnees) {
		for (int i = 0; i < plateau.getCasePlateau().size(); i++) {
			String plateauID = plateau.getCasePlateau().get(i).getId();
			Position territoire = plateau.getCasePlateau().get(i);
			int nbArmeeInit = player.getArmee().getNbArmees();
			if (plateauID.equals(territoireID)) {
				territoire.setContenu(nbArmeesPositionnees);
				player.setNbArmees(nbArmeeInit - nbArmeesPositionnees);
			}
		}
	}

}