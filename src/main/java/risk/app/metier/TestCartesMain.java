package risk.app.metier;

public class TestCartesMain {

	public static void main(String[] args) {

		// On crée le jeu et 3 joueurs
		Jeu jeu = new Jeu();
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		Hand hand3 = new Hand();

		// On crée le paquet de cartes territoires
		Carte C[] = Carte.initDeck();

		// Affichage du contenu : les cartes sont dans l'ordre alphabétique
		System.out.println("--- Deck non mélangé ---");
		System.out.println(C[0]);
		System.out.println(C[1]);
		System.out.println(C[2]);
		System.out.println(C[3]);
		System.out.println("\n\n");

		// On bat le jeu
		Jeu.battre(C);

		// Affichage du contenu : les cartes sont mélangées
		System.out.println("--- Deck mélangé ---");
		System.out.println(C[0]);
		System.out.println(C[1]);
		System.out.println(C[2]);
		System.out.println(C[3]);
		System.out.println("\n\n");

		// On crée 3 joueurs
		Player P1 = jeu.getPlayer(1);
		Player P2 = jeu.getPlayer(2);
		Player P3 = jeu.getPlayer(3);

		// On distribue les cartes aux trois joueurs
		jeu.distribuer(C, 3);

		// On affiche les cartes distribuées
		System.out.println("--- Joueur 1 14 cartes ---");
		P1.afficher();
		System.out.println("--- Joueur 2 15 cartes ---");
		P2.afficher();
		System.out.println("--- Joueur 3 15 cartes ---");
		P3.afficher();

		// On affiche le nombre d'armées par joueur
		System.out.println("Joueur1 Rouge : " + P1.countArmee() + " armées dont " + P1.countTerritoires()
				+ " territoires, " + P1.countFantassins() + " fantassins x1, " + P1.countCavaliers() + " cavaliers x2, "
				+ P1.countCanons() + " canons x3");
		System.out.println("Joueur2 Jaune : " + P2.countArmee() + " armées dont " + P2.countTerritoires()
				+ " territoires, " + P2.countFantassins() + " fantassins x1, " + P2.countCavaliers() + " cavaliers x2, "
				+ P2.countCanons() + " canons x3");
		System.out.println("Joueur3 Rose : " + P3.countArmee() + " armées dont " + P3.countTerritoires()
				+ " territoires, " + P3.countFantassins() + " fantassins x1, " + P3.countCavaliers() + " cavaliers x2, "
				+ P3.countCanons() + " canons x3");

		jeu.attribuerCouleur(P1);
		jeu.attribuerCouleur(P2);
		jeu.attribuerCouleur(P3);

		jeu.occuperDeBase(P1);
		jeu.occuperDeBase(P2);
		jeu.occuperDeBase(P3);

		System.out.println(jeu.getPlateau().getCasePlateau().get(13).getId());
		System.out.println(P1.getCouleur());
		System.out.println(jeu.getPlateau().getCasePlateau().get(13).getCouleur());

		// On affiche le nombre d'armées par joueur
		System.out.println("Joueur1 Rouge : " + P1.countArmee() + " armées dont " + P1.countTerritoires()
				+ " territoires, " + P1.countFantassins() + " fantassins x1, " + P1.countCavaliers() + " cavaliers x2, "
				+ P1.countCanons() + " canons x3");
		System.out.println("Joueur2 Jaune : " + P2.countArmee() + " armées dont " + P2.countTerritoires()
				+ " territoires, " + P2.countFantassins() + " fantassins x1, " + P2.countCavaliers() + " cavaliers x2, "
				+ P2.countCanons() + " canons x3");
		System.out.println("Joueur3 Rose : " + P3.countArmee() + " armées dont " + P3.countTerritoires()
				+ " territoires, " + P3.countFantassins() + " fantassins x1, " + P3.countCavaliers() + " cavaliers x2, "
				+ P3.countCanons() + " canons x3");

		jeu.placerArmees(P1, "-5;-2", 2);

		System.out.println("Joueur1 Rouge : " + P1.countArmee() + " armées dont " + P1.countTerritoires()
				+ " territoires, " + P1.countFantassins() + " fantassins x1, " + P1.countCavaliers() + " cavaliers x2, "
				+ P1.countCanons() + " canons x3");
	}
	
	
}
