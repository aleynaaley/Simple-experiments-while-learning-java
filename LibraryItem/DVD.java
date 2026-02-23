public class DVD extends LibraryItem {

    // fields
    private Person director;
    private int runtimeMinutes;

    // constructor
    public DVD(String title, Person director, int runtimeMinutes) {

        super(title, true);
        this.director = director;
        this.runtimeMinutes = runtimeMinutes;
    }

    // Methods
    public Person getDirector() {
        return director;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    @Override
    public String toString() {
        return super.toString() + " Director: " + director.toString() + "Runtime : " + runtimeMinutes;
    }

}