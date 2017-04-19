package risk.app.metier;

public class MoteurDuJeu {
	public static void main(String[] args) {
		Plateau plateau = new Plateau();
		Jeu jeu = new Jeu();
		Carte C[] = Carte.initDeck();
		//TODO
		int nbJoueurs = 0; //nbJoueurs est a définir par l'utilisateur
		
		if (nbJoueurs == 2){
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
		}
		else if (nbJoueurs == 3){
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
		}
		else if (nbJoueurs == 4){
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
		}
		else if (nbJoueurs == 5){
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
			Player P5 = jeu.getPlayer(5);
		}
		else {
			Player P1 = jeu.getPlayer(1);
			Player P2 = jeu.getPlayer(2);
			Player P3 = jeu.getPlayer(3);
			Player P4 = jeu.getPlayer(4);
			Player P5 = jeu.getPlayer(5);
			Player P6 = jeu.getPlayer(6);
		}
		
		Jeu.battre(C);
		jeu.distribuer(C, nbJoueurs);
		
		
		
	}
}
