package exo3.ocp;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestManager {
	
	/* tester la méthode salaire de la classe Manager*/
	@Test
	public void testSalaireManager() {
		Manager manager = new Manager("john",2019,2);
		assertTrue(manager.salaire() == 1520 + 200);//salaire 1720
	}

}
