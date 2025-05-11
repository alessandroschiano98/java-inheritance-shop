package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Televisori extends ProdottoElettronico {

        private int pollici;
        private boolean tipologia;

        public Televisori(String nome, String marca, float prezzo, int iva, int pollici, boolean tipologia) {
                super(nome, marca, prezzo, iva);
                this.pollici = pollici;
                this.tipologia = tipologia;
        }

        public int getPollici() {
                return this.pollici;
        }

        public boolean getTipologia() {
                return this.tipologia;
        }

}
