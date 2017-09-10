/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maria
 */

/**
 * Koneella on voitot, kaikki hedelmät ja niiden arvot. Sekä pelaaminen tapahtuu
 * täällä. 
 * 
 */
public class Kone {
    int voitto;
    Rivi rivi;
    private List<Hedelma> kaikkiHedelmat;
    Pelaaja pelaaja;
    public Scanner lukija;
    String nimi;
    int panos;
    int saldo;

    public Kone() {
        this.voitto = voitto;
        rivi = new Rivi();
        this.kaikkiHedelmat = new ArrayList<>();            //kaikki hedelmät
        this.lukija = new Scanner(System.in);
        this.saldo = 1000;
        this.panos = 1;
    }
    /**
     * Listaan lisätään kaikki hedelmät.
     */
    public void lisaaHedelma() {            
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
    
    /**
     * Tässä luodaan pelaaja sekä asetetaan saldo ja panos.
     */
    
<<<<<<< HEAD
//    public void alkukysymykset() {
//        System.out.println("Tervetuloa pelaamaan Hedelmäpeliä!");
//        
//        System.out.println("Mikä on nimesi? ");
//        nimi = lukija.nextLine();
//        
//        System.out.println("Mikä on saldo? (kokonaisluku)");
//        saldo = Integer.parseInt(lukija.nextLine());
//        
//        this.pelaaja = new Pelaaja(nimi, saldo);            //luodaan pelaaja
//        
//        System.out.println("Mikä on panos? (kokonaisluku)");  //rahoista vähennetään panos, jota ei voi muuttaa
//        panos = Integer.parseInt(lukija.nextLine());            //eikä se vaikuta voittoon
//    }
//    
=======
    public void alkukysymykset() {
        System.out.println("Tervetuloa pelaamaan Hedelmäpeliä!");
        
        System.out.println("Mikä on nimesi? ");
        nimi = lukija.nextLine();
        
        System.out.println("Mikä on saldo? (kokonaisluku)");
        saldo = Integer.parseInt(lukija.nextLine());
        
        this.pelaaja = new Pelaaja(nimi, saldo);            //luodaan pelaaja
        
        System.out.println("Mikä on panos? (kokonaisluku)");  //rahoista vähennetään panos, jota ei voi muuttaa
        panos = Integer.parseInt(lukija.nextLine());            //eikä se vaikuta voittoon
    }
    
>>>>>>> 6832b747b707d3c1f85ae3a99bb4ba7178a2ba36
    /**
     * Tässä tapahtuu pelaaminen. Saldoon lisätään mahdollinen voitto.
     */
    public void pelaa() { 
        lukija = new Scanner(System.in);
        lisaaHedelma();
//        alkukysymykset();
        
        if (saldo >= panos) {                //pelaamaan pääsee jos on tarpeeksi rahaa
            
            saldo = saldo - panos;
            rivi.arvo(kaikkiHedelmat);
            
            //System.out.println(rivi.tulostaHedelmat());
            rivi.tarkistaVoitto();              //voittaa vain jos on kolme samaa hedelmää
        
//          if (rivi.voitto == 0) { //jos ei ole 3 samaa hedelmää, kone ottaa itselleen listan ja tarkistaa
//              List<Hedelma> arvotutHedelmat = rivi.getHedelmat(); //muut kombinaatiot(ekstra?)
//          }
            saldo = saldo + (rivi.getVoitto() * panos);       //rahoihin lisätään voitto
            
//            System.out.println("Jatketaanko? Y/N"); //pitää pystyä lopettamaan kesken ja nostaa rahat
//            String vastaus = lukija.nextLine();
//            
//            if (vastaus.equals("N")) {
//                break;
//            }
        }
        
//        System.out.println("Kiitos pelistä!");
//        System.out.println("Voittosi on " + saldo);
<<<<<<< HEAD
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
=======
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
>>>>>>> 6832b747b707d3c1f85ae3a99bb4ba7178a2ba36
    public void setPanos(int panos) {
        this.panos = panos;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public int getPanos() {
        return this.panos;
    }

    public Rivi getRivi() {
        return rivi;
    }
    
}