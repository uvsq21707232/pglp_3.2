package exo3.ocp;
import org.junit.Test;
import static org.junit.Assert.assertTrue;



public class TestVendeur {

	/* tester la méthode salire de la classe vendeur*/
	@Test
	public void testSalaireVendeur() {
		Vendeur vendeur = new Vendeur("nadal",2019,300);
		assertTrue(vendeur.salaire() == 1500 + 300);//salaire 1820
	}
		

}
