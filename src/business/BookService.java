package business;

import data.Book;
import data.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    // Adds a new book using the repository
    public void addBook(Book book) {
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
        return bookRepository.findBookByTitle(title);
    }
}