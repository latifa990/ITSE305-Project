package business;

import data.UserRepository;

/**
 * The LoginService class represents the Business layer of the application.
 *
 * Its role is to process login requests and apply business logic.
 * Instead of allowing the presentation layer to directly access the data layer,
 * this class acts as an intermediary between them.
 *
 * This separation improves maintainability and follows the layered architecture
 * required by the project.
 */
public class LoginService {

    /**
     * Reference to the data layer object used to validate credentials.
     */
    private UserRepository userRepository;

    /**
     * Constructs the LoginService object and initializes the UserRepository.
     *
     * This allows the business layer to communicate with the data layer.
     */
    public LoginService() {
        userRepository = new UserRepository();
    }

    /**
     * Processes a login request by forwarding the provided credentials
     * to the data layer for validation.
     *
     * If the credentials are valid, the method returns true.
     * Otherwise, it returns false.
     *
     * @param username the username entered by the user
     * @param password the password entered by the user
     * @return true if login is successful; otherwise false
     */
    public boolean login(String username, String password) {
        return userRepository.validateUser(username, password);
    }
}