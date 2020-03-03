package exo3.ocp;

public class Manager extends Employe {

	 private int personnel_ordre;

	public Manager(String nom, int annee_entree, int personnel_ordre) {
		super(nom, annee_entree);
		this.personnel_ordre=personnel_ordre;
	}
	
	 
	@Override
	public int salaire() {
		int nvx_salaire= super.salaire()+(personnel_ordre*100);
		
		return nvx_salaire ;
	
	}



	

}
