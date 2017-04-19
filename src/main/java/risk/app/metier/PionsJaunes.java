package risk.app.metier;

public class PionsJaunes extends Pions {

	public PionsJaunes() {
		super("Jaune");
	}

	public String toString() {
		String S = this.getCouleur();
		return S;
	}
}
