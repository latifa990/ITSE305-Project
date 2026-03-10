package Presentation;
import business.ReturnBookService; // used to access the return book service
import java.util.Scanner;
public class ReturnBookUI {
    // Implementation for return book UI
    Public static void main(String[] args) {
        // Code to initialize and display the return book UI

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the book ID to return:");
    String bookId = scanner.nextLine(); 
    // Code to process the return of the book using the bookId

    System.out.println("Book with ID " + bookId + " has been returned successfully.");

    // Creat an object from ReturnBookService to process the return book operation
    ReturnBookService Service = new ReturnBookService();
    Service.returnBook(bookId);

    // Optional Review (extend)
    System.out.println("Would you like to leave a review for this book? (yes/no)");
    String answer = scanner.nextLine();

    if (answer.equalsIgnoreCase("yes")) {
        System.out.println("Please Write your review:");
        String review = scanner.nextLine();
        // Code to save the review for the book
        System.out.println("Customer review: " + review);
    } else {
        System.out.println("No review left. Thank you!");
    }
    
    scanner.close();

    }
}