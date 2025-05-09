package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Cuffie extends ProdottoElettronico {

    protected String colore;
    protected boolean modalita;

    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, String modalita) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.modalita = modalita;
    }

    

}
