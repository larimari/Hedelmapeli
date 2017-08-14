/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class Kone { //koneella on voitot, kaikki hedelmät ja niiden arvot
    int voitto;
    Rivi rivi;
    private List<Hedelma> kaikkiHedelmat;

    public Kone() {
        this.voitto = voitto;
        Rivi rivi = new Rivi();
        this.kaikkiHedelmat = new ArrayList<>(); //kaikki hedelmät
    }
    
    public void lisaaHedelma() { //lisataan listaan kaikki hedelmat
        Hedelma tahti = new Hedelma("tahti", 10);
        kaikkiHedelmat.add(tahti);
        Hedelma vesimeloni = new Hedelma("vesimeloni", 9);
        kaikkiHedelmat.add(vesimeloni);
        Hedelma viinirypale = new Hedelma("viinirypale", 8);
        kaikkiHedelmat.add(viinirypale);
        Hedelma appelsiini = new Hedelma("appelsiini", 7);
        kaikkiHedelmat.add(appelsiini);
        Hedelma kirsikka = new Hedelma("kirsikka", 6);
        kaikkiHedelmat.add(kirsikka);
        Hedelma luumu = new Hedelma("luumu", 5);
        kaikkiHedelmat.add(luumu);
        Hedelma sitruuna = new Hedelma("sitruuna", 4);
        kaikkiHedelmat.add(sitruuna);
        Hedelma mansikka = new Hedelma("mansikka", 3);
        kaikkiHedelmat.add(mansikka);
    }
    
    public List getHedelmat() {
        return this.kaikkiHedelmat;
    }
    
    public void pelaa() { //pelaaminen
        //pelaamaan pääsee jos on tarpeeksi rahaa
        rivi.arvo(kaikkiHedelmat);
        //rahoista vähennetään panos, joka on alussa vakio
        rivi.tarkistaVoitto();
        if (rivi.voitto == 0) { //jos ei ole 3 samaa hedelmää, kone ottaa itselleen listan ja tarkistaa
            List<Hedelma> arvotutHedelmat = rivi.getHedelmat(); //muut kombinaatiot(ekstra?)
        }
        //rahoihin lisätään voitto
    }
    
    public void tarkistaRahat() {
        //pitää vielä miettiä, miten kone tuntee pelaajan
    }
    
}