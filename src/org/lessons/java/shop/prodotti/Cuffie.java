package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Cuffie extends ProdottoElettronico {

    protected String colore;
    protected boolean iswireless;

    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, boolean iswireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.iswireless = iswireless;
    }

    public String getColore(){
        return this.colore;
    }

    public boolean getiIswireless(){
        return this.iswireless;
    }

    

}
