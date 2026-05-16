import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("hi!");
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("");
        data.Book book20 = bookService0.findBookByTitle("hi!");
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        data.Book book20 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = book4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book25 = null;
        bookService0.addBook(book25);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book28 = bookService0.findBookByTitle("");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("hi!");
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        data.Book book19 = bookService0.findBookByTitle("hi!");
        data.Book book21 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book29 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book19 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        bookService0.displayAllBooks();
        data.Book book19 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book26 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        data.Book book19 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
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
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        data.Book book26 = null;
        bookService0.addBook(book26);
        bookService0.displayAllBooks();
        data.Book book29 = null;
        bookService0.addBook(book29);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book19 = bookService0.findBookByTitle("");
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("");
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        data.Book book18 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book7 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        data.Book book26 = null;
        bookService0.addBook(book26);
        data.Book book28 = null;
        bookService0.addBook(book28);
        data.Book book30 = null;
        bookService0.addBook(book30);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book28 = bookService0.findBookByTitle("hi!");
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        data.Book book26 = null;
        bookService0.addBook(book26);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
            data.Book book21 = bookService0.findBookByTitle("");
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book25 = null;
        bookService0.addBook(book25);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book28 = bookService0.findBookByTitle("hi!");
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("hi!");
        data.Book book18 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        bookService0.displayAllBooks();
        data.Book book25 = null;
        bookService0.addBook(book25);
        data.Book book27 = null;
        bookService0.addBook(book27);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        data.Book book19 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        data.Book book28 = null;
        bookService0.addBook(book28);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        data.Book book21 = bookService0.findBookByTitle("hi!");
        data.Book book23 = bookService0.findBookByTitle("");
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book28 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book26 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book30 = null;
        bookService0.addBook(book30);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
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
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book29 = bookService0.findBookByTitle("");
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        data.Book book24 = null;
        bookService0.addBook(book24);
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        data.Book book26 = null;
        bookService0.addBook(book26);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book30 = bookService0.findBookByTitle("hi!");
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("hi!");
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book29 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book19 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book19 = bookService0.findBookByTitle("");
        data.Book book21 = bookService0.findBookByTitle("hi!");
        data.Book book23 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book18 = bookService0.findBookByTitle("");
        data.Book book20 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
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
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("hi!");
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        data.Book book21 = bookService0.findBookByTitle("hi!");
        data.Book book23 = bookService0.findBookByTitle("");
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        data.Book book27 = null;
        bookService0.addBook(book27);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        data.Book book2 = null;
        bookService0.addBook(book2);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book6 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
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
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        data.Book book10 = null;
        bookService0.addBook(book10);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book19 = bookService0.findBookByTitle("");
        data.Book book21 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("");
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        data.Book book19 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
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
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book19 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        bookService0.displayAllBooks();
        data.Book book22 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book28 = bookService0.findBookByTitle("");
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("");
        data.Book book20 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        data.Book book18 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        data.Book book26 = null;
        bookService0.addBook(book26);
        data.Book book28 = null;
        bookService0.addBook(book28);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book31 = bookService0.findBookByTitle("");
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
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
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
            data.Book book20 = bookService0.findBookByTitle("");
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        data.Book book17 = bookService0.findBookByTitle("");
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
            data.Book book17 = bookService0.findBookByTitle("");
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
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass30 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        data.Book book17 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("hi!");
        data.Book book3 = null;
        bookService0.addBook(book3);
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book30 = bookService0.findBookByTitle("");
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
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        data.Book book24 = null;
        bookService0.addBook(book24);
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book26 = null;
        bookService0.addBook(book26);
        data.Book book28 = null;
        bookService0.addBook(book28);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("hi!");
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book21 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book30 = bookService0.findBookByTitle("hi!");
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book25 = null;
        bookService0.addBook(book25);
        data.Book book27 = null;
        bookService0.addBook(book27);
        java.lang.Class<?> wildcardClass29 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
    }
}

