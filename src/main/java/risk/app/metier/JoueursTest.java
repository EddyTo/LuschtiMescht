package risk.app.metier;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

public class JoueursTest {

	Joueurs joueurs = new Joueurs();
	
	@Test
	public void test() {
		assertEquals("", joueurs.listeJoueurs(1));
	}

}
