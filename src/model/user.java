package model;

/**
 * The User class represents a user entity in the Account Login System.
 *
 * This class belongs to the Model layer of the application.
 * Its responsibility is to hold user-related data that can be
 * passed between the data, business, and presentation layers.
 *
 * In this implementation, each user has:
 * - a username
 * - a password
 *
 * This class follows encapsulation by keeping fields private
 * and exposing them through getter methods.
 */
public class user {

    /**
     * Stores the username of the user.
     */
    private String username;

    /**
     * Stores the password of the user.
     */
    private String password;

    /**
     * Constructs a User object with the provided username and password.
     *
     * @param username the username assigned to the user
     * @param password the password assigned to the user
     */
    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Returns the username stored in the User object.
     *
     * @return the user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the password stored in the User object.
     *
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }
}
