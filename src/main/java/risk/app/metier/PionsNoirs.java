package risk.app.metier;

public class PionsNoirs extends Pions {

	public PionsNoirs() {
		super("Noir");
	}

	public String toString() {
		String S = this.getCouleur();
		return S;
	}
}
