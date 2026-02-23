public class Patron extends Person {

    // fields
    private int libraryCardNumber;
    private String emailAddress;
    private static int lastLibraryCardNumber = -1;

    // constructor
    public Patron(String firstName, String lastName, Date dateOfBirth, String emailAddress, int libraryCardNumber) {
        super(firstName, lastName, dateOfBirth);
        this.emailAddress = emailAddress;
        this.libraryCardNumber = ++Patron.lastLibraryCardNumber;
    }

    // Methods
    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return super.toString() + ", Library Card Number: " + libraryCardNumber + ", Email Address: " + emailAddress;
    }
}