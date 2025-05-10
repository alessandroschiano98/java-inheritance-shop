package org.lessons.java.shop;

import org.lessons.java.shop.prodotti.Cuffie;
import org.lessons.java.shop.prodotti.Smartphone;
import org.lessons.java.shop.prodotti.Televisori;

public class TestMain {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("iPhone", "Apple", 950, 22, 1112223344, 128);
        System.out.println(smartphone.getcodiceIMEI());
        System.out.println((smartphone.getmemoria()) + " gb");
        System.out.println(smartphone.getCodice());
        System.out.println(smartphone.getNome());
        System.out.println(smartphone.getMarca());
        System.out.println(String.format("%.2f", smartphone.getPrezzo()) + " euro");
        System.out.println(String.format("%.2f", smartphone.getPrezzoConIva()) + " euro");
        System.out.println(smartphone.getNomeEsteso());
        System.err.println("--------------------------------");
        Televisori televisori = new Televisori("Samsung X4", "Samsung", 300, 22, 70, false);
        System.out.println(televisori.getPollici() + " pollici");
        System.out.println((televisori.getiSsmarttv()));
        System.out.println(televisori.getCodice());
        System.out.println(televisori.getNome());
        System.out.println(televisori.getMarca());
        System.out.println(String.format("%.2f", televisori.getPrezzo()) + " euro");
        System.out.println(String.format("%.2f", televisori.getPrezzoConIva()) + " euro");
        System.out.println(televisori.getNomeEsteso());
        System.err.println("--------------------------------");
        Cuffie cuffie = new Cuffie("AirPods3", "Apple", 150, 22, "black", true);
        System.out.println(cuffie.getColore());
        System.out.println((cuffie.getiIswireless()));
        System.out.println(cuffie.getCodice());
        System.out.println(cuffie.getNome());
        System.out.println(cuffie.getMarca());
        System.out.println(String.format("%.2f", cuffie.getPrezzo()) + " euro");
        System.out.println(String.format("%.2f", cuffie.getPrezzoConIva()) + " euro");
        System.out.println(cuffie.getNomeEsteso());

    }
}
