package exo3.ocp;

public class Vendeur extends Employe{

	 private int commission;

	public Vendeur(String nom, int annee_entree, int commission) {
		
		super(nom, annee_entree);
		this.commission = commission;
	}
	
	
	@Override
	public int salaire() {
		return super.salaire() + commission;
	}
	

}
