
public class Book extends LibraryItem {

    // fields
    private Person author;
    private String isbn;

    // constructor
    public Book(String title, Person author, String isbn) {

        super(title, true);
        this.author = author;
        this.isbn = isbn;
    }

    // Methods
    public Person getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString() + " Author : " + author.toString() + "ISBN: " + isbn;
    }

}