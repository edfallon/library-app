public class Book {

    private String title;
    private boolean available;

    public Book(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}
