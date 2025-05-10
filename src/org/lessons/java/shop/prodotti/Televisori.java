package org.lessons.java.shop.prodotti;

import org.lessons.java.shop.ProdottoElettronico;

public class Televisori extends ProdottoElettronico {

        protected int pollici;
        protected boolean smarttv;

        public Televisori(String nome, String marca, float prezzo, int iva, int pollici, boolean smarttv){
                super(nome, marca, prezzo,iva);
                this.pollici = pollici;
                this.smarttv = smarttv;
        }

        public int getPollici() {
                return this.pollici;
        }

        public boolean getSmarttv() {
                return this.smarttv;
        }

}
