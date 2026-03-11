package data;
// Represents a book with its details
public class Book {
    private String title;
    private String author;
    private int id;
    private String category;

    public Book(int id, String title, String author, String category) {
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

    public int getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}