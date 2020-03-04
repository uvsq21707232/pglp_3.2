package exo3.ocp;

import java.util.ArrayList;

public class Societe {
	
	private ArrayList<Employe> employes_societe;
	
	public  Societe () {
		
		employes_societe= new ArrayList<Employe>();
	}
	
	/* Ajouter un employer a la liste */
	
	public void ajouter_empolye(final Employe e) {
		
		if (!employes_societe.contains(e)) {
			employes_societe.add(e);
		}
		}
	
	
	public void supprimer_employe(final Employe e) {
		
		if (employes_societe.contains(e)) {
			employes_societe.remove(e);
		}
	}
	

	/* méthode pour calculer la somme des salaires de tous les employes  de la sociéte*/
	
	public int calculSalairesTotal() {
		int somme_salaires=0;
		
		for(Employe employe: employes_societe) {
			 somme_salaires+= employe.salaire();
		}
		
		return somme_salaires;
	}
	
}