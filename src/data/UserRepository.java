package data;

import model.User;

/*
 * The UserRepository class represents the Data layer of the system.
 * Its main responsibility is to manage access to user data.
 * In a real application, this class would communicate with a database.
 * However, in this simplified academic project, the class stores
 * one sample user in memory and uses that user for validation.
 * This class provides a method to verify whether the username and password
 * entered by the user match the stored credentials.
 */
public class UserRepository {

    /*
     * Represents the stored user record used for login validation.
     * This object acts as a simulated database record.
     */
    private static final String DEFAULT_USERNAME = "admin";
    private static final String DEFAULT_PASSWORD = "5576";
    private User storedUser;

    /*
     * Creates the repository and initializes a predefined user account.
     */
    public UserRepository() {
        storedUser = new User(DEFAULT_USERNAME, DEFAULT_PASSWORD);
    }

    /**
     * Validates the provided login credentials against the stored user.
     */
    public boolean validateUser(String username, String password) {
        return storedUser.getUsername().equals(username)
                && storedUser.getPassword().equals(password);
    }
}