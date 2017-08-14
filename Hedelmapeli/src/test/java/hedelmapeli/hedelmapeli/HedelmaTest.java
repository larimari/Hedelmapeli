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
public class HedelmaTest {
    Hedelma hedelma;
    
    public HedelmaTest() {
        this.hedelma = new Hedelma("nimi",1);
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
    public void palauttaakoNimen() {
        hedelma.getNimi();
        assertEquals("nimi", hedelma.getNimi());
    }
    
    @Test
    public void palauttaakoArvon() {
        hedelma.getArvo();
        assertEquals(1, hedelma.getArvo());
    }
    
    @Test
    public void asettaakoArvon() {
        hedelma.setArvo(2);
        assertEquals(2, hedelma.getArvo());
    }
    
    @Test
    public void asettaakoNimen() {
        hedelma.setNimi("hedelma");
        assertEquals("hedelma", hedelma.getNimi());
    }
    
    @Test
    public void vertaileekoKaksiOliotaOikein() {
        Hedelma toinen = new Hedelma("nimi",1);
        assertEquals(true, hedelma.equals(toinen));
    }
    
    @Test
    public void toimiikoHashCode() {
        Hedelma toinen = new Hedelma("nimi",1);
        assertEquals(toinen.hashCode(), hedelma.hashCode());
    }
}
