package com.miage.compagnie;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Pays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pays
{
    @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
    	if(obj == this)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Pays p = (Pays) obj;
		return p.listeParc.equals(listeParc) && p.name.equals(name) && p.parc.equals(parc);
		
	}

	// instance variables - replace the example below with your own
    private String name;
    private Parc_attraction parc;
    private List<Parc_attraction> listeParc = new ArrayList<>();

    /**
     * Constructor for objects of class Pays
     */
    public Pays()
    {
        // initialise instance variables
        this.name = "France";
        this.parc = new Parc_attraction(this);
        this.listeParc.add(parc);
    }

    public String getNamePays()
    {
        return this.name;
    }
    
    public void setNamePays(String n)
    {
        this.name = n;
    }
    
    
    public Parc_attraction getParc()
    {
        return this.parc;
    }
    
    public void setParc(Parc_attraction n)
    {
        this.parc = n;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Parc_attraction> getListeParc() {
		return listeParc;
	}

	public void setListeParc(List<Parc_attraction> listeParc) {
		this.listeParc = listeParc;
	}

	public int nbDispo()
    {
        int nb_restant = parc.getEntree() - parc.getNbVisitor();
        
        return nb_restant;
    }
	
	public int getNbTotalVisitor()
	{
		int sum = 0;
		for(Parc_attraction p : listeParc){
			sum+=p.getNbVisitor();
		}
		return sum;
	}
}
