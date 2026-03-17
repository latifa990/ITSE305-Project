package data;

import model.user;

/**
 * The UserRepository class represents the Data layer of the system.
 *
 * Its main responsibility is to manage access to user data.
 * In a real application, this class would communicate with a database.
 * However, in this simplified academic project, the class stores
 * one sample user in memory and uses that user for validation.
 *
 * This class provides a method to verify whether the username and password
 * entered by the user match the stored credentials.
 */
public class UserRepository {

    /**
     * Represents the stored user record used for login validation.
     * This object acts as a simulated database record.
     */
    private user storedUser;

    /**
     * Creates the repository and initializes a predefined user account.
     *
     * The sample credentials used in this project are:
     * Username: admin
     * Password: 1234
     */
    public UserRepository() {
        storedUser = new user("admin", "5576");
    }

    /**
     * Validates the provided login credentials against the stored user.
     *
     * The method compares:
     * - the entered username with the stored username
     * - the entered password with the stored password
     *
     * If both values match exactly, the login attempt is considered valid.
     *
     * @param username the username entered by the user during login
     * @param password the password entered by the user during login
     * @return true if both username and password are correct; otherwise false
     */
    public boolean validateUser(String username, String password) {
        return storedUser.getUsername().equals(username)
                && storedUser.getPassword().equals(password);
    }
}