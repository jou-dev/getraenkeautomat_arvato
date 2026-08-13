package service;

public interface KundenBedienungService {

    boolean istDiesProduktVerfuegbar(String produktBezeichnung);

    boolean istAusgewaeltesProduktVerfuegbar();

    boolean reichtAktuellesGuthabenFuerAusgewaeltesProdukt();

    boolean reichtAktuellesGuthabenFuerProdukt(String produktBezeichnung);

    void gibProduktRaus();

    void getreankeAutomatenZuruecksetzen();

    void transaktionAbspeichern();

    void wechselgeldBerechnenUndRausgeben();

    void geldEinwerfen();

    void kundenRueckerstatten();
    
}
