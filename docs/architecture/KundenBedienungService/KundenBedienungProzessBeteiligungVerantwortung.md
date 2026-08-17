# KundenBedienungService Beteiligung Verantwortungen

Alle neu **Features** müssen einer der **Java-Klassen** als erstes zuordnet werden.
Wenn ein Feature keine Mutter Klasse hat, entweder eine neue Java Klasse mit neuer Verantwortung hinterleget werden soll, oder es gibt ein Fehler im Design.

| Java Klasse                | Verantwortung                                                          |
|----------------------------|------------------------------------------------------------------------|
| **KundenBedienungService** | Gesamtprozess Koordination                                             |
| **KundenBedienungSitzung** | Aktuelle KundenBedienung Zustand                                       |
| **Warenbestand**           | Produkt- & Lagerverwaltung                                             |
| **ZahlungSystem**          | Aktuelles Guthaben, Einzahlungen, Zahlungen und Wechselgeld Verwaltung |