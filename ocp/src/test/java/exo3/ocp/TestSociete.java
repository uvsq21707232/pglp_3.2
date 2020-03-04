package exo3.ocp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSociete {

	@Test
	public void tesSalairesTotal() {
		Societe societe=new Societe();
		Employe employe= new Employe("federer",2018); //salaire 1500+40
		Vendeur vendeur= new Vendeur("nadal",2018,200);//salaire 1500+40+200
		Manager manager=new Manager("jason",2018,20); //salaire +1500+40+2000
		societe.ajouter_empolye(employe);;
		societe.ajouter_empolye(vendeur);
		societe.ajouter_empolye(manager);
		
		
		
		int salaire_tot=1500+40+1500+40+200 +1500+40+2000;
		
		assertEquals(salaire_tot,societe.calculSalairesTotal(),0); // salaire 0
		
	}
	
	/*liste vide */
	@Test
	public void test() {
		Societe societe=new Societe();
		assertTrue(societe.calculSalairesTotal() == 0);
	}
	
	
	
	
	
}
