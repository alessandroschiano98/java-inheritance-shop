package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Cuffie extends ProdottoElettronico {

    protected String colore;
    protected boolean wireless;

    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return this.colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

}

