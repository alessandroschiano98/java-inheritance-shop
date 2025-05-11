package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Televisori extends ProdottoElettronico {

        private int pollici;
        private boolean smartTv;

        public Televisori(String nome, String marca, float prezzo, int iva, int pollici, boolean smartTv) {
                super(nome, marca, prezzo, iva);
                this.pollici = pollici;
                this.smartTv = smartTv;
        }

        public int getPollici() {
                return this.pollici;
        }

        public boolean getSmartTv() {
                return this.smartTv;
        }


}
