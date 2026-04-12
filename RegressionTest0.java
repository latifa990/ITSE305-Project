import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass4 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass2 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book6 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book4 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book6 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        java.lang.Class<?> wildcardClass3 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book4 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = book5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = book7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book7 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book6 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book6 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = book5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        business.BookService bookService0 = new business.BookService();
        java.lang.Class<?> wildcardClass1 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book7 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass4 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = book7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book7 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        data.Book book25 = null;
        bookService0.addBook(book25);
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book5 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass3 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        data.Book book24 = null;
        bookService0.addBook(book24);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book27 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book26 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book9 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.Book.getTitle()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }
}

