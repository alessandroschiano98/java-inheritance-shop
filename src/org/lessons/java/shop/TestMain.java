package org.lessons.java.shop;

import org.lessons.java.shop.prodotti.Smartphone;

public class TestMain {
    public static void main(String[] args) {

        /*
         * ProdottoElettronico computer = new ProdottoElettronico("MAC", "Apple", 1550,
         * 22);
         * 
         * System.out.println(computer.getCodice());
         * System.out.println(computer.getNome());
         * System.out.println(computer.getMarca());
         * System.out.println(String.format("%.2f", computer.getPrezzo()) + " euro");
         * System.out.println(String.format("%.2f", computer.getPrezzoConIva()) +
         * " euro");
         * System.out.println(computer.getNomeEsteso());
         */

        Smartphone smartphone = new Smartphone("iPhone", "Apple", 950, 22, 1112223344, 128);
        System.out.println(smartphone.getcodiceIMEI());
        System.out.println((smartphone.getmemoria()) + " gb");
        System.out.println(smartphone.getCodice());
        System.out.println(smartphone.getNome());
        System.out.println(smartphone.getMarca());
        System.out.println(String.format("%.2f", smartphone.getPrezzo()) + " euro");
        System.out.println(String.format("%.2f", smartphone.getPrezzoConIva()) + " euro");
        System.out.println(smartphone.getNomeEsteso());

    }
}
