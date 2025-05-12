package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Cuffie extends ProdottoElettronico {

    protected String colore;
    protected String wireless;

    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, String wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;

    }

    public String getColore() {
        return this.colore;
    }

    public String getWireless() {
        return this.wireless;
    }

    @Override
    public String infoProdotto() { 
        return super.infoProdotto() + " colore " + this.colore + ", tipologia " + this.wireless;}

}