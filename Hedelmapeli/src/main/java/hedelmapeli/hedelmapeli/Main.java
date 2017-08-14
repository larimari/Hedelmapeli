/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hedelmapeli.hedelmapeli;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Main {
    private Scanner lukija;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    }
    
    public void pelataan() {
        System.out.println("Tervetuloa pelaamaan Hedelmäpeliä!");
        System.out.println("Mikä on nimesi? ");
        String nimi = lukija.nextLine();
    }
}