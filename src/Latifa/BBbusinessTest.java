package Latifa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BBbusinessTest {
    BBdata data;
    BBbusiness business;

    @BeforeEach
    void setup() {
        this.data     = new BBdata();
        this.business = new BBbusiness(data);
    }

    @Test
    void borrowBookSuccessTest() {
        String result = business.borrowBook("M001", "B001");
        assertTrue(result.contains("borrowed"));
    }

    @Test
    void borrowBookMemberNotFoundTest() {
        String result = business.borrowBook("M999", "B001");
        assertTrue(result.contains("does not exist"));
    }

    @Test
    void borrowBookInactiveMemberTest() {
        String result = business.borrowBook("M003", "B001");
        assertTrue(result.contains("inactive"));
    }

    @Test
    void borrowBookNotFoundTest() {
        String result = business.borrowBook("M001", "B999");
        assertTrue(result.contains("not found"));
    }

    @Test
    void borrowBookNotAvailableTest() {
        String result = business.borrowBook("M001", "B002");
        assertTrue(result.contains("No available"));
    }

    @Test
    void isValidBookTrueTest() {
        boolean valid = business.isValidBook("B001");
        assertTrue(valid);
    }

    @Test
    void isValidBookFalseTest() {
        boolean valid = business.isValidBook("B999");
        assertFalse(valid);
    }

    @Test
    void isValidMemberTrueTest() {
        boolean valid = business.isValidMember("M001");
        assertTrue(valid);
    }

    @Test
    void isValidMemberFalseTest() {
        boolean valid = business.isValidMember("M999");
        assertFalse(valid);
    }

    @Test
    void borrowBookResultNotNullTest() {
        String result = business.borrowBook("M001", "B001");
        assertNotNull(result);
    }
}
