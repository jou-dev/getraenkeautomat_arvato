package model;

import java.util.Map;

public class Warenbestand {
    private Map<String, Produkt> warenProdukte;

    public Produkt sucheProduktAus(String produktMarktBezeichnung) {
        return null;
    }

    private int fuegeProduktInWarenbestandZu(Produkt produkt) {
        return 0;
    }

    private int entferneProduktVomWarenbestand(Produkt produkt) {
        return 0;
    }

    public boolean existiertDiesesProdukt(Produkt produkt) {
        return false;
    }

    public void alleVerfuergbarenProduktenZeigen() {

    }
}
