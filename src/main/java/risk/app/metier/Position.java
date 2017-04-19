package risk.app.metier;

public class Position {
	private boolean selectionnee;
	private Continent continent;
	private int id;
	private int contenu;
	private int est;
	private int ouest;
	private int nordEst;
	private int sudEst;
	private int nordOuest;
	private int sudOuest;
	

	public Position(Continent continent, int id) {
		this.continent = continent;
		this.id = id;
		this.contenu=0;
		if (id>=0 && id<=5 || id>=85 && id<=5){
			
		}
		this.est = e;
		this.ouest = o;
		this.nordEst = ne;
		this.sudEst = se;
		this.nordOuest = no;
		this.sudOuest = so;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSelectionnee() {
		return selectionnee;
	}

	public void setSelectionnee(boolean selectionnee) {
		this.selectionnee = selectionnee;
	}
	

}
