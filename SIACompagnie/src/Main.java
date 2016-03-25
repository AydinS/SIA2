import com.miage.compagnie.Parc_attraction;
import com.miage.compagnie.StateParcFerme;
import com.miage.compagnie.StateParcOuvert;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parc_attraction disney = new Parc_attraction();
		disney.setName("Parc Disneyland Paris");		
		Parc_attraction asterix = new Parc_attraction();
		asterix.setName("Parc Asterix");
		asterix.reduction(50);
		disney.reduction(80);
		
		disney.setEtatParc(new StateParcOuvert());
		asterix.setEtatParc(new StateParcFerme());
		////tuto tag
		disney.getEtatParc().gererParcAttraction(disney);
		asterix.getEtatParc().gererParcAttraction(asterix);
	}

}
