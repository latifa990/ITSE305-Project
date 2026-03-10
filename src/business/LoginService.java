package business;

import data.UserRepository;

/**
 * The LoginService class represents the Business Layer.
 * *
 * It contains the business logic required for processing
 * login requests and communicates with the Data Layer.
 */
public class LoginService {

    private UserRepository userRepository;

    /**
     * Constructor that initializes the UserRepository object.
     */
    public LoginService() {
        userRepository = new UserRepository();
    }

    /**
     * Handles the login process by verifying user credentials.
     *  the username entered by the user
     *  the password entered by the user
     * @return true if login is successful, otherwise false
     */
    public boolean login(String username, String password) {
        return userRepository.validateUser(username, password);
    }
}
