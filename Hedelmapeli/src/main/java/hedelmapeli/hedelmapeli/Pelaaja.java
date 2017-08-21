package hedelmapeli.hedelmapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Pelaaja {
    String nimi;
    int rahat;

    public Pelaaja(String nimi, int rahat) {
        this.nimi = nimi;
        this.rahat = rahat;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public void setRahat(int rahat) {
        this.rahat = rahat;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public double getRahat() {
        return this.rahat;
    }
    
}
