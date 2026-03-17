package business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for LoginService.
 */
public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService service = new LoginService();
        assertTrue(service.login("admin", "5576"));
    }

    @Test
    public void testInvalidPassword() {
        LoginService service = new LoginService();
        assertFalse(service.login("admin", "wrong"));
    }

    @Test
    public void testInvalidUsername() {
        LoginService service = new LoginService();
        assertFalse(service.login("wrong", "1234"));
    }

    @Test
    public void testInvalidCredentials() {
        LoginService service = new LoginService();
        assertFalse(service.login("user", "pass"));
    }
}
