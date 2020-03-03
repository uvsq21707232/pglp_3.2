package exo3.ocp;
import java.util.*;


public class Employe{
	
	 private final String nom;
	 private final int annee_entree;
	 private final int salaire=1500;
	
	
	public Employe(String nom, int annee_entree) {
		this.nom=nom;
		this.annee_entree = annee_entree;
	
	}


	
public int salaire() {
	
		Calendar calendrier = Calendar.getInstance();
		int annee_en_cours = calendrier.get(Calendar.YEAR);
		int diff= annee_en_cours-annee_entree;
		
	 if (diff>0) {
	      int new_salaire=1500+(diff*20);
				
	return new_salaire;
		 
	 } else
	return  salaire ;
}

}
		
	
	


