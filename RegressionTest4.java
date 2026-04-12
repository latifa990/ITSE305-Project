import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        bookService0.displayAllBooks();
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        bookService0.displayAllBooks();
        data.Book book24 = null;
        bookService0.addBook(book24);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book27 = bookService0.findBookByTitle("");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
            data.Book book11 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
            data.Book book19 = bookService0.findBookByTitle("hi!");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
            data.Book book12 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book26 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        bookService0.displayAllBooks();
        data.Book book25 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        bookService0.displayAllBooks();
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        data.Book book19 = bookService0.findBookByTitle("hi!");
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
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
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book18 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
            data.Book book27 = bookService0.findBookByTitle("");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        data.Book book20 = bookService0.findBookByTitle("hi!");
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book16 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        data.Book book14 = bookService0.findBookByTitle("hi!");
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book8 = null;
        bookService0.addBook(book8);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        bookService0.displayAllBooks();
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
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("hi!");
        data.Book book5 = null;
        bookService0.addBook(book5);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book8 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        bookService0.displayAllBooks();
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("hi!");
        data.Book book3 = null;
        bookService0.addBook(book3);
        data.Book book5 = null;
        bookService0.addBook(book5);
        data.Book book7 = null;
        bookService0.addBook(book7);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book10 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        data.Book book19 = bookService0.findBookByTitle("hi!");
        data.Book book21 = bookService0.findBookByTitle("hi!");
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        bookService0.displayAllBooks();
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        bookService0.displayAllBooks();
        data.Book book27 = null;
        bookService0.addBook(book27);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        data.Book book29 = null;
        bookService0.addBook(book29);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        data.Book book22 = null;
        bookService0.addBook(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        bookService0.displayAllBooks();
        data.Book book27 = null;
        bookService0.addBook(book27);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        bookService0.displayAllBooks();
        data.Book book32 = null;
        bookService0.addBook(book32);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = null;
        bookService0.addBook(book8);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book15 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book19 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        bookService0.displayAllBooks();
        data.Book book18 = bookService0.findBookByTitle("hi!");
        data.Book book20 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        bookService0.displayAllBooks();
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book29 = bookService0.findBookByTitle("hi!");
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
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        data.Book book18 = bookService0.findBookByTitle("");
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        bookService0.displayAllBooks();
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
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        java.lang.Class<?> wildcardClass31 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("hi!");
        data.Book book5 = null;
        bookService0.addBook(book5);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        data.Book book6 = null;
        bookService0.addBook(book6);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        data.Book book20 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book24 = bookService0.findBookByTitle("");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        bookService0.displayAllBooks();
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        data.Book book12 = null;
        bookService0.addBook(book12);
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
            data.Book book13 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
            data.Book book18 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = null;
        bookService0.addBook(book12);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        business.BookService bookService0 = new business.BookService();
        data.Book book1 = null;
        bookService0.addBook(book1);
        bookService0.displayAllBooks();
        data.Book book4 = null;
        bookService0.addBook(book4);
        // The following exception was thrown during execution in test generation
        try {
            data.Book book7 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book21 = bookService0.findBookByTitle("hi!");
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        data.Book book17 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book3 = null;
        bookService0.addBook(book3);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
            data.Book book23 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
            data.Book book15 = bookService0.findBookByTitle("hi!");
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book31 = bookService0.findBookByTitle("hi!");
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book9 = null;
        bookService0.addBook(book9);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        bookService0.displayAllBooks();
        data.Book book22 = bookService0.findBookByTitle("hi!");
        data.Book book24 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        bookService0.displayAllBooks();
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        java.lang.Class<?> wildcardClass30 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        bookService0.displayAllBooks();
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = book2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
            data.Book book18 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        data.Book book15 = null;
        bookService0.addBook(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book10 = null;
        bookService0.addBook(book10);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        data.Book book23 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        bookService0.displayAllBooks();
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        data.Book book18 = bookService0.findBookByTitle("hi!");
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
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
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
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book7 = bookService0.findBookByTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = book7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("");
        data.Book book15 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book15 = bookService0.findBookByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        data.Book book32 = null;
        bookService0.addBook(book32);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = null;
        bookService0.addBook(book9);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book15 = null;
        bookService0.addBook(book15);
        bookService0.displayAllBooks();
        data.Book book18 = null;
        bookService0.addBook(book18);
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        data.Book book11 = null;
        bookService0.addBook(book11);
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        data.Book book13 = null;
        bookService0.addBook(book13);
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        bookService0.displayAllBooks();
        data.Book book24 = null;
        bookService0.addBook(book24);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
            data.Book book31 = bookService0.findBookByTitle("hi!");
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("hi!");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        data.Book book21 = null;
        bookService0.addBook(book21);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        data.Book book25 = null;
        bookService0.addBook(book25);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        data.Book book23 = null;
        bookService0.addBook(book23);
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book9 = null;
        bookService0.addBook(book9);
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
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book10 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        data.Book book18 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        business.BookService bookService0 = new business.BookService();
        bookService0.displayAllBooks();
        data.Book book2 = null;
        bookService0.addBook(book2);
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass6 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book8 = bookService0.findBookByTitle("");
        data.Book book10 = bookService0.findBookByTitle("hi!");
        data.Book book12 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book16 = bookService0.findBookByTitle("");
        data.Book book18 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("hi!");
        data.Book book7 = null;
        bookService0.addBook(book7);
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
            data.Book book19 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book6 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        data.Book book11 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("");
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book14 = null;
        bookService0.addBook(book14);
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        bookService0.displayAllBooks();
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        bookService0.displayAllBooks();
        data.Book book15 = null;
        bookService0.addBook(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        data.Book book25 = null;
        bookService0.addBook(book25);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book29 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        data.Book book21 = null;
        bookService0.addBook(book21);
        data.Book book23 = null;
        bookService0.addBook(book23);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        data.Book book17 = null;
        bookService0.addBook(book17);
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        data.Book book19 = null;
        bookService0.addBook(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        data.Book book14 = null;
        bookService0.addBook(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
            data.Book book16 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        data.Book book16 = null;
        bookService0.addBook(book16);
        data.Book book18 = null;
        bookService0.addBook(book18);
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book13 = null;
        bookService0.addBook(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book17 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book15 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
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
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        bookService0.displayAllBooks();
        data.Book book19 = null;
        bookService0.addBook(book19);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book9 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        data.Book book11 = null;
        bookService0.addBook(book11);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        data.Book book18 = null;
        bookService0.addBook(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book14 = bookService0.findBookByTitle("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        data.Book book22 = null;
        bookService0.addBook(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
            data.Book book10 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        bookService0.displayAllBooks();
        // The following exception was thrown during execution in test generation
        try {
            data.Book book22 = bookService0.findBookByTitle("hi!");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        bookService0.displayAllBooks();
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("hi!");
        data.Book book10 = bookService0.findBookByTitle("");
        data.Book book12 = bookService0.findBookByTitle("");
        data.Book book14 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        bookService0.displayAllBooks();
        data.Book book17 = null;
        bookService0.addBook(book17);
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book30 = bookService0.findBookByTitle("");
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        data.Book book4 = bookService0.findBookByTitle("");
        data.Book book6 = bookService0.findBookByTitle("");
        data.Book book8 = bookService0.findBookByTitle("");
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        // The following exception was thrown during execution in test generation
        try {
            data.Book book20 = bookService0.findBookByTitle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        bookService0.displayAllBooks();
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        data.Book book20 = null;
        bookService0.addBook(book20);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        business.BookService bookService0 = new business.BookService();
        data.Book book2 = bookService0.findBookByTitle("");
        bookService0.displayAllBooks();
        data.Book book5 = bookService0.findBookByTitle("");
        data.Book book7 = bookService0.findBookByTitle("hi!");
        data.Book book9 = bookService0.findBookByTitle("hi!");
        data.Book book11 = bookService0.findBookByTitle("");
        data.Book book13 = bookService0.findBookByTitle("hi!");
        bookService0.displayAllBooks();
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        data.Book book15 = bookService0.findBookByTitle("");
        data.Book book17 = bookService0.findBookByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

