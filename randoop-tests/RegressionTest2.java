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
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.String str24 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str25 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass26 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        int int22 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        java.lang.String str26 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.bookExists("");
        java.lang.String str16 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowCount("");
        int int17 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        boolean boolean27 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        boolean boolean19 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        int int13 = bBdata0.getAvailableCopies("hi!");
        boolean boolean15 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        int int13 = bBdata0.getBorrowCount("");
        int int15 = bBdata0.getBorrowCount("hi!");
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str17 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.bookExists("");
        int int13 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        int int24 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.isMemberActive("");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        java.lang.String str18 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.bookExists("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        int int10 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getMemberName("");
        int int15 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        int int9 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        int int20 = bBdata0.getBorrowLimit();
        int int22 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        bBdata0.decreaseCopy("");
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.memberExists("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        int int8 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        int int16 = bBdata0.getBorrowLimit();
        int int17 = bBdata0.getBorrowLimit();
        java.lang.String str19 = bBdata0.getBookAuthor("");
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getBookAuthor("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        boolean boolean13 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        boolean boolean15 = bBdata0.bookExists("");
        int int17 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        bBdata0.increaseBorrowCount("");
        boolean boolean20 = bBdata0.memberExists("hi!");
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        boolean boolean15 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean19 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        boolean boolean27 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getBorrowCount("hi!");
        boolean boolean17 = bBdata0.bookExists("hi!");
        boolean boolean19 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        int int19 = bBdata0.getBorrowLimit();
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        int int15 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str8 = bBdata0.getMemberName("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        bBdata0.printAllMembers();
        boolean boolean26 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int22 = bBdata0.getAvailableCopies("");
        boolean boolean24 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        java.lang.String str20 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        int int17 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        bBdata0.printAllBooks();
        boolean boolean24 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        boolean boolean19 = bBdata0.bookExists("hi!");
        int int21 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        boolean boolean20 = bBdata0.memberExists("hi!");
        java.lang.String str22 = bBdata0.getMemberName("");
        java.lang.String str24 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        java.lang.String str16 = bBdata0.getBookTitle("");
        int int18 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        java.lang.String str6 = bBdata0.getMemberName("");
        int int8 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        int int21 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str24 = bBdata0.getBookTitle("hi!");
        int int26 = bBdata0.getAvailableCopies("hi!");
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        boolean boolean20 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.isMemberActive("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("hi!");
        boolean boolean10 = bBdata0.isMemberActive("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.memberExists("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        int int17 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean7 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        int int8 = bBdata0.getBorrowLimit();
        boolean boolean10 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        boolean boolean16 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean14 = bBdata0.isMemberActive("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        boolean boolean23 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowLimit();
        int int13 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        int int18 = bBdata0.getBorrowCount("hi!");
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        boolean boolean15 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        java.lang.String str22 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        boolean boolean21 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        int int8 = bBdata0.getBorrowLimit();
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        boolean boolean19 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        java.lang.String str17 = bBdata0.getBookTitle("");
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        boolean boolean17 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        int int15 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        int int19 = bBdata0.getBorrowCount("");
        boolean boolean21 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.lang.String str20 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        int int16 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        boolean boolean25 = bBdata0.bookExists("hi!");
        int int27 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass28 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        int int19 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str23 = bBdata0.getBookAuthor("");
        int int25 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        int int10 = bBdata0.getBorrowCount("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.isMemberActive("");
        boolean boolean16 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        bBdata0.printAllMembers();
        int int21 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        boolean boolean19 = bBdata0.bookExists("");
        java.lang.String str21 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int24 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str26 = bBdata0.getBookAuthor("hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        java.lang.String str8 = bBdata0.getMemberName("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        bBdata0.printAllMembers();
        boolean boolean20 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int15 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.String str20 = bBdata0.getMemberName("");
        java.lang.String str22 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        int int26 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getBookAuthor("hi!");
        boolean boolean7 = bBdata0.bookExists("hi!");
        int int9 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        bBdata0.printAllBooks();
        boolean boolean28 = bBdata0.bookExists("");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        int int20 = bBdata0.getBorrowCount("");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        boolean boolean19 = bBdata0.bookExists("");
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("");
        boolean boolean15 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.memberExists("");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.String str21 = bBdata0.getBookAuthor("");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str27 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowCount("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getBorrowCount("");
        int int12 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        int int17 = bBdata0.getAvailableCopies("hi!");
        boolean boolean19 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getAvailableCopies("");
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        bBdata0.printAllMembers();
        boolean boolean18 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        bBdata0.printAllMembers();
        boolean boolean26 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.String str22 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        int int24 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        boolean boolean20 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        boolean boolean13 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowCount("");
        int int13 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        int int20 = bBdata0.getBorrowCount("");
        int int22 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int26 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        int int29 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int16 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean19 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.bookExists("");
        int int15 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        bBdata0.decreaseCopy("hi!");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        java.lang.String str9 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int23 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.isMemberActive("");
        boolean boolean13 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        bBdata0.decreaseCopy("");
        int int23 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        int int16 = bBdata0.getBorrowLimit();
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        int int4 = bBdata0.getBorrowLimit();
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.String str24 = bBdata0.getBookAuthor("hi!");
        java.lang.String str26 = bBdata0.getBookTitle("hi!");
        java.lang.String str28 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        bBdata0.printAllMembers();
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        int int11 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.memberExists("");
        boolean boolean9 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        java.lang.String str21 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        boolean boolean14 = bBdata0.isMemberActive("");
        int int15 = bBdata0.getBorrowLimit();
        boolean boolean17 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        bBdata0.decreaseCopy("");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        int int25 = bBdata0.getBorrowCount("");
        int int27 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean23 = bBdata0.memberExists("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        int int19 = bBdata0.getBorrowLimit();
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        boolean boolean23 = bBdata0.memberExists("hi!");
        java.lang.String str25 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        boolean boolean29 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.lang.String str27 = bBdata0.getBookTitle("hi!");
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.bookExists("");
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.bookExists("");
        boolean boolean17 = bBdata0.memberExists("");
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.memberExists("hi!");
        int int23 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        int int22 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getMemberName("");
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        int int26 = bBdata0.getAvailableCopies("hi!");
        boolean boolean28 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getBorrowLimit();
        int int15 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getBorrowCount("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str19 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getMemberName("");
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.lang.String str22 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        int int6 = bBdata0.getBorrowLimit();
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        boolean boolean26 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass27 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int11 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        java.lang.String str13 = bBdata0.getBookAuthor("");
        int int15 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        bBdata0.increaseBorrowCount("");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        int int16 = bBdata0.getBorrowLimit();
        boolean boolean18 = bBdata0.memberExists("hi!");
        boolean boolean20 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        boolean boolean6 = bBdata0.bookExists("");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str7 = bBdata0.getMemberName("");
        int int9 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        int int24 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        java.lang.String str18 = bBdata0.getMemberName("");
        boolean boolean20 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean19 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowLimit();
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        int int17 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("");
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean23 = bBdata0.memberExists("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getAvailableCopies("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        int int13 = bBdata0.getBorrowCount("");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        boolean boolean17 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        int int17 = bBdata0.getBorrowCount("");
        boolean boolean19 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("");
        boolean boolean17 = bBdata0.memberExists("");
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        java.lang.String str17 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        int int3 = bBdata0.getBorrowLimit();
        boolean boolean5 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getMemberName("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getAvailableCopies("");
        boolean boolean17 = bBdata0.bookExists("hi!");
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("hi!");
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        boolean boolean16 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        boolean boolean13 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        bBdata0.increaseBorrowCount("hi!");
        int int19 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int15 = bBdata0.getBorrowLimit();
        java.lang.String str17 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        int int26 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str28 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("");
        java.lang.String str16 = bBdata0.getBookTitle("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        bBdata0.decreaseCopy("hi!");
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        java.lang.String str26 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
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
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int int18 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        bBdata0.printAllMembers();
        java.lang.String str26 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        int int17 = bBdata0.getBorrowCount("hi!");
        int int19 = bBdata0.getBorrowCount("");
        boolean boolean21 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int15 = bBdata0.getBorrowLimit();
        int int17 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("hi!");
        java.lang.String str13 = bBdata0.getMemberName("");
        boolean boolean15 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        int int15 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int16 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        bBdata0.printAllMembers();
        int int16 = bBdata0.getAvailableCopies("");
        java.lang.String str18 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.lang.String str27 = bBdata0.getBookTitle("");
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str17 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.lang.String str22 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.String str19 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        boolean boolean5 = bBdata0.bookExists("");
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookTitle("");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        int int9 = bBdata0.getBorrowCount("");
        boolean boolean11 = bBdata0.bookExists("");
        boolean boolean13 = bBdata0.bookExists("");
        int int15 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        int int22 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        int int14 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        boolean boolean17 = bBdata0.bookExists("hi!");
        int int19 = bBdata0.getBorrowCount("hi!");
        boolean boolean21 = bBdata0.isMemberActive("");
        boolean boolean23 = bBdata0.bookExists("");
        boolean boolean25 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        boolean boolean28 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        int int24 = bBdata0.getBorrowLimit();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        int int26 = bBdata0.getAvailableCopies("");
        boolean boolean28 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getMemberName("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean16 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        boolean boolean17 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.bookExists("hi!");
        boolean boolean18 = bBdata0.bookExists("hi!");
        boolean boolean20 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        boolean boolean19 = bBdata0.isMemberActive("");
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean20 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        bBdata0.printAllMembers();
        int int26 = bBdata0.getAvailableCopies("");
        boolean boolean28 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        boolean boolean26 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        int int19 = bBdata0.getBorrowLimit();
        boolean boolean21 = bBdata0.isMemberActive("hi!");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        int int25 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        int int20 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean24 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("hi!");
        java.lang.String str13 = bBdata0.getMemberName("");
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getAvailableCopies("hi!");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        bBdata0.printAllBooks();
        java.lang.String str18 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.lang.String str19 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        int int20 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getBookAuthor("");
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("");
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.bookExists("");
        boolean boolean17 = bBdata0.memberExists("");
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.memberExists("hi!");
        boolean boolean17 = bBdata0.memberExists("hi!");
        java.lang.String str19 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("hi!");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        java.lang.String str17 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        int int18 = bBdata0.getAvailableCopies("");
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        bBdata0.decreaseCopy("");
        java.lang.String str26 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        int int22 = bBdata0.getAvailableCopies("");
        int int24 = bBdata0.getAvailableCopies("");
        int int26 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.bookExists("");
        boolean boolean13 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        int int22 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        java.lang.String str21 = bBdata0.getBookAuthor("");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        int int27 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        java.lang.String str18 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        int int23 = bBdata0.getAvailableCopies("");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        int int23 = bBdata0.getAvailableCopies("");
        int int25 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean15 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        boolean boolean6 = bBdata0.isMemberActive("");
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        java.lang.String str18 = bBdata0.getBookTitle("");
        boolean boolean20 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        int int17 = bBdata0.getBorrowCount("");
        boolean boolean19 = bBdata0.memberExists("");
        java.lang.String str21 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean23 = bBdata0.memberExists("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.memberExists("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.bookExists("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str23 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        int int25 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str28 = bBdata0.getMemberName("");
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        boolean boolean16 = bBdata0.isMemberActive("");
        int int18 = bBdata0.getBorrowCount("hi!");
        int int20 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        int int13 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        java.lang.String str24 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getBorrowLimit();
        boolean boolean15 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        java.lang.String str23 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        bBdata0.printAllMembers();
        java.lang.String str28 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        int int16 = bBdata0.getBorrowCount("");
        int int17 = bBdata0.getBorrowLimit();
        int int19 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        int int22 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean26 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        int int16 = bBdata0.getBorrowLimit();
        int int17 = bBdata0.getBorrowLimit();
        boolean boolean19 = bBdata0.isMemberActive("");
        boolean boolean21 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        int int25 = bBdata0.getBorrowCount("");
        boolean boolean27 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean17 = bBdata0.bookExists("hi!");
        int int19 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        int int21 = bBdata0.getBorrowCount("");
        java.lang.String str23 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass26 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        int int23 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str27 = bBdata0.getMemberName("hi!");
        boolean boolean29 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        int int20 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str20 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("hi!");
        boolean boolean7 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        boolean boolean28 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        boolean boolean17 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        int int22 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getAvailableCopies("");
        int int9 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        int int20 = bBdata0.getBorrowLimit();
        int int22 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        boolean boolean15 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        java.lang.String str19 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean19 = bBdata0.bookExists("hi!");
        int int20 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        int int23 = bBdata0.getAvailableCopies("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str27 = bBdata0.getMemberName("hi!");
        boolean boolean29 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.lang.String str18 = bBdata0.getMemberName("");
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        int int24 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        boolean boolean21 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getMemberName("");
        boolean boolean7 = bBdata0.bookExists("hi!");
        boolean boolean9 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        int int20 = bBdata0.getBorrowLimit();
        java.lang.String str22 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

