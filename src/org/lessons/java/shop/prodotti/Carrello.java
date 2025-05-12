package org.lessons.java.shop.prodotti;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci uno dei seguenti prodotti: CUFFIE - SMARTPHONE - TELEVISORI");

        Cuffie cuffie = new Cuffie("AirPods3", "Apple", 150, 22, "Black","Wireless");
        Televisori televisori = new Televisori("Samsung UMD5", "Samsung", 300, 22, 70,"Smart Tv");
        Smartphone smartphone = new Smartphone("iPhone", "Apple", 950, 22, 1112223344, 128);
        
        // SCELTA DELL'UTENTE

        String opzioneUtente = input.nextLine().toUpperCase(); // QUI STAMPO L'OPZIONE CHE HA SCELTO L'UTENTE TRAMITE
                                                               // INPUT, IN MAIUSCOLO

        switch (opzioneUtente) {
            case "CUFFIE":
                System.out.println("Hai scelto >>> CUFFIE <<<");
                System.out.println(cuffie.infoProdotto());
                break;
            case "SMARTPHONE":
                System.out.println("Hai scelto >>> SMARTPHONE <<<");
                System.out.println(smartphone.infoProdotto());

                break;
            case "TELEVISORI":
                System.out.println("Hai scelto >>> TELEVISORI <<<");
                System.out.println(televisori.infoProdotto());

                break;
            default:
                System.out.println("Prodotto non valido o non esistente nel catalogo.");
        }

        input.close();

    }
}
