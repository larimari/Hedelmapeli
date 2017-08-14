/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

/**
 *
 * @author maria
 */
public class Hedelma {
    private String nimi;
    private int arvo;

    public Hedelma(String nimi, int arvo) {
        this.nimi = nimi;
        this.arvo = arvo;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
        //hedelmän nimi
    }
    
    public void setArvo(int arvo) {
        this.arvo = arvo;
        //hedelmällä on jokin arvo
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getArvo() {
        return this.arvo;
    }

    @Override
    public boolean equals(Object olio) { //vertaillaan hedelmiä
        if (olio == null) {
            return false;
        }

        if (getClass() != olio.getClass()) {
            return false;
        }
        
        Hedelma verrattava = (Hedelma) olio;
        
        if (this.nimi != verrattava.getNimi() || this.arvo != verrattava.getArvo()) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode() + this.arvo;
    }
    
    
}
