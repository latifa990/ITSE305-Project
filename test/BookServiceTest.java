import business.BookService;
import data.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class BookServiceTest {
    private BookService bookService;
    @BeforeEach
    public void setUp() {
        bookService = new BookService();
        bookService.addBook(new Book(1, "Java", "Author A", "Programming"));
        
    }   

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
