package service;

import model.Produkt;

public interface PaymentService {

    int aktuellesGuthabenZeigen();

    boolean reichtAktuellesGuthabenFuerDenKauf ();

    int berechneNotwendigesGuthabenFuerDenKauf();

    int einzahlungZurueckgeben();

    int berechneWechselgeld();

}
