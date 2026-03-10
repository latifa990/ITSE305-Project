package presentation;

import business.LoginService;
import java.util.Scanner;

/**
 * The LoginUI class represents the Presentation Layer.
 *
 * It is responsible for interacting with the user,
 * collecting login information, and displaying results.
 */
public class LoginUI {

    /**
     * Main method where the application starts.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginService loginService = new LoginService();

        System.out.println(" Account Login System ");

        // Prompt user for username
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        // Prompt user for password
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Call business layer to process login
        boolean loginResult = loginService.login(username, password);

        // Display login result
        if (loginResult) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        scanner.close();
    }
}
