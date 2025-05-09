package org.lessons.java.shop;

import java.util.Random;

public class ProdottoElettronico {

    // VARIABILI DI ISTANZA, PROPRIETA' ECC
    public int codice;
    public String nome;
    public String marca;
    public float prezzo;
    public int iva;

    public ProdottoElettronico(String nome, String marca, float prezzo, int iva) {
        // CODICE (ProdottoElettronico);
        Random generator = new Random();
        this.codice = generator.nextInt(100000);
        // NOME (ProdottoElettronico)
        this.nome = nome;
        // MARCA (ProdottoElettronico)
        this.marca = marca;
        // PREZZO (ProdottoElettronico)
        this.prezzo = prezzo;
        // CALCOLO IVA (ProdottoElettronico)
        this.iva = iva;
    }

    // ---- METODI ----

    // CODICE
    public int getCodice() {
        return codice;
    }

    // NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // MARCA
    public String getMarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    // PREZZO
    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;

    }

    // PREZZO + IVA
    public float getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100f);
    }

    // NOME ESTESO
    public String getNomeEsteso() {
        return nome + " " + getCodice();
    }


    
    

}
