import business.BookService;
import data.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    @Test
    public void testFindBookExists() {
        BookService service = new BookService();

        service.addBook(new Book(1, "Java", "Author A", "Programming"));

        Book result = service.findBookByTitle("Java");

        assertNotNull(result);
        assertEquals("Java", result.getTitle());
    }

    @Test
    public void testFindBookNotExists() {
        BookService service = new BookService();

        Book result = service.findBookByTitle("PythoN");

        assertNull(result);
    }
}
