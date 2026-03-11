package data;

import java.util.List;
import java.util.ArrayList;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
    this.books = new ArrayList<>();

    books.add(new Book(1,"Java Programming","John","Programming"));
    books.add(new Book(2,"Clean Code","Robert Martin","Programming"));
}

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        // Book not found
        return null; 
        
    }
}