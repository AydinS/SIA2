package com.miage.compagnie;

public class StateParcFerme implements StateParcAttraction {

	@Override
	public void gererParcAttraction(Parc_attraction parc) {
		// TODO Auto-generated method stub
		System.out.println("Fermeture du parc"+ parc.getName() + " !");
		System.out.println("Stats du parc à la fermeture: ");
		System.out.println("\tNb Entree: "+parc.getEntree());
		System.out.println("\tNb Visiteurs: "+parc.getNbVisitor());
		System.out.println("Tous les visiteurs ont 30 minutes pour quitter le parc!");
		parc.setNbVisitor(0);
	}

}
