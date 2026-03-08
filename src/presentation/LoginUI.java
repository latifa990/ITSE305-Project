package presentation;

import business.LoginService;
import java.util.Scanner;

/**
 * This class handles user interaction.
 */
public class LoginUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginService loginService = new LoginService();

        System.out.println("=== Account Login System ===");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        boolean result = loginService.login(username, password);

        if (result) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        scanner.close();
    }
}
