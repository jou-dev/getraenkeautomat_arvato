# KundenBedienungSitzung

Einführung einer KundenBedienungSitzung (Purchase Session), um den Kaufprozess eines Kunden darzustellen.

## Motivation

  * Den Kaufprozess vom Getränke Automaten Zustand zu isolieren
  * Das Projekt für eine Spring Migration vorzubereiten
  * Stateful Services vermeiden
  * Single Responsibility Principle verfolgen
  * Testen verbessern

## Verantwortung

Die folgenden Eigenschaften besitzt eine Kundenbedienung Sitzung:

  * Sitzung ID
  * Start Timestamp
  * End Timestamp
  * Ausgewählte Produkten
  * Aktuelles Guthaben / Eingezahlter Geldbetrag
  * Kauf- /Bedienungsstatus

## Non-Responsibilities

  * Warenbestand Verwaltung
  * Zahlungsprozesse Verwaltung
  * Warenbestand bearbeiten
  * Getränke Automat steuern

## Collaboration

### Service Struktur

```
KundenBedienungService
│
├── KundenbedienungSitzung
│
├── Warenbestand
│   
└── Zahlungssystem
```

---