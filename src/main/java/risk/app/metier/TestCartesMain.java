package risk.app.metier;

public class TestCartesMain {

	public static void main(String[] args) {

		// On crée le jeu et 3 joueurs
		Jeu jeu = new Jeu();
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		Hand hand3 = new Hand();

		// On crée le paquet de cartes territoires
		Carte C[] = Jeu.init();

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

		// On crée 3 joueurs

		Player P1 = jeu.getPlayer(1);
		Player P2 = jeu.getPlayer(2);
		Player P3 = jeu.getPlayer(3);

		// On distribue les cartes aux trois joueurs
		jeu.distribuer(C, 3);

		P1.afficher();
		P2.afficher();
		P3.afficher();

		P1.addHand();
		P2.addHand();
		P3.addHand();

	}

}
