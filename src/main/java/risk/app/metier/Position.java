package risk.app.metier;

public class Position {
	private int x;
	private int y;
	private String id;
	private String est;
	private String ouest;
	private String nordEst;
	private String sudEst;
	private String nordOuest;
	private String sudOuest;
	private Continent continent;
	private int contenu;
	private String couleur;
	

	public Position(int x, int y) {
		this.x=x;
		this.y=y;
		this.id=(x + ";" + y);
		this.est = ((x+2) + ";" + y);
		this.ouest = ((x-2) + ";" + y);
		this.nordEst = ((x+1) + ";" + (y+1));
		this.sudEst = ((x+1) + ";" + (y-1));
		this.nordOuest = ((x-1) + ";" + (y+1));
		this.sudOuest = ((x-1) + ";" + (y-1));
		this.continent = editContinent(id);
		this.contenu=0;
		this.couleur="";
	}
	
	private Continent editContinent(String id) {
		if (id=="-6;3" || id=="1;2" || id=="0;-1" || id=="-3;-2" ||
			id=="1;-2" || id=="4;-3" || id=="6;-3"
			){
			return Continent.Pont;
		}
		else if (id=="-5;0"|| id=="-6;-1"|| id=="-4;-1"|| id=="-5;-2" ||
				id=="3;-4" || id=="5;-4"|| id=="2;-5"|| id=="4;-5" ||
				id=="5;4" || id=="4;3"|| id=="6;3"|| id=="5;2"||
				id=="4;1"|| id=="6;1"|| id=="5;0"|| id=="7;0"||
				id=="4;-1"|| id=="6;-1"|| id=="5;-2"|| id=="7;-2" ||
				id=="3;2" || id=="0;1"|| id=="2;1"|| id=="1;0"||
				id=="3;0"|| id=="2;-1"|| id=="3;-2" || id=="-1;-2" ||
				id=="-2;-3"|| id=="0;-3"|| id=="-3;-4"|| id=="-1;-4"||
				id=="-2;-5" || id=="-5;4" || id=="-3;4"|| id=="-1;4"||
				id=="-4;3"|| id=="-2;3" || id=="0;3"|| id=="-5;2"||
				id=="-3;2"|| id=="-4;1"
				){
			return Continent.Terre;
		}
		else {
			return Continent.Ocean;
		}
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEst() {
		return est;
	}


	public void setEst(String est) {
		this.est = est;
	}


	public String getOuest() {
		return ouest;
	}


	public void setOuest(String ouest) {
		this.ouest = ouest;
	}


	public String getNordEst() {
		return nordEst;
	}


	public void setNordEst(String nordEst) {
		this.nordEst = nordEst;
	}


	public String getSudEst() {
		return sudEst;
	}


	public void setSudEst(String sudEst) {
		this.sudEst = sudEst;
	}


	public String getNordOuest() {
		return nordOuest;
	}


	public void setNordOuest(String nordOuest) {
		this.nordOuest = nordOuest;
	}


	public String getSudOuest() {
		return sudOuest;
	}


	public void setSudOuest(String sudOuest) {
		this.sudOuest = sudOuest;
	}

	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	
	public int getContenu() {
		return contenu;
	}


	public void setContenu(int contenu) {
		this.contenu = contenu;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
