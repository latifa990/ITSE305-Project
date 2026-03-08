package business;

import data.UserRepository;

/**
 * This class contains the login business logic.
 */
public class LoginService {

    private UserRepository userRepository;

    // Constructor
    public LoginService() {
        userRepository = new UserRepository();
    }

    // Login method
    public boolean login(String username, String password) {
        return userRepository.validateUser(username, password);
    }
}
