package risk.app.metier;

public class PionsRoses extends Pions {

	public PionsRoses() {
		super("Rose");
	}

	public String toString() {
		String S = this.getCouleur();
		return S;
	}
}
