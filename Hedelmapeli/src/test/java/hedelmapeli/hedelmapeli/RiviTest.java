package hedelmapeli.hedelmapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hedelmapeli.hedelmapeli.Hedelma;
import hedelmapeli.hedelmapeli.Rivi;
import java.util.ArrayList;
import java.util.List;
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
public class RiviTest {
    
    Rivi rivi;
    
    public RiviTest() {
        this.rivi = new Rivi();
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
    public void onkoRivissaKolmeAlkiotaArvonnanJalkeen(){
        
        List<Hedelma> hedelmat = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            hedelmat.add(new Hedelma("nimi",1));
        }
        
        this.rivi.arvo(hedelmat);
        this.rivi.arvo(hedelmat);
        
        assertEquals(3,this.rivi.getHedelmat().size());
    }
    
    @Test
    public void tulostaakoKaikkiHedelmat() {
        List<Hedelma> tulostettavat = new ArrayList<>();
        tulostettavat.add(new Hedelma("rypale",1));
        tulostettavat.add(new Hedelma("tahti",2));
        
        rivi.setHedelmat(tulostettavat);

        assertEquals("rypale tahti ", rivi.tulostaHedelmat());
    }
    
    @Test
    public void toimiikoVoitto() {
        rivi.setVoitto(2);
        assertEquals(2,rivi.getVoitto());
    }
    
    @Test
    public void tarkistaaOvatkoKaikkiHedelmatSamoja() {
        List<Hedelma> kaikkiSamoja = new ArrayList<>();
        kaikkiSamoja.add(new Hedelma("tahti", 1));
        kaikkiSamoja.add(new Hedelma("tahti", 1));
        kaikkiSamoja.add(new Hedelma("tahti", 1));
        
        rivi.setHedelmat(kaikkiSamoja);
        rivi.tarkistaVoitto();
        
        assertEquals(1,rivi.getVoitto());
    }
}
