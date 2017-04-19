package risk.app.metier;

public class Armees {

	private int nbArmees;

	public Armees() {
		this.nbArmees = 0;
	}

	/**
	 * renvoie si une main est vide ou non.
	 */
	public boolean estVide() {
		return this.nbArmees == 0;
	}

	/**
	 * initialise le nombre d'armées à 0.
	 */
	public void clearArmees() {
		this.nbArmees = 0;
	}

	/**
	 * renvoie le nombre d'armées.
	 */
	public int getNbArmees() {
		return nbArmees;
	}

	/**
	 * set le nombre d'armées en réserve
	 */
	public void setNbArmees(int nbArmees) {
		this.nbArmees = nbArmees;
	}

}
