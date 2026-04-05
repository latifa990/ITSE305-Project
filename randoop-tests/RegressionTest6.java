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
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int14 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        boolean boolean10 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        boolean boolean4 = bBdata0.memberExists("");
        boolean boolean6 = bBdata0.memberExists("");
        int int7 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
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
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        int int19 = bBdata0.getBorrowCount("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        boolean boolean23 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        bBdata0.printAllBooks();
        int int22 = bBdata0.getBorrowLimit();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
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
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        int int14 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        boolean boolean20 = bBdata0.bookExists("");
        int int22 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("");
        int int13 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        int int15 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        boolean boolean20 = bBdata0.bookExists("");
        int int21 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
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
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.bookExists("");
        java.lang.String str23 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        bBdata0.printAllBooks();
        boolean boolean23 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        int int28 = bBdata0.getAvailableCopies("");
        boolean boolean30 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass31 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int12 = bBdata0.getBorrowLimit();
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean17 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
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
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int21 = bBdata0.getBorrowLimit();
        java.lang.String str23 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        int int17 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        boolean boolean13 = bBdata0.isMemberActive("");
        boolean boolean15 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        int int22 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        boolean boolean19 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        java.lang.String str25 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        int int29 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }
}

