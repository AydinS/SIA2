package com.miage.compagnie;

public class StateParcOuvert implements StateParcAttraction {

	@Override
	public void gererParcAttraction(Parc_attraction parc) {
		// TODO Auto-generated method stub
		System.out.println("Le parc"+ parc.getName() + "est ouvert!");
		System.out.println("Venez essayer nos" + parc.getNbAttraction() + "attraction(s)!");
		System.out.println("50€ l'entrée! 25€ pour les enfants!");
		for(int i = 0;i<4;i++){
			int nbEntree = (i == 0 ? parc.getEntree() : parc.getEntree()*i);
			System.out.println("Semaine "+i+": nb Entree:"+ nbEntree);
			parc.setEntree(nbEntree);
			parc.setNbVisitor((int) (nbEntree*1.5));
		}
	}

}
