package org.lessons.java.shop;

public class MainProdottoElettronico {
    public static void main(String[] args) {
        ProdottoElettronico cuffie = new ProdottoElettronico("Earbuds Beats", "Ultima Generazione", 250, 22);

        System.out.println("Codice: " + cuffie.getCodice());
        System.out.println("Nome: " + cuffie.getNome());
        System.out.println("Descrizione: " + cuffie.getDescrizione());
        System.out.println("Prezzo: " + cuffie.getPrezzo() + " euro");
        System.out.println("Prezzo con IVA: " + String.format("%.2f", cuffie.getPrezzoConIva()) + " euro");
        System.out.println(cuffie.getNomeEsteso());
    }
}
