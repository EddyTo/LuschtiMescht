package risk.ws.rest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import risk.app.metier.Kase;
import risk.app.metier.MoteurDuJeu;
import risk.app.metier.Plateau;
import risk.app.metier.Position;
import risk.app.metier.Continent;
import risk.app.model.User;

@Path("/init")
public class Init {

	@Context
	private HttpServletRequest httpRequest;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/addPlayer")
	public String addPlayer() {

		String result;
		Object tmp = httpRequest.getServletContext().getAttribute("playerNbr");

		int playerNbr;
		if (tmp == null) {
			playerNbr = 0;

		} else {
			playerNbr = (int) tmp;
		}
		playerNbr++;
		switch (playerNbr) {
		case 1:
			result = "Rouge";
			break;
		case 2:
			result = "Jaune";
			break;
		case 3:
			result = "Rose";
			MoteurDuJeu mJeu = new MoteurDuJeu();
			mJeu.initialiserJeu(3);
			httpRequest.getServletContext().setAttribute("moteurJeu", mJeu);
			break;
		default:
			result = "Over";
		}
		httpRequest.getServletContext().setAttribute("playerNbr", playerNbr);

		return result;

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadGame")
	public Kase[] loadGame() {

		MoteurDuJeu mJeu = (MoteurDuJeu) httpRequest.getServletContext().getAttribute("moteurJeu");
		Plateau plateau = mJeu.jeu.getPlateau();
		ArrayList<Position> casePlateau = plateau.getCasePlateau();

		//////// Mock casePlateau
		
//		ArrayList<Position> casePlateau = new ArrayList<Position>();
//		Position pos1 = new Position(1, 0);
//		casePlateau.add(pos1);
//		Position pos2 = new Position(0, 1);
//		casePlateau.add(pos2);
//		Position pos3 = new Position(0, 3);
//		casePlateau.add(pos3);
//		Position pos4 = new Position(-3, -2);
//		casePlateau.add(pos4);
//		Position pos5 = new Position(-9, 0);
//		casePlateau.add(pos5);
//	
		/////// fin Mock casePlateau
				
		int lng = casePlateau.size();
		
		Kase[] kases = new Kase[lng];

		for (int i = 0; i < lng; i++) {
			Position position = casePlateau.get(i);
			String[] voisins = {position.getNordEst(),position.getEst(),position.getSudEst(),position.getSudOuest(),position.getOuest(),position.getNordOuest()};
			int type=5;
			Continent continent = position.getContinent();

			switch (continent) {
			case Ocean :
				type = 0;
				break;
			case Pont:
				type = 1;
				break;
			case Terre:
				type = 2;
				break;
			}
			
			kases[i]= new Kase(voisins, position.getCouleur(), position.getContenu(), position.getId(),type);
		}
		return kases;
	}

}
