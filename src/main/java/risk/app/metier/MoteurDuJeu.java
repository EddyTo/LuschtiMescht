package risk.app.metier;

public class MoteurDuJeu {

	public Jeu jeu;

	// Creation et initialisation du Jeu
	public boolean initialiserJeu(int nbJoueurs) {

		jeu = new Jeu();
		Carte C[] = Carte.initDeck();
		Jeu.battre(C);

		if (nbJoueurs == 3) {
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			jeu.distribuer(C, 3);
			jeu.attribuerCouleur(P1);
			jeu.attribuerCouleur(P2);
			jeu.attribuerCouleur(P3);
			jeu.occuperDeBase(P1);
			jeu.occuperDeBase(P2);
			jeu.occuperDeBase(P3);
		} else if (nbJoueurs == 4) {
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
			jeu.distribuer(C, 4);
			jeu.attribuerCouleur(P1);
			jeu.attribuerCouleur(P2);
			jeu.attribuerCouleur(P3);
			jeu.attribuerCouleur(P4);
			jeu.occuperDeBase(P1);
			jeu.occuperDeBase(P2);
			jeu.occuperDeBase(P3);
			jeu.occuperDeBase(P4);
		} else if (nbJoueurs == 5) {
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
			Player P5 = jeu.getPlayer(5);
			jeu.distribuer(C, 5);
			jeu.attribuerCouleur(P1);
			jeu.attribuerCouleur(P2);
			jeu.attribuerCouleur(P3);
			jeu.attribuerCouleur(P4);
			jeu.attribuerCouleur(P5);
			jeu.occuperDeBase(P1);
			jeu.occuperDeBase(P2);
			jeu.occuperDeBase(P3);
			jeu.occuperDeBase(P4);
			jeu.occuperDeBase(P5);
		} else if (nbJoueurs == 6) {
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
			Player P5 = jeu.getPlayer(5);
			Player P6 = jeu.getPlayer(6);
			jeu.distribuer(C, 6);
			jeu.attribuerCouleur(P1);
			jeu.attribuerCouleur(P2);
			jeu.attribuerCouleur(P3);
			jeu.attribuerCouleur(P4);
			jeu.attribuerCouleur(P5);
			jeu.attribuerCouleur(P6);
			jeu.occuperDeBase(P1);
			jeu.occuperDeBase(P2);
			jeu.occuperDeBase(P3);
			jeu.occuperDeBase(P4);
			jeu.occuperDeBase(P5);
			jeu.occuperDeBase(P6);
		} else {
			System.out.println("Il faut être au moins 3 et maximum 6 joueurs pour jouer");
		}
		return true;
	}

	
	// Placer les armées avant le premier tour
	public boolean placementDesArmees(Player player, String territoireID, int nbArmeesPositionnees) {
		int nbArmeeInit = player.getArmee().getNbArmees();
		if (nbArmeeInit >= nbArmeesPositionnees) {
			jeu.placerArmees(player, territoireID, nbArmeesPositionnees);
		}
		return true;
	}

	
	// Jouer un Tour
	public boolean deplacement(String territoireIDdepart, String territoireIDarrivee, int nbArmees) {
		jeu.deplacerArmees(territoireIDdepart, territoireIDarrivee, nbArmees);
		return true;
	}

	public boolean combatEntreJoueur(int desAttaquant, int desDeffenseur, String territoireIDattaquant, String territoireIDdefenseur) {
		jeu.fight(desAttaquant, desDeffenseur, territoireIDattaquant, territoireIDdefenseur);
		return true;
	}
	
	
	// Défaite d'un joueur
	public boolean joueurVaincu(Player player){
		return jeu.defaite(player);
	}
}
