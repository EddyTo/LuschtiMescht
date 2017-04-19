package risk.app.metier;

public class PionsRouges extends Pions {

	public PionsRouges() {
		super("Rouge");
	}

	public String toString() {
		String S = this.getCouleur();
		return S;
	}
}
