/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class PelaajaTest {
    Pelaaja pelaaja;
    
    public PelaajaTest() {
        this.pelaaja = new Pelaaja("Maria", 20);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pelaajanNimenGetJaSet() {
        pelaaja.setNimi("Matti");
        
        assertEquals("Matti", pelaaja.getNimi());
    }
    
    @Test
    public void pelaajanRahatGetJaSet() {
        pelaaja.setRahat(10);
        
        //assertEquals(10, pelaaja.getRahat());
    }
}
