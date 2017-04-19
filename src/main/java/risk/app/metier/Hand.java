package risk.app.metier;

/**
 * @(#)Hand.java La classe Carte est une classe dédier à présenter la main d'un
 *               joueur
 */
public class Hand {

	private Carte ListeCard[];
	private int NCard;

	/**
	 * constructeur par initialisation
	 */
	public Hand() {
		this.ListeCard = new Carte[44];
		this.NCard = 0;
	}

	/**
	 * constructeur par copie.
	 */
	public Hand(Hand H) {
		this.ListeCard = new Carte[44];
		for (int i = 0; i < H.NCard; i++) {
			this.ListeCard[i] = new Carte(H.ListeCard[i]);
		}
		this.NCard = H.NCard;

	}

	/**
	 * renvoie si une main est vide ou non.
	 */
	public boolean estVide() {
		return this.NCard == 0;
	}

	/**
	 * renvoie le nombre de carte dans une main.
	 */
	public int getNCard() {
		return this.NCard;
	}

	/**
	 * insert une carte à la fin de la main <br>
	 * Renvoie Vrai si l'insertion est appliqué
	 */
	public boolean insertCard(Carte C) {
		if (this.NCard < 44) {
			this.ListeCard[this.NCard] = new Carte(C);
			this.NCard++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * supprime la dernière carte de la main Renvoie V si la suppression se
	 * passe bien.
	 */
	public boolean deletHead() {
		if (this.NCard > 0) {
			this.ListeCard[this.NCard - 1] = null;
			this.NCard--;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * supprime la première carte de la main Renvoie V si la suppression se
	 * passe bien.
	 */
	public boolean deletFirst() {
		if (this.NCard > 0) {
			for (int i = 1; i < this.NCard; i++) {
				this.ListeCard[i - 1] = this.ListeCard[i];
			}
			this.ListeCard[this.NCard - 1] = null;
			this.NCard--;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * renvoie la dernière carte de la main <br>
	 * Renvoie <b>null</b> si ce n'est pas possible.
	 */
	public Carte getHead() {
		if (this.NCard != 0) {
			return this.ListeCard[this.NCard - 1];
		} else {
			return null;
		}
	}

	/**
	 * renvoie la premiere carte de la main <br>
	 * Renvoie <b>null</b> si ce n'est pas possible.
	 */
	public Carte getFirstCard() {
		if (this.NCard != 0) {
			return this.ListeCard[0];
		} else {
			return null;
		}
	}

	/**
	 * affiche une main
	 */
	public void afficher() {
		for (int i = 0; i < this.NCard; i++) {
			this.ListeCard[i].afficher();
		}
		System.out.println("");
	}

	/**
	 * renvoie les territoires de la main courante
	 */
	public String toString() {
		String S = new String("");
		for (int i = 0; i < this.NCard; i++) {
			S = S + this.ListeCard[i].getTerritoire();
		}
		return S;
	}

	/**
	 * renvoie les cartes (territoires + armes) de la main courante
	 */
	public String toString2() {
		String S = new String("");
		for (int i = 0; i < this.NCard; i++) {
			S = S + this.ListeCard[i].toString();
			S = S + " ";
		}
		return S;
	}

	/**
	 * initialise la main à 0 carte.
	 */
	public void clearHand() {
		this.NCard = 0;
		this.ListeCard = new Carte[44];
	}

}
