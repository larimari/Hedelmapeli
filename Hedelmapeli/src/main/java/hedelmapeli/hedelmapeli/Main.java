/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

import java.util.Random;

/**
 *
 * @author maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
    public String Arvonta(){
        Random random = new Random();
        int ekaLuku;
        int tokaLuku;
        int kolmasLuku;
        
        //arvotaan "hedelmät" eli luvut 1-10
        
        ekaLuku = 1+random.nextInt(10);     //alkuun tulee +1 jotta arvonnan jälkeen ei tulisi lukua 0
        
        tokaLuku = 1+random.nextInt(10);
        
        kolmasLuku = 1+random.nextInt(10);
        
        return ekaLuku + " " + tokaLuku + " " + kolmasLuku;
        
    }
    public void Voitto(){
        
        //jos kaikki kolme lukua ovat ykkösiä, voitto on 5
        //jos kakkosia, voitto on 10, jos kolmosia, voitto on 15 jne
        
        int luku = 1;
        
        
    }
    
}
