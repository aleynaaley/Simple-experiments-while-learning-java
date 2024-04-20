public class LibraryItem {

    private static int lastItemID = -1;

    // fields
    private int itemID;
    private String title;
    private boolean isAvailable;

    // Constructor
    public LibraryItem(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = true;
        this.itemID = ++lastItemID;
    }

    // Methods
    public String getTitle() {
        return title;
    }

    public int getIdemID() {
        return itemID;
    }

    public boolean isAvaliable() {
        return isAvailable;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnItem() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        String availability = isAvailable ? "available" : "unavailable";
        return itemID + " " + title + " " + availability;
    }
}