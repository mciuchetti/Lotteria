/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monica ciuchetti
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Avvio Lotteria
        
        // Scelta del numero dei numeri da estrarre
        
        // Istanza ed avvio del thread Estrazione
        Estrazione e = new Estrazione();
        e.start();
        
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1, e);
        Giocatore g2 = new Giocatore(2, e);
        Giocatore g3 = new Giocatore(3, e);
        
        // Avvio dei thread Giocatori
        g1.start();
        g2.start();
        g3.start();
            
        try {
            g1.join();
            g2.join();
            g3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.err.println("Errore join"); //personale       
        }
        
        // Comunicazione fine gioco
        System.out.println("FINE LOTTERIA ");
    }
}
   