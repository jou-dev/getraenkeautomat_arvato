package model;

import java.math.BigDecimal;

public class Produkt {
    private final String name;
    private final BigDecimal preis;
    private final int bestand;
    private final int id;

    public Produkt(String name, BigDecimal preis, int bestand, int id) {
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public int getBestand() {
        return bestand;
    }

    public int getId() {
        return id;
    }
}
