package model;

public class Getraenkeautomat {
    private Kasse kassenbestand;
    private Warenbestand warenbestand;
    private Produkt ausgewaehltesProdukt;
    private int aktuellesGuthaben;
    private String machineState; // IDLE; WAITING_FOR_PAYMENT; READY_TO_DISPENSE; DISPENSING; OUT_OF_SERVICE

    public Getraenkeautomat(Kasse kassenbestand, Warenbestand warenbestand, Produkt ausgewaehltesProdukt, int eingezahlterBetrag, String machineState) {
        this.kassenbestand = kassenbestand;
        this.warenbestand = warenbestand;
        this.ausgewaehltesProdukt = ausgewaehltesProdukt;
        this.aktuellesGuthaben = eingezahlterBetrag;
        this.machineState = machineState;
    }

    public void waehleProduktaus(String produktBezeichnung) {
        this.setAusgewaehltesProdukt(this.warenbestand.sucheProduktAus(produktBezeichnung));
    }

    public void zahleGeldBetragEin(int geldBetragInCents) {
    }

    public void ausgewaehltesProduktKaufen() {

    }

    public GetraenkUndWechselgeld ausgewaehltesProduktUndWechselgeldRausgeben() {
        return null;
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

    public int getAktuellesGuthaben() {
        return aktuellesGuthaben;
    }

    public void setAktuellesGuthaben(int aktuellesGuthaben) {
        this.aktuellesGuthaben = aktuellesGuthaben;
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState;
    }
}
