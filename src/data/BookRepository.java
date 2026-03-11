ppackage data;

import java.util.List;
import java.util.ArrayList;

// Manages the collection of books and provides methods to manipulate them
public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();

        books.add(new Book(1, "Java Programming", "John", "Programming"));
        books.add(new Book(2, "Clean Code", "Robert Martin", "Programming"));
    }

    // Adds a new book to the repository
    public void addBook(Book book) {
        books.add(book);
    }

    // Returns all books in the repository
    public List<Book> getAllBooks() {
        return books;
    }

    // Searches for a book by its title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}