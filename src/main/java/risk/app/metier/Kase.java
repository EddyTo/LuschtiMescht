package risk.app.metier;

public class Kase {
	
	String[] voisins;
	String couleur;
	int unite;
	String id;
	int type;
	
	public Kase() {
	}
	
	public Kase(String[] voisins, String couleur, int unite, String id, int type) {
		super();
		this.voisins = voisins;
		this.couleur = couleur;
		this.unite = unite;
		this.id = id;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String[] getVoisins() {
		return voisins;
	}

	public void setVoisins(String[] voisins) {
		this.voisins = voisins;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getUnite() {
		return unite;
	}

	public void setUnite(int unite) {
		this.unite = unite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
