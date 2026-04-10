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
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str31 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        java.lang.String str31 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str29 = bookRepository0.findBookStatus("hi!");
        boolean boolean32 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean13 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass30 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass20 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass20 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str30 = bookRepository0.findBookStatus("hi!");
        java.lang.String str32 = bookRepository0.findBookStatus("hi!");
        boolean boolean35 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        boolean boolean29 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean32 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass10 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        boolean boolean30 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass31 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str30 = bookRepository0.findBookStatus("hi!");
        java.lang.String str32 = bookRepository0.findBookStatus("");
        java.lang.String str34 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        boolean boolean29 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass30 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass29 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str30 = bookRepository0.findBookStatus("");
        java.lang.String str32 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass33 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        java.lang.String str25 = bookRepository0.findBookStatus("hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean31 = bookRepository0.updateBookStatus("", "");
        java.lang.String str33 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass34 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        boolean boolean20 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        java.lang.String str19 = bookRepository0.findBookStatus("hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        boolean boolean27 = bookRepository0.updateBookStatus("", "");
        boolean boolean30 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass26 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass22 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass22 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        boolean boolean32 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean35 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean38 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        boolean boolean9 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str28 = bookRepository0.findBookStatus("");
        java.lang.String str30 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "");
        boolean boolean13 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str31 = bookRepository0.findBookStatus("hi!");
        java.lang.String str33 = bookRepository0.findBookStatus("");
        boolean boolean36 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str30 = bookRepository0.findBookStatus("hi!");
        boolean boolean33 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        java.lang.String str28 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass10 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean32 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str34 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.String str15 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean9 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean32 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean35 = bookRepository0.updateBookStatus("", "");
        boolean boolean38 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str40 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("hi!");
        java.lang.String str29 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass12 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass8 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass16 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str28 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "");
        boolean boolean22 = bookRepository0.updateBookStatus("", "");
        boolean boolean25 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        boolean boolean10 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("hi!");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        java.lang.String str31 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass32 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("hi!");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean9 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str15 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass16 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass20 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass22 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        boolean boolean23 = bookRepository0.updateBookStatus("", "");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        boolean boolean22 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        java.lang.String str31 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass16 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean31 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean34 = bookRepository0.updateBookStatus("", "");
        boolean boolean37 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass12 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.String str15 = bookRepository0.findBookStatus("hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        boolean boolean9 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean27 = bookRepository0.updateBookStatus("", "");
        boolean boolean30 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean33 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean36 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean39 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str41 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass16 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        boolean boolean29 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean32 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str34 = bookRepository0.findBookStatus("");
        boolean boolean37 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str39 = bookRepository0.findBookStatus("");
        boolean boolean42 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        java.lang.String str24 = bookRepository0.findBookStatus("hi!");
        boolean boolean27 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean30 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass10 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        java.lang.String str28 = bookRepository0.findBookStatus("hi!");
        java.lang.String str30 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean28 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str30 = bookRepository0.findBookStatus("hi!");
        java.lang.String str32 = bookRepository0.findBookStatus("hi!");
        boolean boolean35 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass36 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        boolean boolean23 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        java.lang.String str28 = bookRepository0.findBookStatus("hi!");
        boolean boolean31 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        boolean boolean22 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass12 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("", "");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean25 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass12 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str26 = bookRepository0.findBookStatus("hi!");
        java.lang.String str28 = bookRepository0.findBookStatus("hi!");
        boolean boolean31 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        boolean boolean8 = bookRepository0.updateBookStatus("", "");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        boolean boolean23 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass28 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("", "");
        boolean boolean29 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("", "");
        boolean boolean20 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        boolean boolean26 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str28 = bookRepository0.findBookStatus("hi!");
        java.lang.String str30 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        boolean boolean17 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass20 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        boolean boolean23 = bookRepository0.updateBookStatus("", "");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str17 = bookRepository0.findBookStatus("hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        java.lang.String str27 = bookRepository0.findBookStatus("");
        java.lang.String str29 = bookRepository0.findBookStatus("");
        java.lang.String str31 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean27 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean30 = bookRepository0.updateBookStatus("", "");
        boolean boolean33 = bookRepository0.updateBookStatus("", "");
        java.lang.String str35 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("");
        boolean boolean14 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("");
        boolean boolean24 = bookRepository0.updateBookStatus("", "");
        java.lang.String str26 = bookRepository0.findBookStatus("");
        boolean boolean29 = bookRepository0.updateBookStatus("", "");
        boolean boolean32 = bookRepository0.updateBookStatus("", "");
        java.lang.String str34 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean11 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str21 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass14 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("", "");
        java.lang.String str12 = bookRepository0.findBookStatus("");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.Class<?> wildcardClass16 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        boolean boolean8 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        java.lang.String str13 = bookRepository0.findBookStatus("hi!");
        boolean boolean16 = bookRepository0.updateBookStatus("", "");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        java.lang.Class<?> wildcardClass24 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        boolean boolean18 = bookRepository0.updateBookStatus("", "");
        boolean boolean21 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("hi!");
        boolean boolean26 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean29 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        boolean boolean16 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str18 = bookRepository0.findBookStatus("hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean18 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean21 = bookRepository0.updateBookStatus("", "");
        boolean boolean24 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("");
        java.lang.String str9 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        java.lang.String str10 = bookRepository0.findBookStatus("");
        boolean boolean13 = bookRepository0.updateBookStatus("", "");
        java.lang.String str15 = bookRepository0.findBookStatus("");
        boolean boolean18 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str20 = bookRepository0.findBookStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        java.lang.String str11 = bookRepository0.findBookStatus("hi!");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str19 = bookRepository0.findBookStatus("");
        boolean boolean22 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str24 = bookRepository0.findBookStatus("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("");
        java.lang.String str6 = bookRepository0.findBookStatus("");
        java.lang.String str8 = bookRepository0.findBookStatus("");
        boolean boolean11 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str13 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        boolean boolean5 = bookRepository0.updateBookStatus("", "");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        boolean boolean10 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str12 = bookRepository0.findBookStatus("hi!");
        boolean boolean15 = bookRepository0.updateBookStatus("", "");
        java.lang.String str17 = bookRepository0.findBookStatus("");
        boolean boolean20 = bookRepository0.updateBookStatus("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "hi!");
        boolean boolean6 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        boolean boolean11 = bookRepository0.updateBookStatus("", "");
        boolean boolean14 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("hi!");
        boolean boolean19 = bookRepository0.updateBookStatus("hi!", "hi!");
        boolean boolean22 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("hi!");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        boolean boolean7 = bookRepository0.updateBookStatus("", "");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "");
        java.lang.String str14 = bookRepository0.findBookStatus("hi!");
        java.lang.String str16 = bookRepository0.findBookStatus("");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        java.lang.String str20 = bookRepository0.findBookStatus("");
        java.lang.String str22 = bookRepository0.findBookStatus("");
        boolean boolean25 = bookRepository0.updateBookStatus("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        data.BookRepository bookRepository0 = new data.BookRepository();
        java.lang.String str2 = bookRepository0.findBookStatus("");
        java.lang.String str4 = bookRepository0.findBookStatus("hi!");
        java.lang.String str6 = bookRepository0.findBookStatus("hi!");
        java.lang.String str8 = bookRepository0.findBookStatus("hi!");
        java.lang.String str10 = bookRepository0.findBookStatus("hi!");
        boolean boolean13 = bookRepository0.updateBookStatus("hi!", "");
        boolean boolean16 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str18 = bookRepository0.findBookStatus("");
        boolean boolean21 = bookRepository0.updateBookStatus("", "hi!");
        java.lang.String str23 = bookRepository0.findBookStatus("");
        java.lang.String str25 = bookRepository0.findBookStatus("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        data.BookRepository bookRepository0 = new data.BookRepository();
        boolean boolean3 = bookRepository0.updateBookStatus("", "");
        java.lang.String str5 = bookRepository0.findBookStatus("hi!");
        java.lang.String str7 = bookRepository0.findBookStatus("hi!");
        java.lang.String str9 = bookRepository0.findBookStatus("");
        boolean boolean12 = bookRepository0.updateBookStatus("hi!", "hi!");
        java.lang.String str14 = bookRepository0.findBookStatus("");
        boolean boolean17 = bookRepository0.updateBookStatus("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

