# Kundenbedienung Lifecycle

Kundenbedienung ist ein event-basierter Geschäftsprozess mit Start- und Endzeit.

```
                      KundenBedienungService
                                │
                                │
                      KundenBedienungSitzung Start
                                │
                        Produkt Auswählen
                                │
                          Geld Einzahlen
                                │
                          Kauf Erfolgreich/
                          Kauf Fehlgeschlagen
                                │
                      KundenBedienungSitzung Ende

```

---