package presentation;

import business.ReturnBookService; // used to access the return book service
import java.util.Scanner; // Import Scanner class to read user input from the user


 // This class represents the Presentation Layer (User Interface).
 // It interacts with the user and collects input needed to return a book.
 

public class ReturnBookUI {
    // Implementation for return book UI
    public static void main(String[] args) {
        // Code to initialize and display the return book UI
        
    // Create Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the book ID to return
    System.out.println("Enter the book ID to return:");
    String bookId = scanner.nextLine(); 

   // Create a ReturnBookService object and send the book ID to process the return operation
    ReturnBookService service = new ReturnBookService();
    String result = service.returnBook(bookId);
    System.out.println(result);

    // Optional Review (extend)
    // If the book was returned successfully, give the user the option to leave a review
    // We check if the result message contains the success text
    if (result.equals("Book with ID " + bookId + " has been returned successfully.\n " + "Current status: available.")) {
            // Ask the user if they want to leave a review for the book
            System.out.print("Would you like to leave a review for this book? (yes/no): ");
            String answer = scanner.nextLine();

            // If the user wants to leave a review
            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Please write your review: ");
                String review = scanner.nextLine();
                System.out.println("Customer review: " + review);//Display the review 

                //if the user does not want to leave a review
            } else {
                System.out.println("No review left. Thank you!");
            }
        }

    // Close the scanner after finishing user input
    scanner.close();

    }
}