package exo3.ocp;

import java.util.Date;
import java.util.List;

public class Employe{
	
	 protected double salaire=1500;
	 protected  int annee_entree;
	 protected  int annee_cours;
	
	public Employe(double salaire, int annee_entree, int annee_cours) {

		this.salaire = salaire;
		this.annee_entree = annee_entree;
		this.annee_cours = annee_cours;
	}


public double salaire() {
	
	 double diff = annee_cours- annee_entree ;
	 if (diff>0) {
				double sal_inter=salaire+(diff*20);
				return sal_inter;
		 
	 } else
	return  salaire;
}



public  double salaire_total(List<Employe> employes) {
	double salaire_totale = 0;
	
	for (Employe emp : employes) {
		
	
	}
	
	return  salaire_totale;
}


}
		
	
	


