package org.lessons.java.shop.prodotti;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci uno dei seguenti prodotti: CUFFIE - SMARTPHONE - TELEVISORI");

        Cuffie infoCuffie = new Cuffie("AirPods", "Apple", 199.99f, 22, "Bianco", true);
        Smartphone infoSmartphone = new Smartphone("iPhone", "Apple", 950, 22, 1112223344, 128);
        Televisori infoTelevisori = new Televisori("Samsung UMD5", "Samsung", 300, 22, 70, true);

        String opzioneUtente = input.nextLine().toUpperCase();
        switch (opzioneUtente) {
            case "CUFFIE":
            System.out.println("Hai scelto CUFFIE");
                System.out.println(infoCuffie);
                break;
            case "SMARTPHONE":
            System.out.println("Hai scelto SMARTPHONE");
                System.out.println(infoSmartphone);
                break;
            case "TELEVISORI":
            System.out.println("Hai scelto TELEVISORI");
                System.out.println(infoTelevisori);
                break;
            default:
                System.out.println("Prodotto non valido o non esistente nel catalogo.");
        }

        input.close();

    }
}
