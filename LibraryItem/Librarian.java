
public class Librarian extends Person {

    // fields
    private int employeeID;
    private static int lastEmployeeID = -1;

    // constructor
    public Librarian(String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.employeeID = ++Librarian.lastEmployeeID;
    }

    // METHODS
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + employeeID;
    }
}