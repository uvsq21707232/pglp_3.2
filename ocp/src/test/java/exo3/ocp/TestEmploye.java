package exo3.ocp;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmploye {
	
	/* Test de la méthode salaire*/
	@Test
	public void testSalaire() throws Exception {
		Employe emp= new Employe("roger",2019);
		assertTrue(emp.salaire() == 1500);// salaire=1520
	}

}
