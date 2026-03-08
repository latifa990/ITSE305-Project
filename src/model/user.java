package model;

/**
 * This class represents a user.
 */
public class user {

    private String username;
    private String password;

    // Constructor
    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }
}
