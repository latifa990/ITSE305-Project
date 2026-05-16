package lib;
import business.ReturnBookService; // import the service class to test its methods
import org.junit.jupiter.api.Test; // used to mark this method as a test
import static org.junit.jupiter.api.Assertions.*; // contains assertion methods like assertTrue
// This class is used to test the ReturnBookService functionality

public class ReturnBookServiceTest {

    @Test
    public void testReturnBook_Success() {
        // create object from the service class
        ReturnBookService service = new ReturnBookService();

        // test returning a borrowed book (should be successful)
        String result = service.returnBook("B001");

        // check if the result contains success message
        assertTrue(result.contains("has been returned successfully"));
    }

    @Test
    public void testReturnBook_AlreadyAvailable() {
        // create object
        ReturnBookService service = new ReturnBookService();

        // test returning a book that is already available
        String result = service.returnBook("B002");

        // check if the system says it's already available
        assertTrue(result.contains("is already available"));
    }

    @Test
    public void testReturnBook_NotExist() {
        // create object
        ReturnBookService service = new ReturnBookService();

        // test with a non-existing book ID
        String result = service.returnBook("B999");

        // check if the system says the book does not exist
        assertTrue(result.contains("does not exist"));
    }
}