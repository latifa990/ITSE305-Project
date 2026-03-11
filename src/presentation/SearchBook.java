package presentation;

import business.BookService;
import data.Book;

public class SearchBook {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        // Adding some books to the repository
        bookService.addBook(new Book(3, "Effective Java", "Joshua Bloch", "Programming"));
        bookService.addBook(new Book(4, "The Pragmatic Programmer", "Andrew Hunt", "Programming"));

        // Searching for a book by title
        String searchTitle = "Effective Java";
        Book foundBook = bookService.findBookByTitle(searchTitle);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found: " + searchTitle);
        }
    }
}