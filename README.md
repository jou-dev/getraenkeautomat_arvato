# 🥤 Getränkeautomat

A Java-based vending machine simulation built as a technical interview assignment — and the project that landed me a Full-Stack Developer role at Arvato Systems.

---

## What it does

Simulates a vending machine that:
- Accepts coin inputs from the user
- Dispenses a drink when sufficient credit is inserted
- Calculates and returns the correct change in coins
- Handles edge cases such as insufficient funds or unavailable change

---

## Technical Highlights

| Concept | Usage |
|---|---|
| **Interfaces** | Defines contracts for dispensable items and payment handling |
| **Abstract classes** | Shared base behaviour across different drink types |
| **Inheritance** | Concrete drink implementations extend the abstract base |
| **JUnit 5** | Unit tests for payment logic and change calculation |
| **OOP encapsulation** | Each component (inventory, coin handler, dispenser) has a single responsibility |

---

## Project Structure

```
getraenkeautomat_arvato/
├── src/
│   ├── main/java/
│   │   ├── model/          # Drink types, Coin enum
│   │   ├── service/        # Vending logic, change calculation
│   │   └── Main.java       # Entry point
│   └── test/java/          # JUnit tests
└── README.md
```

---

## How to run

**Prerequisites:** Java 11+

```bash
# Clone the repository
git clone https://github.com/berberixs/getraenkeautomat_arvato.git
cd getraenkeautomat_arvato

# Compile
javac -d out src/main/java/**/*.java src/main/java/Main.java

# Run
java -cp out Main
```

---

## Example interaction

```
Available drinks:
[1] Cola       – 1.50 €
[2] Water      – 1.00 €
[3] Juice      – 2.00 €

Insert coins > 2.00 €
Select drink  > 1
Dispensing: Cola
Change returned: 0.50 € (1x 50ct)
```

---

## What I learned

This project deepened my understanding of object-oriented design in Java — specifically how interfaces and abstract classes enforce clean contracts between components. The change-calculation algorithm required careful thinking about coin denominations and greedy logic, which I validated through targeted JUnit tests.

---

*Built as a technical interview task for Arvato Systems Digital GmbH (2023). Role was subsequently offered and accepted.*
