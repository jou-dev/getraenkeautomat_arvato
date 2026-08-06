package model;

public class Getraenkeautomat {
    private Kasse kassenbestand;
    private Warenbestand warenbestand;
    private Produkt ausgewaehltesProdukt;
    private int eingezahlterBetrag;
    private String machineState;

    public Getraenkeautomat(Kasse kassenbestand, Warenbestand warenbestand, Produkt ausgewaehltesProdukt, int eingezahlterBetrag, String machineState) {
        this.kassenbestand = kassenbestand;
        this.warenbestand = warenbestand;
        this.ausgewaehltesProdukt = ausgewaehltesProdukt;
        this.eingezahlterBetrag = eingezahlterBetrag;
        this.machineState = machineState;
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

    public int getEingezahlterBetrag() {
        return eingezahlterBetrag;
    }

    public void setEingezahlterBetrag(int eingezahlterBetrag) {
        this.eingezahlterBetrag = eingezahlterBetrag;
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState;
    }
}
