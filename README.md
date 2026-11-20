# Vererbung in Java

## 1. Lernziele

- Vererbung implementieren

## 2. Aufgabenstellung

Erstelle eine Basisklasse `Person`, von welcher die Klasse
`Employee` abgeleitet werden soll.

### 2.1 Klassendiagramm

#### Person

**Attribute:**

| Name        | Datentyp |
|-------------|----------|
| `name`      | `String` |
| `firstName` | `String` |
| `age`       | `int`    |

**Konstruktoren und Methoden:**

| Methode                              | Rückgabetyp |
|--------------------------------------|-------------|
| `Person(ln: String, fn: String)`      | –           |
| `Person()`                           | –           |
| `setName(ln: String, fn: String)`     | `void`      |
| `fullName()`                         | `String`    |

#### Employee (erbt von Person)

**Attribute:**

| Name         | Datentyp |
|--------------|----------|
| `employeeId` | `String` |

**Konstruktoren und Methoden:**

| Methode                                                           | Rückgabetyp |
|-------------------------------------------------------------------|-------------|
| `Employee(ln: String, fn: String, empId: String, a: int)`           | –           |
| `getEmployeeId()`                                                 | `String`    |
| `printAll()`                                                      | `void`      |

### 2.2 Anforderungen

- `Employee` besitzt die öffentlichen Eigenschaften von `Person`.
- Die Klasseneigenschaften und Methoden sind dem Klassendiagramm
  zu entnehmen.
- Sämtliche Methoden sollen ausprogrammiert werden.

### 2.3 Erweiterung

Erweitere die Klasse `Employee` um folgende Eigenschaften:

- `SupervisorID`
- `Salary`

Implementiere zusätzlich folgende Methoden:

- `setSupervisorID()`
- `getSupervisorID()`
- `setSalary()`
- `getSalary()`
- `salaryIncrease(float)`
