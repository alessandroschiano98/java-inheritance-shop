package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Televisori extends ProdottoElettronico {

        protected int pollici;
        protected boolean issmarttv;

        public Televisori(String nome, String marca, float prezzo, int iva, int pollici, boolean issmarttv){
                super(nome, marca, prezzo,iva);
                this.pollici = pollici;
                this.issmarttv = issmarttv;
        }

        public int getPollici() {
                return this.pollici;
        }

        public boolean getiSsmarttv() {
                return this.issmarttv;
        }

}
