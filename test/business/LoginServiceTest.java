package business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The LoginServiceTest class is a JUnit test class used to verify
 * the correctness of the login functionality in the Account Login System.
 *
 * This class belongs to Phase 03 of the project, where automated testing
 * is introduced using the JUnit framework.
 *
 * The purpose of this test class is to check whether the LoginService
 * behaves as expected under different login scenarios.
 *
 * The tested scenarios include:
 * - valid username and valid password
 * - valid username and invalid password
 * - invalid username and valid password
 * - invalid username and invalid password
 *
 * By executing these tests, we can confirm that the business logic
 * of the login system is functioning correctly.
 */
public class LoginServiceTest {

    /**
     * Tests the login process using correct credentials.
     *
     * Test data:
     * Username: admin
     * Password: 1234
     *
     * Expected result:
     * The login should succeed, so the method should return true.
     */
    @Test
    public void testValidLogin() {
        // Arrange: create the object that contains the login business logic.
        LoginService service = new LoginService();

        // Act: call the login method using valid credentials.
        boolean result = service.login("admin", "5576");

        // Assert: verify that the returned result is true.
        assertTrue(result);
    }

    /**
     * Tests the login process using a correct username
     * but an incorrect password.
     *
     * Test data:
     * Username: admin
     * Password: wrong
     *
     * Expected result:
     * The login should fail, so the method should return false.
     */
    @Test
    public void testInvalidPassword() {
        // Arrange: create the object that will be tested.
        LoginService service = new LoginService();

        // Act: call the login method using a valid username and an invalid password.
        boolean result = service.login("admin", "wrong");

        // Assert: verify that the returned result is false.
        assertFalse(result);
    }

    /**
     * Tests the login process using an incorrect username
     * but the correct password.
     *
     * Test data:
     * Username: wrong
     * Password: 1234
     *
     * Expected result:
     * The login should fail, so the method should return false.
     */
    @Test
    public void testInvalidUsername() {
        // Arrange: create the object that will be tested.
        LoginService service = new LoginService();

        // Act: call the login method using an invalid username and a valid password.
        boolean result = service.login("wrong", "1234");

        // Assert: verify that the returned result is false.
        assertFalse(result);
    }

    /**
     * Tests the login process using both an incorrect username
     * and an incorrect password.
     *
     * Test data:
     * Username: user
     * Password: pass
     *
     * Expected result:
     * The login should fail, so the method should return false.
     */
    @Test
    public void testInvalidCredentials() {
        // Arrange: create the object that will be tested.
        LoginService service = new LoginService();

        // Act: call the login method using completely invalid credentials.
        boolean result = service.login("user", "pass");

        // Assert: verify that the returned result is false.
        assertFalse(result);
    }
}