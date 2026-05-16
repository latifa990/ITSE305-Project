import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        bookService0.displayAllBooks();
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        data.Book book2 = null;
        bookService0.addBook(book2);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
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
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = book21.getClass();
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
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        data.Book book21 = bookService0.findBookByTitle("");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        data.Book book26 = null;
        bookService0.addBook(book26);
        java.lang.Class<?> wildcardClass28 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        data.Book book19 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        bookService0.displayAllBooks();
        data.Book book20 = bookService0.findBookByTitle("hi!");
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        bookService0.displayAllBooks();
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book27 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book10 = null;
        bookService0.addBook(book10);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        data.Book book29 = null;
        bookService0.addBook(book29);
        data.Book book31 = null;
        bookService0.addBook(book31);
        data.Book book33 = null;
        bookService0.addBook(book33);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book27 = bookService0.findBookByTitle("hi!");
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book20.getClass();
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
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        bookService0.displayAllBooks();
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
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        data.Book book18 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
            data.Book book16 = bookService0.findBookByTitle("");
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        data.Book book19 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        bookService0.displayAllBooks();
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.lang.Class<?> wildcardClass28 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        bookService0.displayAllBooks();
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book25 = bookService0.findBookByTitle("hi!");
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        data.Book book20 = bookService0.findBookByTitle("");
        data.Book book22 = bookService0.findBookByTitle("");
        data.Book book23 = null;
        bookService0.addBook(book23);
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book23 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        data.Book book27 = null;
        bookService0.addBook(book27);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book12 = null;
        bookService0.addBook(book12);
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        data.Book book27 = null;
        bookService0.addBook(book27);
        java.lang.Class<?> wildcardClass29 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        data.Book book20 = bookService0.findBookByTitle("");
        data.Book book22 = bookService0.findBookByTitle("");
        data.Book book24 = bookService0.findBookByTitle("hi!");
        data.Book book26 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.Class<?> wildcardClass30 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
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
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        bookService0.displayAllBooks();
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book11 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        data.Book book19 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
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
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book17 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.Class<?> wildcardClass29 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book10 = null;
        bookService0.addBook(book10);
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }
}

