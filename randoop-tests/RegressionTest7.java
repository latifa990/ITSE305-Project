import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        int int15 = bBdata0.getBorrowCount("hi!");
        boolean boolean17 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getBookTitle("");
        int int7 = bBdata0.getAvailableCopies("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getMemberName("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        int int15 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        boolean boolean24 = bBdata0.isMemberActive("");
        boolean boolean26 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        int int29 = bBdata0.getBorrowLimit();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        int int7 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        int int19 = bBdata0.getBorrowCount("");
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        java.lang.String str18 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getBorrowCount("hi!");
        int int15 = bBdata0.getBorrowCount("");
        int int17 = bBdata0.getAvailableCopies("hi!");
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass4 = bBdata0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getBookAuthor("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        int int19 = bBdata0.getAvailableCopies("hi!");
        int int21 = bBdata0.getBorrowCount("");
        java.lang.String str23 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        java.lang.String str15 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        boolean boolean23 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("");
        int int12 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        int int19 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int19 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str23 = bBdata0.getMemberName("hi!");
        int int25 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        int int15 = bBdata0.getBorrowCount("");
        boolean boolean17 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        int int10 = bBdata0.getBorrowCount("hi!");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        java.lang.String str22 = bBdata0.getBookTitle("");
        int int23 = bBdata0.getBorrowLimit();
        int int24 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        boolean boolean28 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        int int14 = bBdata0.getBorrowLimit();
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.lang.String str20 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        int int18 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.memberExists("");
        int int8 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        boolean boolean17 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        java.lang.String str24 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getAvailableCopies("hi!");
        int int15 = bBdata0.getBorrowCount("");
        boolean boolean17 = bBdata0.isMemberActive("");
        java.lang.String str19 = bBdata0.getMemberName("");
        bBdata0.increaseBorrowCount("");
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.String str21 = bBdata0.getBookAuthor("hi!");
        int int22 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        boolean boolean15 = bBdata0.memberExists("");
        boolean boolean17 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        boolean boolean17 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        boolean boolean22 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.memberExists("");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        bBdata0.printAllMembers();
        boolean boolean24 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getBorrowCount("");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int19 = bBdata0.getBorrowCount("hi!");
        int int21 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        java.lang.String str17 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str20 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        boolean boolean21 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getBorrowCount("hi!");
        java.lang.String str17 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        int int9 = bBdata0.getAvailableCopies("");
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.memberExists("");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        int int20 = bBdata0.getBorrowLimit();
        boolean boolean22 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        boolean boolean13 = bBdata0.bookExists("");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        int int20 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        int int17 = bBdata0.getAvailableCopies("hi!");
        int int19 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        boolean boolean21 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str24 = bBdata0.getBookTitle("");
        int int25 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getBookTitle("");
        java.lang.String str16 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        int int13 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        bBdata0.increaseBorrowCount("hi!");
        int int26 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        boolean boolean27 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getMemberName("");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getBorrowCount("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookAuthor("");
        int int16 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        java.lang.String str22 = bBdata0.getBookTitle("hi!");
        java.lang.String str24 = bBdata0.getBookAuthor("hi!");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        int int18 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        int int10 = bBdata0.getBorrowCount("");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.bookExists("");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getBookTitle("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        java.lang.String str17 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        int int15 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        boolean boolean7 = bBdata0.isMemberActive("hi!");
        java.lang.String str9 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        boolean boolean21 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        int int25 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        int int14 = bBdata0.getBorrowLimit();
        java.lang.String str16 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        bBdata0.printAllBooks();
        int int19 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.String str24 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        boolean boolean21 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.lang.String str21 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        boolean boolean23 = bBdata0.bookExists("");
        java.lang.String str25 = bBdata0.getBookAuthor("");
        java.lang.String str27 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        int int21 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean25 = bBdata0.bookExists("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getMemberName("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        int int18 = bBdata0.getBorrowCount("");
        java.lang.String str20 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        int int10 = bBdata0.getBorrowLimit();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        int int23 = bBdata0.getBorrowCount("");
        int int24 = bBdata0.getBorrowLimit();
        boolean boolean26 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        int int23 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        int int13 = bBdata0.getAvailableCopies("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        java.lang.String str17 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        int int19 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        java.lang.Class<?> wildcardClass26 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        java.lang.String str22 = bBdata0.getBookTitle("");
        int int23 = bBdata0.getBorrowLimit();
        java.lang.String str25 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        java.lang.String str18 = bBdata0.getMemberName("");
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.lang.String str25 = bBdata0.getBookTitle("");
        int int27 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str31 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        boolean boolean18 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.isMemberActive("");
        int int14 = bBdata0.getAvailableCopies("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        boolean boolean23 = bBdata0.bookExists("");
        boolean boolean25 = bBdata0.isMemberActive("hi!");
        int int27 = bBdata0.getBorrowCount("");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        boolean boolean18 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("");
        java.lang.String str7 = bBdata0.getMemberName("hi!");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        int int20 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.memberExists("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        int int7 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.isMemberActive("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean5 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getMemberName("");
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        boolean boolean20 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        int int16 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.memberExists("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        java.lang.String str13 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        int int7 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getBorrowLimit();
        boolean boolean13 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        bBdata0.printAllMembers();
        int int22 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        int int11 = bBdata0.getBorrowLimit();
        int int12 = bBdata0.getBorrowLimit();
        int int14 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        int int18 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        boolean boolean21 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("");
        boolean boolean11 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        int int14 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        java.lang.String str20 = bBdata0.getBookTitle("hi!");
        java.lang.String str22 = bBdata0.getBookAuthor("hi!");
        boolean boolean24 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        boolean boolean23 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        int int22 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        int int19 = bBdata0.getAvailableCopies("hi!");
        int int21 = bBdata0.getBorrowCount("");
        boolean boolean23 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getBookAuthor("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        boolean boolean9 = bBdata0.isMemberActive("");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        boolean boolean20 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        int int28 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        int int6 = bBdata0.getBorrowLimit();
        int int7 = bBdata0.getBorrowLimit();
        boolean boolean9 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowCount("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookTitle("");
        int int17 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        boolean boolean23 = bBdata0.memberExists("");
        java.lang.String str25 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        boolean boolean23 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str27 = bBdata0.getMemberName("hi!");
        boolean boolean29 = bBdata0.bookExists("hi!");
        int int31 = bBdata0.getBorrowCount("hi!");
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        bBdata0.decreaseCopy("hi!");
        int int20 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int22 = bBdata0.getBorrowLimit();
        boolean boolean24 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        int int16 = bBdata0.getAvailableCopies("hi!");
        int int17 = bBdata0.getBorrowLimit();
        boolean boolean19 = bBdata0.isMemberActive("");
        java.lang.String str21 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        int int13 = bBdata0.getBorrowLimit();
        boolean boolean15 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        boolean boolean11 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        int int20 = bBdata0.getBorrowCount("");
        boolean boolean22 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        java.lang.String str23 = bBdata0.getMemberName("");
        java.lang.String str25 = bBdata0.getBookTitle("hi!");
        int int26 = bBdata0.getBorrowLimit();
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookAuthor("");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        boolean boolean6 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        java.lang.String str24 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        int int12 = bBdata0.getBorrowLimit();
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        boolean boolean16 = bBdata0.memberExists("");
        int int18 = bBdata0.getAvailableCopies("hi!");
        int int20 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("hi!");
        int int15 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getBookTitle("hi!");
        java.lang.String str18 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.memberExists("");
        boolean boolean14 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.bookExists("hi!");
        int int15 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        boolean boolean14 = bBdata0.memberExists("hi!");
        int int15 = bBdata0.getBorrowLimit();
        java.lang.String str17 = bBdata0.getMemberName("");
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str16 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int14 = bBdata0.getBorrowCount("");
        boolean boolean16 = bBdata0.bookExists("");
        java.lang.String str18 = bBdata0.getBookAuthor("");
        int int19 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        boolean boolean19 = bBdata0.memberExists("hi!");
        java.lang.String str21 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("hi!");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("");
        boolean boolean15 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        java.lang.String str23 = bBdata0.getBookAuthor("hi!");
        java.lang.String str25 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        boolean boolean18 = bBdata0.bookExists("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        int int16 = bBdata0.getBorrowCount("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        int int13 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        int int24 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        boolean boolean18 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        boolean boolean23 = bBdata0.bookExists("");
        int int25 = bBdata0.getAvailableCopies("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        int int3 = bBdata0.getBorrowLimit();
        boolean boolean5 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str9 = bBdata0.getBookAuthor("");
        int int11 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllMembers();
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        boolean boolean23 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str27 = bBdata0.getMemberName("hi!");
        boolean boolean29 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int17 = bBdata0.getBorrowLimit();
        int int19 = bBdata0.getAvailableCopies("");
        boolean boolean21 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("hi!");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        boolean boolean17 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        int int10 = bBdata0.getBorrowCount("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        int int15 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        int int8 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        int int25 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        boolean boolean24 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str28 = bBdata0.getMemberName("hi!");
        int int29 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        java.lang.String str22 = bBdata0.getMemberName("hi!");
        boolean boolean24 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str17 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        java.lang.String str22 = bBdata0.getBookTitle("");
        int int24 = bBdata0.getAvailableCopies("hi!");
        boolean boolean26 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        boolean boolean16 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        int int14 = bBdata0.getAvailableCopies("");
        int int16 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        int int20 = bBdata0.getBorrowCount("hi!");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getBookAuthor("");
        java.lang.String str11 = bBdata0.getMemberName("");
        int int13 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        int int19 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str21 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        int int21 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        int int24 = bBdata0.getBorrowCount("hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        int int13 = bBdata0.getBorrowCount("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        boolean boolean17 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        boolean boolean23 = bBdata0.memberExists("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean16 = bBdata0.memberExists("hi!");
        java.lang.String str18 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        bBdata0.printAllMembers();
        boolean boolean28 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int31 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        boolean boolean13 = bBdata0.bookExists("hi!");
        int int14 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        java.lang.String str19 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }
}

