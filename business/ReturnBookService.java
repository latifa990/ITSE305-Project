package business;
import data.BookRepository; // Import the data layer class to access book data


// This class represents the Business Layer (Service).
// It contains the business logic for processing the return of a book, such as updating the book status in the database 


public class ReturnBookService {
    public String returnBook(String bookId) {

        
        // Create an object from BookRepository to access the data layer
        BookRepository bookRepository = new BookRepository();

        // Get the current status of the book using the book ID
        String bookStatus = bookRepository.findBookStatus(bookId);
        if (bookStatus == null) { //Check if the book ID exists in the system
            return "Book with ID " + bookId + " does not exist in the system.";
        } else if (bookStatus.equals("available")) { // Check if the book is already available (not borrowed)
            return "Book with ID " + bookId + " is already available in the system.";
        }

        

        // Update the status of the book to "available" after it is returned
        boolean isUpdated = bookRepository.updateBookStatus(bookId, "available");

       //If the update was not successful, return a failure message
       if(!isUpdated) {
        return "Failed to return the book with ID " + bookId + ". Please try again.";
    }
    // Get the updated status of the book after returning 
    String status = bookRepository.findBookStatus(bookId);
    return "Book with ID " + bookId + " has been returned successfully.\n " + "Current status: " + status + ".";  // Return a success message to the user including the current status of the book 
}
}