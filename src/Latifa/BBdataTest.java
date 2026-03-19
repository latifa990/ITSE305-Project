package Latifa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BBdataTest {
    BBdata data;

    @BeforeEach
    void setup() {
        this.data = new BBdata();
    }

    @Test
    void getBookTitleTest() {
        String title = data.getBookTitle("B001");
        assertEquals("Clean Code", title);
    }

    @Test
    void getBookTitleNotFoundTest() {
        String title = data.getBookTitle("B999");
        assertNull(title);
    }

    @Test
    void getAvailableCopiesTest() {
        int copies = data.getAvailableCopies("B001");
        assertEquals(2, copies);
    }

    @Test
    void getAvailableCopiesZeroTest() {
        int copies = data.getAvailableCopies("B002");
        assertEquals(0, copies);
    }

    @Test
    void decreaseCopyTest() {
        data.decreaseCopy("B001");
        int copies = data.getAvailableCopies("B001");
        assertEquals(1, copies);
    }

    @Test
    void getMemberNameTest() {
        String name = data.getMemberName("M001");
        assertEquals("Latifa Yousif", name);
    }

    @Test
    void isMemberActiveTest() {
        boolean active = data.isMemberActive("M001");
        assertTrue(active);
    }

    @Test
    void isMemberInactiveTest() {
        boolean active = data.isMemberActive("M003");
        assertFalse(active);
    }

    @Test
    void bookExistsTest() {
        boolean exists = data.bookExists("B001");
        assertTrue(exists);
    }

    @Test
    void bookNotExistTest() {
        boolean exists = data.bookExists("B999");
        assertFalse(exists);
    }
}
