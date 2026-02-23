import java.utill.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Aley", 500000.0, 1507);
        employees[1] = new Employee("Taha", 150000.0, 1508);
        employees[2] = new Employee("Ahmet", 370000.0, 1509);
        employees[3] = new Employee("Yasin", 460700.0, 1510);
        employees[4] = new Employee("Sezin", 493000.0, 1511);
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}