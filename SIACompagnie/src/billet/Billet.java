package billet;

/**
 * Write a description of class Billet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billet
{
    // instance variables - replace the example below with your own
    private int valeurMonetaire;
    private boolean etat;
    private Proprietaire unProprietaire;

    /**
     * Constructor for objects of class Billet
     */
    public Billet(int valeurMonetairee, boolean etat){
        valeurMonetaire = valeurMonetairee;
        this.etat = etat;
    }
    
    public int getValeur(){
        return valeurMonetaire;
    }
    
    public boolean getEtat(){
        return etat;
    }
    
    public boolean froisserBillet(){
        etat = false;
        return etat;
    }

	public Proprietaire getUnProprietaire() {
		return unProprietaire;
	}

	public void setUnProprietaire(Proprietaire unProprietaire) {
		this.unProprietaire = unProprietaire;
	}

}
