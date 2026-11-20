public class Person {
    private String name;
    private String firstName;
    public int age;

    public Person(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    public Person() {
    }

    public void setName(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    public String fullName() {
        return firstName + " " + name;
    }
}