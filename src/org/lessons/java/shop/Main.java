package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto shampoo = new Prodotto("Head&Shoulders", "Antiforfora", 4.99f, 22);

        System.out.println("Codice: " + shampoo.getCodice());
        System.out.println("Nome: " + shampoo.getNome());
        System.out.println("Descrizione: " + shampoo.getDescrizione());
        System.out.println("Prezzo: " + shampoo.getPrezzo() + " euro");
        System.out.println("Prezzo con IVA: " + String.format("%.2f", shampoo.getPrezzoConIva()) + " euro");
        System.out.println(shampoo.getNomeEsteso());
    }
}
