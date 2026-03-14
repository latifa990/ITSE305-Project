package data;

// Import all classes from java.util (e.g., Scanner, HashMap, Map)
import java.util.*;

public class BookRepository {
    // Implementation for book repository
    private  Map<String, String> book; // Map to store book ID and its status

        // Constructor: Initializes the book repository with sample data
         public BookRepository() {
            book = new HashMap<>(); // Initialize the book map
            // We use a Map so that each book can be stored with its ID as the key.
            // This allows us to quickly and easily look up or update a book's status
            // compared to using an array, which would require searching through all entries.

            
            // Sample data: Adding some books with their initial status
            book.put("B001", "borrowed");
            book.put("B002", "available");
            book.put("B003", "borrowed");
        }


        // Checks the book's status by its ID.
        // Returns the status ("borrowed" or "available") if the book exists,
        // or null if the book ID does not exist in the system.
        public String findBookStatus(String bookId) {
            return book.get(bookId); 
        }


    // Updates the status of a book by its ID.
    public boolean updateBookStatus(String bookId, String status) {
        if (book.containsKey(bookId)) {
            book.put(bookId, status); // Update the book's status in the map
            //System.out.println("Updated book ID " + bookId + " to status: " + status);
            return true; // Return true if the update was successful
        }
        else {
            System.out.println("Book ID " + bookId + " not found in the repository.");
            return false; // Return false if the book ID does not exist
        }
    } 
}