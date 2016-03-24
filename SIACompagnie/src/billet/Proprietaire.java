package billet;

import java.util.ArrayList;
import java.util.List;


/**
 * Write a description of class Proprietaire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proprietaire
{
    // instance variables - replace the example below with your own
    private String nom;
    private List<Billet> uneListeDeBillet = new ArrayList<Billet>();

    /**
     * Constructor for objects of class Proprietaire
     */
    public Proprietaire(String nomm,List<Billet> b){
        nom = nomm;
        uneListeDeBillet = b;
    }

    public String getNom(){
        return nom;
    }
    
    public int prendreBillet(Billet b){
    	uneListeDeBillet.add(b);
        return b.getValeur();
    }
    
    public int prendreBillets(List<Billet> b){
    	int valeurTotal=0;
    	uneListeDeBillet = b;
    	
    	for(Billet unBillet : b){
    		valeurTotal += unBillet.getValeur();
            uneListeDeBillet.add(unBillet);
    	}
        return valeurTotal;
    }
    
}
