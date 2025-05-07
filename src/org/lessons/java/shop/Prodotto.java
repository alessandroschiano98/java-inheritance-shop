package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // VARIABILI DI ISTANZA, PROPRIETA' ECC
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        // CODICE (PRODOTTO));
        Random generator = new Random();
        this.codice = generator.nextInt(100000);
        // NOME (PRODOTTO)
        this.nome = nome;
        // DESCRIZIONE (PRODOTTO)
        this.descrizione = descrizione;
        // PREZZO (PRODOTTO)
        this.prezzo = prezzo;
        // CALCOLO IVA (PRODOTTO)
        this.iva = iva;
    }

    // METODI
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;

    }

    public float getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100f);
    }

    public String getNomeEsteso() {
        return nome + " " + getCodice();
    }

}
