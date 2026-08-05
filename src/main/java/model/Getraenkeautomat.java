package model;

public class Getraenkeautomat {
    private Kasse kassenbestand;
    private Warenbestand warenbestand;
    private Produkt ausgewaehltesProdukt;

    public Getraenkeautomat(Kasse kassenbestand, Warenbestand warenbestand, Produkt ausgewaehltesProdukt) {
        this.kassenbestand = kassenbestand;
        this.warenbestand = warenbestand;
        this.ausgewaehltesProdukt = ausgewaehltesProdukt;
    }

    public Kasse getKasse() {
        return kassenbestand;
    }

    public void setKasse(Kasse kassenbestand) {
        this.kassenbestand = kassenbestand;
    }

    public boolean kasseIsEmpty() {
        return kassenbestand.getStand() == 0;
    }

    public Warenbestand getWarenbestand() {
        return warenbestand;
    }

    public void setWarenbestand(Warenbestand warenbestand) {
        this.warenbestand = warenbestand;
    }

    public Produkt getAusgewaehltesProdukt() {
        return ausgewaehltesProdukt;
    }

    public void setAusgewaehltesProdukt(Produkt ausgewaehltesProdukt) {
        this.ausgewaehltesProdukt = ausgewaehltesProdukt;
    }
}
