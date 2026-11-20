public class Employee extends Person {
    private String employeeId;
    private String supervisorId;
    private float salary;

    public Employee(String ln, String fn, String empId, int a) {
        super(ln, fn);
        this.employeeId = empId;
        this.age = a;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setSupervisorId(String id) {
        this.supervisorId = id;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void salaryIncrease(float percent) {
        salary = salary + salary * percent / 100;
    }

    public void printAll() {
        System.out.println(fullName());
        System.out.println(age);
        System.out.println(employeeId);
        System.out.println(supervisorId);
        System.out.println(salary);
    }
}