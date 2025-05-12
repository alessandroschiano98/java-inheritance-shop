package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Smartphone extends ProdottoElettronico {

    private int codiceIMEI;
    protected int memoria;

    public Smartphone(String nome, String marca, float prezzo, int iva, int codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public int getcodiceIMEI() {
        return this.codiceIMEI;
    }

    public int getmemoria() {
        return this.memoria;
    }

    @Override
    public String infoProdotto() { 
        return "Hai selezionato " + super.infoProdotto() + " " + memoria + " GB"  ;}

}



