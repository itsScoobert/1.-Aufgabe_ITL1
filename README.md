Vererbung in JAVA

1. Lernziele
   - Vererbung implementieren

2. Aufgabenstellung

Erstelle eine Basisklasse Person, von welcher die Klasse Employee abgeleitet werden soll.

Klassendiagramm:

Person
--------------------------------
- name: String
- firstName: String
+ age: int
--------------------------------
+ Person(ln:String, fn:String)
+ Person()
+ setName(ln:String, fn:String)
+ fullName(): String

Employee
--------------------------------
- employeeId: String
--------------------------------
+ Employee(ln:String, fn:String,
           empId:String, a:int)
+ getEmployeeId() String
+ printAll()

Employee besitzt die öffentlichen Eigenschaften von Person.

Die Klasseneigenschaften und Methoden entnimm dem Klassendiagramm.

Es sollen sämtliche Methoden ausprogrammiert werden.

Erweitere die Mitarbeiter (Employee) Klasse um die Eigenschaften:
- SupervisorID
- Salary

und die Methoden: set/get für beides und eine Methode salaryIncrease(float).
