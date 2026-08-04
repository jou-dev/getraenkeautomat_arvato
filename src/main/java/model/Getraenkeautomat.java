package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Getraenkeautomat {
    private Kasse kasse;
    private String standort;
    private Map<String, Getraenk> getraenkeBestand = new ConcurrentHashMap<String, Getraenk>();

    public Getraenkeautomat(Kasse kasse, String standort, Map<String, Getraenk> getraenkeBestand) {
        this.kasse = kasse;
        this.standort = standort;
        this.getraenkeBestand = getraenkeBestand;
    }

    public Kasse getKasse() {
        return kasse;
    }

    public void setKasse(Kasse kasse) {
        this.kasse = kasse;
    }

    public void setGetraenkeBestand(Map<String, Getraenk> getraenkeBestand) {
        this.getraenkeBestand = getraenkeBestand;
    }

    public Map<String, Getraenk> getGetraenkeBestand() {
        return getraenkeBestand;
    }

    public void setGetraenke(Map<String, Getraenk> getraenke) {
        this.getraenkeBestand = getraenke;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public boolean contains(String getraenkewunsch) {
        if (getraenkeBestand.containsKey(getraenkewunsch)) {
            return true;
        }
        return false;
    }

    public boolean kasseIsEmpty() {
        return kasse.getStand() == 0;
    }
}
