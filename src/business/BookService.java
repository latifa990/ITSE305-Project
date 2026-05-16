package business;

import data.Book;
import data.BookRepository;
// Provides services related to book management, acting as an intermediary between the presentation layer and the data layer
public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    // Adds a new book using the repository
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book.");
            return;
        }
        bookRepository.addBook(book);
    }

    // Displays all books stored in the repository
    public void displayAllBooks() {
        for (Book book : bookRepository.getAllBooks()) {
            System.out.println(book);
        }
    }

    // Searches for a book by its title
    public Book findBookByTitle(String title) {
      if (title == null || title.trim().isEmpty()) {
            System.out.println("Please provide a valid title to search.");
            return null;
        }
        Book book = bookRepository.findBookByTitle(title);
        if (book == null) {
            System.out.println("Book not found: " + title);
        }
        return book;
    }
}

