package Latifa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BBpresentationTest {
    BBdata data;
    BBbusiness business;

    @BeforeEach
    void setup() {
        this.data     = new BBdata();
        this.business = new BBbusiness(data);
    }

    @Test
    void fullBorrowFlowTest() {
        String result = business.borrowBook("M001", "B001");
        assertNotNull(result);
        assertTrue(result.contains("borrowed"));
    }

    @Test
    void emptyMemberIdTest() {
        String result = business.borrowBook("", "B001");
        assertFalse(result.contains("successfully"));
    }

    @Test
    void emptyBookIdTest() {
        String result = business.borrowBook("M001", "");
        assertFalse(result.contains("successfully"));
    }

    @Test
    void bothInputsEmptyTest() {
        String result = business.borrowBook("", "");
        assertFalse(result.contains("successfully"));
    }

    @Test
    void borrowFlowContainsMemberNameTest() {
        String result = business.borrowBook("M001", "B001");
        assertTrue(result.contains("Latifa Yousif"));
    }

    @Test
    void borrowFlowContainsBookTitleTest() {
        String result = business.borrowBook("M001", "B001");
        assertTrue(result.contains("Clean Code"));
    }
}
