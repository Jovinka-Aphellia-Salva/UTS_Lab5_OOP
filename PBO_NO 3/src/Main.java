//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Membuat objek Employee
            Employee employee = new Employee(6, "Kim", "Jeykey", 50000);
            System.out.println(employee);

            // Menaikkan gaji sebesar 10%
            employee.raiseSalary(10);
            System.out.println(employee);
        }
    }
