package data;
public class Book {
    private String title;
    private String author;
    private int id;
    private String category;

    public Book(String title, String author, int id, String category) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int id() {
        return id;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return title + " by " + author + " (ID: " + id + ")";
    }
}