package business;
import data.BookRepository;

public class ReturnBookService {
    public void returnBook(String bookId) {
        // Code to process the return of the book using the bookId
        // For example, update the book's status in the database
        BookRepository bookRepository = new BookRepository();
        boolean isUpdated = bookRepository.updateBookStatus(bookId, "available");

        if (isUpdated) {
            System.out.println("Book with ID " + bookId + " has been returned successfully.");
        } else {
            System.out.println("Failed to return the book with ID " + bookId + ".");
        }   
    }
    
}