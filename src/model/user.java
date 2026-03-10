package model;

/**
 * The User class represents a system user.
 * It stores basic user credentials such as username and password.

 * This class belongs to the Model layer and is used to transfer
 * user data between different layers of the application.
 */
public class user {

    private String username;
    private String password;

    /**
     * Constructor used to create a new User object.
     *
     * @param username the username of the user
     * @param password the password of the user
     */
    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Retrieves the username of the user.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Retrieves the password of the user.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
