public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Muster", "Max", "001", 25);

        emp.setSupervisorId("002");
        emp.setSalary(3000);
        emp.salaryIncrease(10);

        emp.printAll();
    }
}