package data;

import model.user;

/**
 * The UserRepository class represents the Data Layer of the application.
 * Its main responsibility is to manage user data and validate
 * user credentials during the login process.
 */
public class UserRepository {

    // Simulated stored user (acts as a simple database)
    private user storedUser;

    /**
     * Constructor initializes a sample user for testing login.
     */
    public UserRepository() {
        storedUser = new user("admin", "1234");
    }

    /**
     * Validates the username and password entered by the user.
     *  the username entered during login
     *  the password entered during login
     * @return true if credentials are correct, otherwise false
     */
    public boolean validateUser(String username, String password) {

        if (storedUser.getUsername().equals(username)
                && storedUser.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}