package com.miage.compagnie;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of class Parc_attraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parc_attraction
{
    @Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0 == this)
			return true;
		if (getClass() != arg0.getClass())
			return false;
		Parc_attraction parc = (Parc_attraction) arg0;
		return parc.name.equals(name) && parc.nb_attraction == nb_attraction && parc.nb_entree == nb_entree && parc.nb_visitor == nb_visitor;
	}

	// instance variables - replace the example below with your own
    private int nb_attraction;
    private int nb_entree;
    private int nb_visitor;
    private String name;
    private Pays pays;

    /**
     * Constructor for objects of class Parc_attraction
     */
    public Parc_attraction()
    {
        // initialise instance variables
        nb_attraction = 54;
        nb_entree = 11000;
        nb_visitor = 200;
        name = "Disneyland";
    }
    
    public Parc_attraction(Pays p)
    {
        // initialise instance variables
        nb_attraction = 54;
        nb_entree = 11000;
        nb_visitor = 200;
        name = "Disneyland";
        this.pays = p;
    }
    
    public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		if(pays.getName() != "")
			this.pays = pays;
	}

	/**
     * An example of a method - replace this comment with your own
     * 
     * @return     
     */
    public int getNbAttraction()
    {
        return this.nb_attraction;
    }
    
    public void setNbAttraction(int n)
    {
        this.nb_attraction = n;
    }
    
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     
     */
    public int getEntree()
    {
        return this.nb_entree;
    }
    
    public void setEntree(int n)
    {
        this.nb_entree = n;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     
     */
    public int getNbVisitor()
    {
        return this.nb_visitor;
    }
    
    public void setNbVisitor(int n)
    {
        this.nb_visitor = n;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     
     */
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }

}
