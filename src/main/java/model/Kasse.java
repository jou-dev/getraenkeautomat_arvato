package model;

import java.util.List;

public class Kasse {
    private int stand;
    private List<Coin> muenzen;

    public Kasse(int stand, List<Coin> muenzen) {
        this.stand = stand;
        this.muenzen = muenzen;
    }

    public int getStand() {
        return stand;
    }

    public List<Coin> getMuenzen() {
        return muenzen;
    }

    public void setStand(int stand) {
        this.stand = stand;
    }

    public void setMuenzen(List<Coin> muenzen) {
        this.muenzen = muenzen;
    }
}
