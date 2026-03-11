package Latifa;

import java.util.Scanner;

/*
 * Presentation Layer - Borrow Book Use Case
 * This class handles all interaction with the user.
 * It displays the menu, reads and validates user input,
 * and shows the results returned from the Business Layer.
 * It contains the main() method which runs the program.
 * It does NOT contain any business logic or data storage.
 */
public class BBpresentation {

    // scanner used to read all user input throughout the program
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create the data layer and business layer objects
        BBdata     dataLayer     = new BBdata();
        BBbusiness businessLayer = new BBbusiness(dataLayer);

        System.out.println("Hello! Library Borrow System");
        System.out.println();

        // keep showing the menu until the user chooses to exit
        boolean running = true;
        while (running) {

            // display the main menu
            System.out.println("What would you like to do?");
            System.out.println("1. Borrow a Book");
            System.out.println("2. View All Books");
            System.out.println("3. View All Members");
            System.out.println("0. Exit");
            System.out.print("Enter number: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                handleBorrowBook(businessLayer);

            } else if (choice.equals("2")) {
                dataLayer.printAllBooks();

            } else if (choice.equals("3")) {
                dataLayer.printAllMembers();

            } else if (choice.equals("0")) {
                System.out.println("See you next time!");
                running = false;

            } else {
                // the user typed something that is not in the menu
                System.out.println("Wrong input, try again. Please enter 0, 1, 2, or 3.");
            }
        }

        scanner.close();
    }

    /*
     * Handles the full borrow book interaction with the user.
     * Asks for Member ID and Book ID, validates that they are not empty,
     * asks the user to confirm, then sends the request to the Business Layer.
     */
    private static void handleBorrowBook(BBbusiness businessLayer) {

        System.out.println("Borrow Request");
        System.out.println();

        // ask for the member ID and make sure it is not empty
        String memberId = "";
        while (memberId.isEmpty()) {
            System.out.print("Please enter your Member ID: ");
            memberId = scanner.nextLine().trim();
            if (memberId.isEmpty()) {
                System.out.println("Member ID cannot be empty. Please try again.");
            }
        }

        // ask for the book ID and make sure it is not empty
        String bookId = "";
        while (bookId.isEmpty()) {
            System.out.print("Please enter the Book ID you want to borrow: ");
            bookId = scanner.nextLine().trim();
            if (bookId.isEmpty()) {
                System.out.println("Book ID cannot be empty. Please try again.");
            }
        }

        // show the user what they entered and ask them to confirm
        System.out.println();
        System.out.println("You entered Member ID: " + memberId);
        System.out.println("You entered Book ID: " + bookId);
        System.out.print("Are you sure? (yes / no): ");
        String confirm = scanner.nextLine().trim().toLowerCase();

        // if the user does not confirm, cancel and go back to the menu
        if (!confirm.equals("yes")) {
            System.out.println("Ok, going back to menu.");
            return;
        }

        // send the request to the business layer and show the result
        String result = businessLayer.borrowBook(memberId, bookId);
        System.out.println();
        System.out.println(result);
        System.out.println();
    }
}
