package risk.app.metier;

public class PionsBleus extends Pions {

	public PionsBleus() {
		super("Bleu");
	}

	public String toString() {
		String S = this.getCouleur();
		return S;
	}
}
