package billet;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestFroisser.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestFroisser
{
    private Billet billet200;
    private Billet billet100;
    private Billet billet50;
    private Proprietaire Manu;
    private List<Billet> uneListeDeBillet = new ArrayList<Billet>();
    
    

    /**
     * Default constructor for test class TestFroisser
     */
    public TestFroisser()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        billet200 = new Billet(200, true);
        billet100 = new Billet(100, true);
        billet50 = new Billet(50, true);
        
        uneListeDeBillet.add(billet200);
        uneListeDeBillet.add(billet100);
        uneListeDeBillet.add(billet50);
        
        Manu = new Proprietaire("Manu", uneListeDeBillet);
        Manu.prendreBillet(billet200);
        Manu.prendreBillets(uneListeDeBillet);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TesterFroisserBillet()
    {
        assertEquals(false, billet200.froisserBillet());
    }

    @Test
    public void testerPrendreBillet()
    {
    	Proprietaire p = new Proprietaire("Manu", uneListeDeBillet);
    	assertEquals(200, p.prendreBillet(billet200));
    }
    
    @Test
    public void testerPrendreBillets()
    {
    	Proprietaire p = new Proprietaire("Manu", uneListeDeBillet);
    	assertEquals(350, p.prendreBillets(uneListeDeBillet));
    }
}


