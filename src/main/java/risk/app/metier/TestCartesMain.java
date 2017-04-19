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
		System.out.println(C);
		System.out.println(C[0]);
		System.out.println(C[1]);
		System.out.println(C[2]);
		System.out.println(C[3]);

		// On bat le jeu
		Jeu.battre(C);

		// Affichage du contenu : les cartes sont mélangées
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
		System.out.println("--- Joueur 1 14 cartes ---");
		P1.afficher();
		System.out.println("--- Joueur 2 15 cartes ---");
		P2.afficher();
		System.out.println("--- Joueur 3 15 cartes ---");
		P3.afficher();

		// On crée un pion de chaque couleur
		PionsRouges Prouge = new PionsRouges();
		PionsJaunes Pjaune = new PionsJaunes();
		PionsRoses Prose = new PionsRoses();

		// On affiche les pions et nombre d'armées associées
		System.out.println(Prouge + " " + P1.getArmee().getNbArmees() + " armées dont " + P1.countTerritoires()
				+ " territoires, " + P1.countFantassins() + " fantassins x1, " + P1.countCavaliers() + " cavaliers x2, "
				+ P1.countCanons() + " canons x3");
		System.out.println(Pjaune + " " + P2.getArmee().getNbArmees() + " armées dont " + P2.countTerritoires()
				+ " territoires, " + P2.countFantassins() + " fantassins x1, " + P2.countCavaliers() + " cavaliers x2, "
				+ P2.countCanons() + " canons x3");
		System.out.println(Prose + " " + P3.getArmee().getNbArmees() + " armées dont " + P3.countTerritoires()
				+ " territoires, " + P3.countFantassins() + " fantassins x1, " + P3.countCavaliers() + " cavaliers x2, "
				+ P3.countCanons() + " canons x3");

		System.out.println(P1.countTerritoires());
		System.out.println(P2.countTerritoires());
		System.out.println(P3.countTerritoires());
	}

}
