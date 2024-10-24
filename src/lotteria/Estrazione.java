/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 * @version 1.0
 */
public class Estrazione extends Thread {
    // attributi
    private int numero; //di prova
    private int vincitori[];
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione() {
        // popolamento matrice numeri estratti
        // inizializzazione array vincitori
        //vincitori = new ...
        numero = 19;
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    * @param numero numero scelto dal giocatore
    * @param idGiocatore id del giocatore
    */
    public void verifica(int numero, int idGiocatore) {
        if (numero==this.numero) {
          System.out.println("Giocatore " + idGiocatore +
                  "hai scelto il numero " + numero +
                  "e hai vinto!");
        }
        else {
        System.out.println("Hai perso! :(");
        }    
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        System.out.println("INIZIO ESTRAZIONE!");
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
    }
}


