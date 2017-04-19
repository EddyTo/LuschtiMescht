package risk.app.metier;

/**
 * @(#)Player.java
 * La classe Carte est une classe dédier à présenter un joueur 
 * avec l'historique de ses mains.
 */

import java.util.*;

public class Player {
	private Hand hand;
	private List<Hand> listeHand;
	private Armees armee;
	private String couleur;

	/**
	 * Constructeur par initialisation.
	 */
	public Player(String couleur) {
		this.listeHand = new Vector<Hand>();
		hand = new Hand();
		armee = new Armees();
		this.couleur = couleur;
	}

	/**
	 * ajoute une main a l'historique des mains jouées.
	 */
	public void addHand() {
		Hand t = new Hand(this.hand);
		this.listeHand.add(t);
	}

	/**
	 * ajoute une carte dans la main courante du joueur.
	 */
	public void addCard(Carte C) {
		this.hand.insertCard(C);
	}

	/**
	 * ramasserles cartes d'une autre main et les inserer dans la main courante.
	 */
	public void ramasser(Hand table) {
		try {
			while (table.getNCard() != 0) {
				Carte C = new Carte(table.getHead());
				table.deletHand();
				this.hand.insertCard(C);

			}
		} catch (NullPointerException e) {
			System.out.println("error!");
		}

	}

	/**
	 * affiche la main courante.
	 */
	public void afficher() {
		this.hand.afficher();
	}

	/**
	 * renvoie les territoires de la main courante
	 */
	public String toString() {
		return this.hand.toString();
	}

	/**
	 * renvoie les cartes (territoires + armes) de la main courante
	 */
	public String toString2() {
		return this.hand.toString2();
	}

	/**
	 * set le nombre d'armées en réserve
	 */
	public void setNbArmees(int nbArmees) {
		this.armee.setNbArmees(nbArmees);
	}

	public Armees getArmee() {
		return armee;
	}

	public Hand getHand() {
		return hand;
	}

	public int countTerritoires() {
		return this.hand.countTerritoires();
	}

	public int countFantassins() {
		return this.hand.countArmes("fantassin");
	}

	public int countCanons() {
		return this.hand.countArmes("canon");
	}

	public int countCavaliers() {
		return this.hand.countArmes("cavalier");
	}
	
	public int countArmee() {
		return this.armee.getNbArmees();
	}

	public String getCouleur() {
		return couleur;
	}

}