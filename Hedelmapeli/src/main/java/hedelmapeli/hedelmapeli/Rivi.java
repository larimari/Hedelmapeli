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
public class Rivi {        //rivi arpoo kolme hedelmää ja tarkistaa onko ne samat
    private List<Hedelma> hedelmat;
    int voitto;

    public Rivi() {
        this.hedelmat = new ArrayList<>(); //luodaan lista, jossa on arvottu kolme hedelmää
        this.voitto = voitto;
    }
    
    public void arvo(List<Hedelma> kaikkiHedelmat) { //hedelmät arvotaan listasta, jossa on kaikki hedemät
        Random random = new Random();
        hedelmat.clear();
        
        for (int i = 0; i < 3; i++) {
            int monesko = random.nextInt(kaikkiHedelmat.size());
            Hedelma hedelma = kaikkiHedelmat.get(monesko);
            hedelmat.add(hedelma);
        }
        
    }

    public List<Hedelma> getHedelmat() {
        return hedelmat;
    }

    public void setHedelmat(List<Hedelma> hedelmat) {
        this.hedelmat = hedelmat;
    }
    
    public String tulostaHedelmat() {
        for (Hedelma hedelma: hedelmat) {
            System.out.print(hedelma.getNimi() + " ");
        }
        return "";
    }
    
    public void tarkistaVoitto() { //kaydaan kaikki arvotut hedelmat lapi, jos samat -> voitto
        for (int i = 0; i < hedelmat.size(); i++) {
            Hedelma verrattava = hedelmat.get(i);
            
            for (Hedelma hedelma : hedelmat) {
                verrattava.equals(hedelma);
                
                if (true) {                    //ei taida toimia ihan oikein
                    voitto = hedelma.getArvo();
                } else {
                    voitto = 0; //ei voittoa
                }
            }
        }
        
    }
    
    public void setVoitto(int voitto) {
        this.voitto = voitto;
    }
    
    public int getVoitto() {
        return voitto;
    }
}
