package data;

import model.user;

/**
 * This class represents the data layer.
 * It stores user information and validates login credentials.
 */
public class UserRepository {

    private user storedUser;

    // Constructor
    public UserRepository() {
        storedUser = new user("admin", "1234");
    }

    // Method to validate login
    public boolean validateUser(String username, String password) {

        if (storedUser.getUsername().equals(username) &&
                storedUser.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}