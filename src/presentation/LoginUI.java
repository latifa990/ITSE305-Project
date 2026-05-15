package presentation;

import business.LoginService;
import java.util.Scanner;

/**
 * The LoginUI class represents the Presentation layer of the application.
 *
 * Its main responsibility is to interact with the user by:
 * - displaying prompts
 * - reading input
 * - sending the input to the business layer
 * - displaying the final result
 *
 * This class does not perform validation directly.
 * Instead, it passes the user's input to the LoginService class.
 */
public class LoginUI {

    /**
     * The main method is the entry point of the program.
     *
     * It performs the following steps:
     * 1. Creates required objects
     * 2. Prompts the user for username and password
     * 3. Sends the input to the business layer
     * 4. Displays whether login was successful or not
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {

        // Scanner object used to read keyboard input from the user.
        Scanner scanner = new Scanner(System.in);

        // Business layer object used to process the login request.
        LoginService loginService = new LoginService();

        // Display the system title to the user.
        System.out.println("===== Account Login System =====");

        // Ask the user to enter a username.
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        // Ask the user to enter a password.
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Call the business layer to validate the entered credentials.
        boolean loginResult = loginService.login(username, password);

        // Display a message based on the returned login result.
        if (loginResult) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        // Close the scanner to release system resources.
        scanner.close();
    }
}
