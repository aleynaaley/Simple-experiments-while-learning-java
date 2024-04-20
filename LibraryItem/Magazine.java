
public class Magazine extends LibraryItem {

    // fields
    private String issueNumber;
    private Date publicationDate;

    // constructor
    public Magazine(String title, String issueNumber, Date publicationDate) {
        super(title, true);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    // methods
    public String getIssueNumber() {
        return issueNumber;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " İssue number : " + issueNumber + "Publication Date: " + publicationDate.toString();
    }

}