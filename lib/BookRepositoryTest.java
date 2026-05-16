package lib;
import data.BookRepository; // import the repository class to test its methods
import org.junit.jupiter.api.Test; // used to define test methods
import static org.junit.jupiter.api.Assertions.*; // contains assertion methods

// This class is used to test the BookRepository functionality
// This class is used to test the BookRepository functionality
// It checks getting book status and updating it
public class BookRepositoryTest {


    @Test
    public void testFindBookStatus() {
        BookRepository repo = new BookRepository();

        // check the status of an existing book
        String status = repo.findBookStatus("B001");

        // expected result is "borrowed"
        assertEquals("borrowed", status);
    }

    @Test
    public void testUpdateBookStatus() {
       BookRepository repo = new BookRepository();

        // update book status from borrowed to available
        boolean updated = repo.updateBookStatus("B001", "available");

        // check if update was successful
        assertTrue(updated);

        // verify that the status actually changed
        assertEquals("available", repo.findBookStatus("B001"));
    }

    @Test
    public void testUpdateBook_NotExist() {
       BookRepository repo = new BookRepository();

        // try updating a book that does not exist
        boolean updated = repo.updateBookStatus("B999", "available");

        // expected result is false
        assertFalse(updated);
    }
}