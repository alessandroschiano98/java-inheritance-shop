package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Televisori extends ProdottoElettronico {

        private int pollici;
        private String smartTv;

        public Televisori(String nome, String marca, float prezzo, int iva, int pollici, String smartTv) {
                super(nome, marca, prezzo, iva);
                this.pollici = pollici;
                this.smartTv = smartTv;
        }

        public int getPollici() {
                return this.pollici;
        }

        public String getTipologia() {
                return this.smartTv;
        }

        @Override
        public String infoProdotto() {
                return "Hai selezionato " + super.infoProdotto() + " " + this.pollici + " pollici " + " e  "
                                + this.smartTv;
        }

}
