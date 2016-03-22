package com.miage.compagnie;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * The test class Parc_attractionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Parc_attractionTest
{
    private Pays pays1;
    private Parc_attraction parc1;

    
    /**
     * Default constructor for test class Parc_attractionTest
     */
    public Parc_attractionTest()
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
        pays1 = new Pays();
        parc1 = new Parc_attraction();
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
    public void TestGetNbVisitor()
    {
        Parc_attraction parc_att1 = new Parc_attraction();
        assertEquals(200, parc_att1.getNbVisitor());
    }

    @Test
    public void TestPaysNbDispo()
    {
        assertEquals(10800, pays1.nbDispo());
    }
    
    @Test
    public void TestNamePays()
    {
        getTestSuperExtractMethod();
    }

	private void getTestSuperExtractMethod() {
		pays1.setName("France");
        pays1.getListeParc().add(new Parc_attraction());
     
        assertEquals(2, pays1.getListeParc().size());
    	assertEquals("France", pays1.getName());
    	assertEquals(400, pays1.getNbTotalVisitor());
    	
    	parc1.setPays(pays1);
    	assertEquals("France", parc1.getPays().getName());
	}
	
	@Test
	public void testMethodEqualsPays(){
		Pays france = new Pays();
		Pays france3 = new Pays();
		Pays france2 = new Pays();
		Pays Allemagne = new Pays();
		france.setName("France");
		france2.setName("France2");
		france3.setName("France");
		assertNotEquals(france, france2);
		assertEquals(france, france3);
		Parc_attraction parcFrance = new Parc_attraction();
		Parc_attraction parcAllemagne = new Parc_attraction();
		parcAllemagne.setPays(Allemagne);
		parcAllemagne.setName("DisneyLand Berlin");
		parcFrance.setPays(france);
		parcFrance.setName("DisneyLand Paris");
		assertNotEquals(parcAllemagne, parcFrance);
	}
    
}





