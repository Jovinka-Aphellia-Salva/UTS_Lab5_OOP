public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}