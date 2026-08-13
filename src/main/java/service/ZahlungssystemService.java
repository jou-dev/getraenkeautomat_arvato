package service;

public interface ZahlungssystemService {

    int aktuellesGuthabenZeigen();

    boolean reichtAktuellesGuthabenFuerDenKauf ();

    int berechneNotwendigesGuthabenFuerDenKauf();

    int einzahlungRueckerstatten();

    int berechneWechselgeld();

}
