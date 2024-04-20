
public class Employeem implements Comprable<Employee> {

    private String name;

    private double salary;

    private int id;

    public Employee(String name, Double salary, İnt id)
    {
		this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "id : " + this.getId() + "\n" +
                "name : " + this.getName() + "\n" +
                "salary : " + this.getSalary() + "\n";
    }

    @Override
    public int compareTo(Employee x) {
        if (this.id - x.id == 0)
            return this.name.compareTo(x.name);
        return this.id - x.id;

    }
}
