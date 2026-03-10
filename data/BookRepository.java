package data;

public class BookRepository {
    // Implementation for book repository

    public boolean updateBookStatus(String bookId, String status) {
        // Code to update the status of the book in the database
        // For example, set the book's status to "available" when returned
        System.out.println("Updating book with ID " + bookId + " to status: " + status);
        return true; // Return true if the update was successful
    }
}