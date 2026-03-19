import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        boolean boolean21 = bBdata0.bookExists("hi!");
        boolean boolean23 = bBdata0.bookExists("hi!");
        int int25 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int11 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowLimit();
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean23 = bBdata0.isMemberActive("");
        boolean boolean25 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        boolean boolean17 = bBdata0.bookExists("hi!");
        boolean boolean19 = bBdata0.bookExists("hi!");
        java.lang.String str21 = bBdata0.getBookTitle("");
        java.lang.String str23 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int19 = bBdata0.getBorrowLimit();
        boolean boolean21 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        boolean boolean19 = bBdata0.memberExists("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        boolean boolean16 = bBdata0.memberExists("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        boolean boolean22 = bBdata0.bookExists("hi!");
        java.lang.String str24 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean20 = bBdata0.memberExists("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        boolean boolean24 = bBdata0.isMemberActive("hi!");
        java.lang.String str26 = bBdata0.getBookTitle("hi!");
        int int27 = bBdata0.getBorrowLimit();
        java.lang.String str29 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.isMemberActive("");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        java.lang.String str18 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str19 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        java.lang.String str24 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        boolean boolean20 = bBdata0.bookExists("");
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        boolean boolean18 = bBdata0.isMemberActive("");
        boolean boolean20 = bBdata0.memberExists("");
        int int22 = bBdata0.getAvailableCopies("");
        boolean boolean24 = bBdata0.bookExists("");
        boolean boolean26 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        int int15 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getBorrowLimit();
        int int19 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("");
        boolean boolean15 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int13 = bBdata0.getBorrowLimit();
        int int15 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        int int18 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        int int21 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        int int16 = bBdata0.getBorrowLimit();
        int int18 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        java.lang.String str17 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookTitle("");
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        boolean boolean20 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        boolean boolean4 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.bookExists("hi!");
        int int23 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        int int26 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        java.lang.String str17 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookTitle("");
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.String str24 = bBdata0.getBookTitle("");
        boolean boolean26 = bBdata0.memberExists("hi!");
        boolean boolean28 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        int int31 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str26 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        int int30 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getBorrowLimit();
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int22 = bBdata0.getAvailableCopies("hi!");
        int int24 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        boolean boolean6 = bBdata0.isMemberActive("");
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.memberExists("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        int int20 = bBdata0.getBorrowCount("hi!");
        java.lang.String str22 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean19 = bBdata0.bookExists("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        java.lang.String str23 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        int int20 = bBdata0.getAvailableCopies("");
        boolean boolean22 = bBdata0.isMemberActive("");
        boolean boolean24 = bBdata0.memberExists("");
        int int25 = bBdata0.getBorrowLimit();
        int int27 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str30 = bBdata0.getBookTitle("hi!");
        int int31 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass32 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        int int13 = bBdata0.getBorrowLimit();
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        int int17 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        int int23 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.memberExists("");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean14 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        int int13 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        int int5 = bBdata0.getBorrowLimit();
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.isMemberActive("");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        java.lang.String str13 = bBdata0.getBookAuthor("");
        int int15 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.bookExists("");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        int int19 = bBdata0.getBorrowLimit();
        int int21 = bBdata0.getAvailableCopies("");
        int int23 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int17 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str21 = bBdata0.getBookAuthor("");
        boolean boolean23 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str15 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int12 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.isMemberActive("");
        boolean boolean16 = bBdata0.bookExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        boolean boolean20 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        int int20 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        boolean boolean15 = bBdata0.bookExists("hi!");
        boolean boolean17 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getBorrowCount("");
        java.lang.String str20 = bBdata0.getBookTitle("");
        int int21 = bBdata0.getBorrowLimit();
        boolean boolean23 = bBdata0.bookExists("hi!");
        boolean boolean25 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.bookExists("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str19 = bBdata0.getBookAuthor("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        java.lang.String str23 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        boolean boolean18 = bBdata0.isMemberActive("");
        boolean boolean20 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        int int22 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean19 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        boolean boolean15 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getAvailableCopies("hi!");
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        boolean boolean15 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.bookExists("hi!");
        int int23 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        boolean boolean29 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.isMemberActive("");
        boolean boolean16 = bBdata0.bookExists("");
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        int int20 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        int int21 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getBorrowCount("");
        boolean boolean17 = bBdata0.memberExists("hi!");
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        boolean boolean21 = bBdata0.bookExists("hi!");
        java.lang.String str23 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        int int14 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        java.lang.String str17 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str16 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        boolean boolean19 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        java.lang.String str22 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int19 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowLimit();
        int int18 = bBdata0.getBorrowLimit();
        java.lang.String str20 = bBdata0.getMemberName("");
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        java.lang.String str22 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        boolean boolean17 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        int int20 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        int int13 = bBdata0.getAvailableCopies("");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        int int11 = bBdata0.getBorrowCount("");
        boolean boolean13 = bBdata0.memberExists("hi!");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str22 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.isMemberActive("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.bookExists("hi!");
        int int17 = bBdata0.getBorrowLimit();
        int int19 = bBdata0.getAvailableCopies("");
        java.lang.String str21 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        int int20 = bBdata0.getAvailableCopies("");
        boolean boolean22 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        int int20 = bBdata0.getBorrowCount("");
        java.lang.String str22 = bBdata0.getMemberName("");
        boolean boolean24 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getBorrowCount("hi!");
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        java.lang.String str17 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int11 = bBdata0.getAvailableCopies("");
        boolean boolean13 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        boolean boolean16 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        boolean boolean19 = bBdata0.bookExists("");
        java.lang.String str21 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        boolean boolean16 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        int int19 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        boolean boolean20 = bBdata0.memberExists("hi!");
        java.lang.String str22 = bBdata0.getBookTitle("hi!");
        java.lang.String str24 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getBorrowLimit();
        int int13 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int16 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.memberExists("");
        boolean boolean18 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        int int20 = bBdata0.getAvailableCopies("");
        boolean boolean22 = bBdata0.isMemberActive("");
        boolean boolean24 = bBdata0.memberExists("hi!");
        int int26 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        int int7 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("");
        int int21 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.bookExists("");
        int int16 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str16 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        java.lang.String str21 = bBdata0.getMemberName("hi!");
        int int22 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getAvailableCopies("");
        boolean boolean17 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        int int16 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean18 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        int int7 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getBorrowCount("hi!");
        int int19 = bBdata0.getBorrowLimit();
        int int21 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        int int11 = bBdata0.getBorrowCount("");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str17 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        boolean boolean20 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int20 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean24 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getBorrowLimit();
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        boolean boolean20 = bBdata0.isMemberActive("");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        java.lang.String str8 = bBdata0.getMemberName("");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean18 = bBdata0.isMemberActive("");
        int int20 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        boolean boolean4 = bBdata0.memberExists("");
        boolean boolean6 = bBdata0.memberExists("");
        int int7 = bBdata0.getBorrowLimit();
        boolean boolean9 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getAvailableCopies("hi!");
        int int19 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        boolean boolean11 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        java.lang.String str25 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        int int16 = bBdata0.getBorrowLimit();
        boolean boolean18 = bBdata0.bookExists("");
        int int20 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        int int4 = bBdata0.getBorrowCount("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        int int10 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.String str18 = bBdata0.getMemberName("");
        boolean boolean20 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str19 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass27 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean7 = bBdata0.memberExists("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        java.lang.String str21 = bBdata0.getBookTitle("");
        java.lang.String str23 = bBdata0.getBookAuthor("hi!");
        boolean boolean25 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass28 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getBorrowCount("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean15 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        int int17 = bBdata0.getBorrowCount("");
        int int19 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        boolean boolean17 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.bookExists("hi!");
        boolean boolean17 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        boolean boolean11 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.String str21 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        boolean boolean26 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getMemberName("");
        int int21 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        java.lang.String str25 = bBdata0.getBookAuthor("hi!");
        int int27 = bBdata0.getBorrowCount("");
        boolean boolean29 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.isMemberActive("");
        boolean boolean24 = bBdata0.bookExists("");
        java.lang.String str26 = bBdata0.getBookAuthor("hi!");
        int int27 = bBdata0.getBorrowLimit();
        java.lang.String str29 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int6 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean23 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getBorrowCount("");
        java.lang.String str20 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        boolean boolean23 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        int int20 = bBdata0.getAvailableCopies("");
        boolean boolean22 = bBdata0.isMemberActive("");
        boolean boolean24 = bBdata0.memberExists("");
        int int25 = bBdata0.getBorrowLimit();
        int int27 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str30 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        boolean boolean20 = bBdata0.isMemberActive("");
        java.lang.String str22 = bBdata0.getMemberName("hi!");
        int int24 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        boolean boolean21 = bBdata0.bookExists("hi!");
        boolean boolean23 = bBdata0.bookExists("hi!");
        int int25 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str27 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int18 = bBdata0.getAvailableCopies("");
        boolean boolean20 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        int int24 = bBdata0.getBorrowCount("");
        java.lang.String str26 = bBdata0.getBookAuthor("hi!");
        int int28 = bBdata0.getAvailableCopies("");
        int int30 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str32 = bBdata0.getMemberName("");
        java.lang.String str34 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        int int23 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        boolean boolean13 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        boolean boolean9 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        int int13 = bBdata0.getAvailableCopies("hi!");
        boolean boolean15 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        java.lang.String str18 = bBdata0.getMemberName("");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        int int4 = bBdata0.getBorrowCount("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        int int4 = bBdata0.getBorrowCount("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        boolean boolean15 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        int int22 = bBdata0.getAvailableCopies("");
        int int24 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.isMemberActive("");
        boolean boolean17 = bBdata0.isMemberActive("");
        int int19 = bBdata0.getBorrowCount("hi!");
        int int21 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        int int15 = bBdata0.getBorrowLimit();
        int int17 = bBdata0.getBorrowCount("hi!");
        int int19 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getBookAuthor("");
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        int int15 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        boolean boolean13 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int7 = bBdata0.getBorrowLimit();
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        int int11 = bBdata0.getBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean19 = bBdata0.bookExists("");
        int int20 = bBdata0.getBorrowLimit();
        int int22 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.memberExists("");
        boolean boolean18 = bBdata0.isMemberActive("");
        int int20 = bBdata0.getAvailableCopies("");
        int int21 = bBdata0.getBorrowLimit();
        java.lang.String str23 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getAvailableCopies("");
        int int17 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        int int22 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        int int24 = bBdata0.getBorrowLimit();
        boolean boolean26 = bBdata0.bookExists("");
        int int28 = bBdata0.getBorrowCount("hi!");
        java.lang.String str30 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getBorrowLimit();
        int int15 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowCount("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.String str27 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        int int16 = bBdata0.getBorrowLimit();
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.memberExists("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        boolean boolean15 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        java.lang.String str8 = bBdata0.getMemberName("");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        boolean boolean16 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int18 = bBdata0.getAvailableCopies("hi!");
        int int19 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        int int13 = bBdata0.getBorrowLimit();
        int int15 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        boolean boolean16 = bBdata0.bookExists("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowLimit();
        java.lang.String str20 = bBdata0.getMemberName("");
        java.lang.String str22 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.String str10 = bBdata0.getBookAuthor("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str22 = bBdata0.getBookTitle("");
        boolean boolean24 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        int int19 = bBdata0.getBorrowLimit();
        int int21 = bBdata0.getAvailableCopies("");
        boolean boolean23 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean16 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.bookExists("");
        int int17 = bBdata0.getAvailableCopies("hi!");
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.bookExists("hi!");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        int int25 = bBdata0.getBorrowCount("");
        boolean boolean27 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        boolean boolean22 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getMemberName("");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getBorrowCount("");
        boolean boolean17 = bBdata0.memberExists("hi!");
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        int int21 = bBdata0.getAvailableCopies("");
        int int23 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean27 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass29 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getBorrowLimit();
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        int int17 = bBdata0.getBorrowLimit();
        boolean boolean19 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        java.lang.String str17 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        int int18 = bBdata0.getBorrowCount("");
        boolean boolean20 = bBdata0.memberExists("");
        boolean boolean22 = bBdata0.bookExists("");
        boolean boolean24 = bBdata0.bookExists("hi!");
        java.lang.String str26 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean17 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        int int17 = bBdata0.getBorrowLimit();
        boolean boolean19 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        int int13 = bBdata0.getAvailableCopies("hi!");
        boolean boolean15 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int21 = bBdata0.getBorrowLimit();
        boolean boolean23 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int13 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        int int19 = bBdata0.getBorrowCount("");
        boolean boolean21 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean22 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int7 = bBdata0.getBorrowLimit();
        boolean boolean9 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str13 = bBdata0.getMemberName("");
        int int14 = bBdata0.getBorrowLimit();
        int int16 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int22 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        int int19 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str16 = bBdata0.getBookTitle("");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("");
        boolean boolean7 = bBdata0.isMemberActive("hi!");
        int int9 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean13 = bBdata0.bookExists("");
        int int15 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean15 = bBdata0.memberExists("");
        int int17 = bBdata0.getBorrowCount("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("");
        int int14 = bBdata0.getBorrowCount("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        java.lang.String str8 = bBdata0.getMemberName("");
        int int10 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int22 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.isMemberActive("");
        boolean boolean17 = bBdata0.isMemberActive("");
        int int19 = bBdata0.getBorrowCount("hi!");
        int int21 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        java.lang.String str4 = bBdata0.getBookAuthor("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookAuthor("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        int int22 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.bookExists("hi!");
        int int18 = bBdata0.getBorrowLimit();
        java.lang.String str20 = bBdata0.getBookAuthor("");
        boolean boolean22 = bBdata0.bookExists("");
        boolean boolean24 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("");
        int int28 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.bookExists("");
        java.lang.String str23 = bBdata0.getMemberName("");
        boolean boolean25 = bBdata0.isMemberActive("hi!");
        int int27 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        int int25 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getBorrowCount("hi!");
        boolean boolean20 = bBdata0.bookExists("hi!");
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        int int25 = bBdata0.getAvailableCopies("hi!");
        int int27 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass28 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean16 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        boolean boolean22 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        boolean boolean20 = bBdata0.memberExists("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        int int20 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        boolean boolean21 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int21 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str23 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        boolean boolean14 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("");
        java.lang.String str17 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        java.lang.String str23 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getBookTitle("");
        boolean boolean17 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int14 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getMemberName("");
        boolean boolean7 = bBdata0.bookExists("hi!");
        boolean boolean9 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str22 = bBdata0.getMemberName("");
        java.lang.String str24 = bBdata0.getBookAuthor("");
        int int26 = bBdata0.getBorrowCount("");
        java.lang.String str28 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        int int20 = bBdata0.getBorrowCount("");
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean15 = bBdata0.memberExists("");
        java.lang.String str17 = bBdata0.getBookTitle("");
        int int19 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        int int17 = bBdata0.getBorrowCount("");
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int17 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowCount("");
        boolean boolean17 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        int int23 = bBdata0.getBorrowLimit();
        boolean boolean25 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        int int19 = bBdata0.getBorrowCount("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str16 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getMemberName("");
        int int10 = bBdata0.getBorrowCount("");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getBorrowLimit();
        int int18 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.memberExists("");
        boolean boolean17 = bBdata0.memberExists("hi!");
        int int19 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        boolean boolean17 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("");
        int int21 = bBdata0.getAvailableCopies("hi!");
        boolean boolean23 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        java.lang.String str17 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookTitle("");
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.String str24 = bBdata0.getBookTitle("");
        boolean boolean26 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass27 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        boolean boolean18 = bBdata0.isMemberActive("");
        boolean boolean20 = bBdata0.bookExists("");
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        boolean boolean14 = bBdata0.bookExists("hi!");
        int int16 = bBdata0.getBorrowCount("");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookTitle("");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        java.lang.String str19 = bBdata0.getBookAuthor("");
        boolean boolean21 = bBdata0.bookExists("");
        java.lang.String str23 = bBdata0.getBookAuthor("hi!");
        java.lang.String str25 = bBdata0.getBookAuthor("");
        java.lang.String str27 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        boolean boolean24 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        int int19 = bBdata0.getBorrowCount("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        java.lang.String str23 = bBdata0.getBookAuthor("hi!");
        java.lang.String str25 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("");
        int int22 = bBdata0.getAvailableCopies("");
        int int24 = bBdata0.getBorrowCount("");
        boolean boolean26 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        int int15 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.bookExists("hi!");
        int int23 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.memberExists("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.isMemberActive("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.bookExists("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getAvailableCopies("");
        java.lang.String str17 = bBdata0.getBookAuthor("");
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int20 = bBdata0.getBorrowCount("hi!");
        java.lang.String str22 = bBdata0.getBookAuthor("");
        boolean boolean24 = bBdata0.isMemberActive("");
        boolean boolean26 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass27 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        boolean boolean17 = bBdata0.bookExists("");
        int int18 = bBdata0.getBorrowLimit();
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean22 = bBdata0.bookExists("");
        int int24 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        int int22 = bBdata0.getAvailableCopies("hi!");
        int int23 = bBdata0.getBorrowLimit();
        java.lang.String str25 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean7 = bBdata0.memberExists("");
        boolean boolean9 = bBdata0.memberExists("");
        boolean boolean11 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookTitle("");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str21 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.memberExists("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("");
        int int19 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getMemberName("");
        int int21 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str23 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean18 = bBdata0.bookExists("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        int int21 = bBdata0.getBorrowLimit();
        boolean boolean23 = bBdata0.memberExists("hi!");
        int int25 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        boolean boolean20 = bBdata0.memberExists("hi!");
        java.lang.String str22 = bBdata0.getMemberName("");
        java.lang.String str24 = bBdata0.getBookAuthor("");
        int int26 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getAvailableCopies("");
        java.lang.String str17 = bBdata0.getBookAuthor("");
        java.lang.String str19 = bBdata0.getBookTitle("");
        boolean boolean21 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        int int20 = bBdata0.getBorrowLimit();
        int int21 = bBdata0.getBorrowLimit();
        int int23 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean21 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean20 = bBdata0.memberExists("hi!");
        boolean boolean22 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.memberExists("");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean19 = bBdata0.bookExists("hi!");
        java.lang.String str21 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int23 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int18 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        boolean boolean22 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        boolean boolean25 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getBookTitle("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        boolean boolean21 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        boolean boolean18 = bBdata0.isMemberActive("");
        boolean boolean20 = bBdata0.isMemberActive("");
        int int21 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str22 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int18 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        int int21 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        java.lang.String str18 = bBdata0.getBookAuthor("");
        int int20 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        int int17 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("");
        boolean boolean17 = bBdata0.memberExists("");
        int int19 = bBdata0.getAvailableCopies("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        java.lang.String str23 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        java.lang.String str9 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        int int18 = bBdata0.getAvailableCopies("hi!");
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        boolean boolean11 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        java.lang.String str18 = bBdata0.getBookAuthor("");
        boolean boolean20 = bBdata0.bookExists("hi!");
        int int22 = bBdata0.getAvailableCopies("");
        java.lang.String str24 = bBdata0.getBookTitle("");
        boolean boolean26 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        boolean boolean19 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookAuthor("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.memberExists("");
        int int19 = bBdata0.getBorrowCount("");
        int int21 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        boolean boolean18 = bBdata0.memberExists("hi!");
        boolean boolean20 = bBdata0.isMemberActive("");
        int int22 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getBorrowCount("");
        int int18 = bBdata0.getAvailableCopies("");
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int18 = bBdata0.getAvailableCopies("");
        boolean boolean20 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str24 = bBdata0.getBookTitle("");
        java.lang.String str26 = bBdata0.getBookTitle("");
        boolean boolean28 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean13 = bBdata0.memberExists("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowLimit();
        boolean boolean18 = bBdata0.isMemberActive("");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowLimit();
        int int16 = bBdata0.getBorrowLimit();
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.bookExists("");
        int int16 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        int int13 = bBdata0.getAvailableCopies("");
        int int15 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.isMemberActive("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }
}

