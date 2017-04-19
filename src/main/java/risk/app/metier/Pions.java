package risk.app.metier;

public class Pions {

	private String couleur;
	private Armees armee;

	public Pions(String couleur) {
		this.couleur = couleur;
		this.armee = new Armees();
	}

	public String getCouleur() {
		return couleur;
	}

	public Armees getArmee() {
		return armee;
	}

	public void setArmee(Armees armee) {
		this.armee = armee;
	}

}
