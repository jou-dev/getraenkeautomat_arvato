public class Produkt {
    private String name;
    private double preis;
    private int id;
    private int bestand;

    public Produkt(String name, double preis, int id, int bestand) {
        this.name = name;
        this.preis = preis;
        this.id = id;
        this.bestand = bestand;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }
}
