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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass3 = bBdata0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int16 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass3 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass3 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass3 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass3 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.bookExists("hi!");
        int int11 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        boolean boolean12 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowCount("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        java.lang.String str12 = bBdata0.getBookTitle("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        int int10 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        boolean boolean5 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        int int15 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("hi!");
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass4 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.increaseBorrowCount("");
        boolean boolean13 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.String str22 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        java.lang.String str15 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int6 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowCount("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        boolean boolean9 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass4 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getMemberName("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.String str23 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int5 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.String str19 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.lang.String str19 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.memberExists("");
        int int13 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str18 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        int int7 = bBdata0.getBorrowCount("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        java.lang.String str15 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        boolean boolean16 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        boolean boolean14 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int11 = bBdata0.getBorrowCount("");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.String str24 = bBdata0.getBookTitle("hi!");
        java.lang.String str26 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean16 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        int int21 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean13 = bBdata0.isMemberActive("hi!");
        int int14 = bBdata0.getBorrowLimit();
        java.lang.String str16 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        java.lang.String str8 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getBookAuthor("");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.isMemberActive("");
        int int13 = bBdata0.getBorrowLimit();
        boolean boolean15 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        boolean boolean20 = bBdata0.bookExists("hi!");
        boolean boolean22 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        boolean boolean6 = bBdata0.bookExists("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        java.lang.String str14 = bBdata0.getMemberName("");
        int int16 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        boolean boolean18 = bBdata0.memberExists("");
        java.lang.String str20 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.String str19 = bBdata0.getMemberName("");
        boolean boolean21 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("");
        int int15 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.String str19 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        int int21 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        int int25 = bBdata0.getBorrowCount("hi!");
        int int27 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        int int5 = bBdata0.getAvailableCopies("");
        boolean boolean7 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        boolean boolean18 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        boolean boolean23 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.memberExists("");
        java.lang.String str8 = bBdata0.getMemberName("");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.memberExists("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str21 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        int int9 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str13 = bBdata0.getBookTitle("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.Class<?> wildcardClass20 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        boolean boolean22 = bBdata0.bookExists("hi!");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        int int3 = bBdata0.getBorrowLimit();
        java.lang.String str5 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        int int11 = bBdata0.getBorrowCount("");
        java.lang.String str13 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        java.lang.String str18 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        boolean boolean18 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        boolean boolean22 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("hi!");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("");
        boolean boolean12 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.String str26 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass12 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        boolean boolean11 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.String str23 = bBdata0.getBookAuthor("");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.memberExists("");
        int int13 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        int int19 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int3 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.String str10 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        boolean boolean21 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        boolean boolean18 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        boolean boolean20 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        boolean boolean16 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        boolean boolean12 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        int int18 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass5 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        boolean boolean23 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        int int13 = bBdata0.getBorrowCount("");
        boolean boolean15 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        boolean boolean12 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int5 = bBdata0.getBorrowCount("");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        java.lang.String str16 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        int int9 = bBdata0.getAvailableCopies("hi!");
        int int11 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        boolean boolean24 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int10 = bBdata0.getBorrowLimit();
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        boolean boolean14 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        boolean boolean11 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str15 = bBdata0.getBookTitle("hi!");
        int int17 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        boolean boolean24 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        int int22 = bBdata0.getAvailableCopies("hi!");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        int int17 = bBdata0.getBorrowLimit();
        boolean boolean19 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean16 = bBdata0.isMemberActive("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass25 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.printAllBooks();
        boolean boolean17 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int7 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass8 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        boolean boolean20 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        int int16 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass17 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("hi!");
        int int10 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        boolean boolean20 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        java.lang.String str12 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.decreaseCopy("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        int int21 = bBdata0.getBorrowCount("");
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getBookAuthor("hi!");
        boolean boolean15 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.bookExists("");
        boolean boolean10 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str11 = bBdata0.getBookAuthor("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        boolean boolean16 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Class<?> wildcardClass24 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        int int18 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        boolean boolean5 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str16 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        boolean boolean6 = bBdata0.bookExists("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        int int11 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        java.lang.String str14 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.String str18 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str10 = bBdata0.getBookAuthor("");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        boolean boolean22 = bBdata0.isMemberActive("");
        java.lang.String str24 = bBdata0.getBookTitle("hi!");
        boolean boolean26 = bBdata0.bookExists("");
        boolean boolean28 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        java.lang.String str12 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        int int10 = bBdata0.getBorrowCount("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.bookExists("hi!");
        java.lang.String str10 = bBdata0.getBookAuthor("hi!");
        int int12 = bBdata0.getAvailableCopies("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        boolean boolean24 = bBdata0.memberExists("hi!");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int6 = bBdata0.getBorrowCount("");
        boolean boolean8 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        boolean boolean15 = bBdata0.memberExists("");
        java.lang.String str17 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getMemberName("");
        int int7 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        boolean boolean15 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        java.lang.String str13 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        int int21 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        boolean boolean23 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        boolean boolean18 = bBdata0.isMemberActive("");
        int int20 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllBooks();
        int int13 = bBdata0.getAvailableCopies("");
        java.lang.String str15 = bBdata0.getBookTitle("");
        boolean boolean17 = bBdata0.memberExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        boolean boolean11 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        bBdata0.printAllBooks();
        int int10 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        java.lang.String str13 = bBdata0.getMemberName("");
        boolean boolean15 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getBorrowCount("hi!");
        int int13 = bBdata0.getAvailableCopies("");
        boolean boolean15 = bBdata0.memberExists("hi!");
        int int17 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        int int19 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        boolean boolean6 = bBdata0.memberExists("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        boolean boolean11 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        bBdata0.printAllMembers();
        int int19 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.String str21 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("");
        java.lang.String str14 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.lang.String str27 = bBdata0.getBookAuthor("hi!");
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.String str19 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        int int23 = bBdata0.getBorrowCount("");
        java.lang.String str25 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        bBdata0.increaseBorrowCount("");
        java.lang.String str18 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        int int12 = bBdata0.getBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean18 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int9 = bBdata0.getBorrowLimit();
        java.lang.String str11 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        boolean boolean8 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.String str21 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        int int23 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.bookExists("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        boolean boolean21 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.String str27 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.String str19 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        boolean boolean22 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str22 = bBdata0.getMemberName("");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str9 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("");
        int int12 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("");
        boolean boolean12 = bBdata0.memberExists("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        int int17 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        bBdata0.printAllMembers();
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.memberExists("hi!");
        int int14 = bBdata0.getBorrowCount("");
        java.lang.String str16 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getBorrowCount("");
        boolean boolean10 = bBdata0.isMemberActive("");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("hi!");
        boolean boolean13 = bBdata0.memberExists("");
        boolean boolean15 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        int int9 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        boolean boolean14 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        boolean boolean27 = bBdata0.bookExists("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass30 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("");
        boolean boolean16 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        boolean boolean22 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass23 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        int int7 = bBdata0.getBorrowLimit();
        int int9 = bBdata0.getBorrowCount("hi!");
        boolean boolean11 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        int int22 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        int int14 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str8 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        java.lang.String str10 = bBdata0.getBookTitle("");
        int int12 = bBdata0.getAvailableCopies("");
        boolean boolean14 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        java.lang.String str6 = bBdata0.getMemberName("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        int int10 = bBdata0.getBorrowCount("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        int int19 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        boolean boolean19 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookAuthor("");
        bBdata0.decreaseCopy("");
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("hi!");
        int int15 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.String str19 = bBdata0.getBookAuthor("hi!");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        int int22 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        bBdata0.increaseBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        int int9 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        int int12 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.String str23 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("");
        int int4 = bBdata0.getBorrowCount("");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass6 = bBdata0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        int int12 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        boolean boolean16 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        bBdata0.printAllMembers();
        int int18 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        boolean boolean19 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        boolean boolean22 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("hi!");
        boolean boolean14 = bBdata0.bookExists("hi!");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("");
        boolean boolean8 = bBdata0.isMemberActive("");
        int int10 = bBdata0.getBorrowCount("hi!");
        boolean boolean12 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        boolean boolean12 = bBdata0.isMemberActive("hi!");
        boolean boolean14 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        boolean boolean9 = bBdata0.memberExists("");
        java.lang.String str11 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        int int19 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        int int8 = bBdata0.getAvailableCopies("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        boolean boolean8 = bBdata0.isMemberActive("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.isMemberActive("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getMemberName("");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getBookAuthor("");
        boolean boolean7 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        int int20 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass22 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        boolean boolean20 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass21 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        boolean boolean10 = bBdata0.bookExists("hi!");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        boolean boolean20 = bBdata0.bookExists("hi!");
        java.lang.String str22 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.String str19 = bBdata0.getMemberName("");
        int int21 = bBdata0.getBorrowCount("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        boolean boolean22 = bBdata0.isMemberActive("");
        bBdata0.printAllBooks();
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        boolean boolean14 = bBdata0.memberExists("");
        int int15 = bBdata0.getBorrowLimit();
        boolean boolean17 = bBdata0.isMemberActive("");
        boolean boolean19 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.decreaseCopy("");
        int int6 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        int int18 = bBdata0.getBorrowLimit();
        int int19 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        java.lang.String str8 = bBdata0.getBookAuthor("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        bBdata0.decreaseCopy("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        int int6 = bBdata0.getAvailableCopies("hi!");
        int int7 = bBdata0.getBorrowLimit();
        boolean boolean9 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.memberExists("");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        int int12 = bBdata0.getBorrowCount("");
        int int14 = bBdata0.getAvailableCopies("hi!");
        int int16 = bBdata0.getAvailableCopies("");
        boolean boolean18 = bBdata0.memberExists("hi!");
        int int20 = bBdata0.getBorrowCount("");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getBookAuthor("hi!");
        int int14 = bBdata0.getAvailableCopies("");
        int int16 = bBdata0.getBorrowCount("");
        bBdata0.decreaseCopy("");
        boolean boolean20 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        bBdata0.increaseBorrowCount("");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getBookTitle("hi!");
        java.lang.String str12 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.bookExists("hi!");
        boolean boolean4 = bBdata0.bookExists("");
        int int5 = bBdata0.getBorrowLimit();
        java.lang.String str7 = bBdata0.getMemberName("");
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int12 = bBdata0.getBorrowLimit();
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        java.lang.String str3 = bBdata0.getMemberName("");
        java.lang.String str5 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getBorrowCount("hi!");
        boolean boolean8 = bBdata0.bookExists("");
        int int10 = bBdata0.getAvailableCopies("hi!");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int8 = bBdata0.getBorrowLimit();
        boolean boolean10 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        int int27 = bBdata0.getAvailableCopies("hi!");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        boolean boolean8 = bBdata0.memberExists("");
        java.lang.String str10 = bBdata0.getMemberName("");
        int int12 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass9 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        boolean boolean8 = bBdata0.isMemberActive("");
        boolean boolean10 = bBdata0.bookExists("hi!");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int8 = bBdata0.getBorrowCount("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        int int12 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        int int20 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        int int4 = bBdata0.getAvailableCopies("hi!");
        boolean boolean6 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean9 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        bBdata0.printAllMembers();
        java.lang.String str19 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        int int7 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.bookExists("");
        java.lang.Class<?> wildcardClass11 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.Class<?> wildcardClass18 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        bBdata0.increaseBorrowCount("hi!");
        int int10 = bBdata0.getAvailableCopies("hi!");
        bBdata0.printAllBooks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        int int9 = bBdata0.getBorrowLimit();
        boolean boolean11 = bBdata0.bookExists("hi!");
        int int13 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        boolean boolean19 = bBdata0.isMemberActive("");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllBooks();
        java.lang.String str8 = bBdata0.getMemberName("");
        int int10 = bBdata0.getAvailableCopies("");
        int int12 = bBdata0.getAvailableCopies("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getBorrowCount("");
        bBdata0.increaseBorrowCount("");
        int int10 = bBdata0.getBorrowCount("hi!");
        java.lang.String str12 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.isMemberActive("");
        int int8 = bBdata0.getAvailableCopies("");
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        java.lang.String str7 = bBdata0.getBookAuthor("hi!");
        boolean boolean9 = bBdata0.bookExists("");
        java.lang.String str11 = bBdata0.getMemberName("");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass14 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        java.lang.String str9 = bBdata0.getBookTitle("");
        bBdata0.increaseBorrowCount("hi!");
        bBdata0.printAllMembers();
        bBdata0.decreaseCopy("hi!");
        java.lang.Class<?> wildcardClass15 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        bBdata0.decreaseCopy("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        boolean boolean23 = bBdata0.memberExists("hi!");
        boolean boolean25 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        bBdata0.printAllMembers();
        java.lang.String str6 = bBdata0.getBookTitle("hi!");
        bBdata0.decreaseCopy("hi!");
        bBdata0.decreaseCopy("hi!");
        int int11 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        java.lang.String str10 = bBdata0.getMemberName("hi!");
        bBdata0.increaseBorrowCount("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("");
        bBdata0.printAllMembers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        int int8 = bBdata0.getAvailableCopies("hi!");
        bBdata0.increaseBorrowCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        int int11 = bBdata0.getAvailableCopies("");
        java.lang.String str13 = bBdata0.getBookTitle("hi!");
        java.lang.String str15 = bBdata0.getMemberName("hi!");
        java.lang.Class<?> wildcardClass16 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        bBdata0.printAllMembers();
        java.lang.String str7 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        java.lang.String str12 = bBdata0.getMemberName("");
        java.lang.Class<?> wildcardClass13 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        int int6 = bBdata0.getBorrowLimit();
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        java.lang.String str6 = bBdata0.getMemberName("");
        bBdata0.printAllMembers();
        bBdata0.printAllMembers();
        boolean boolean10 = bBdata0.isMemberActive("hi!");
        bBdata0.decreaseCopy("hi!");
        java.lang.String str14 = bBdata0.getBookTitle("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        boolean boolean18 = bBdata0.memberExists("hi!");
        int int20 = bBdata0.getAvailableCopies("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        bBdata0.printAllMembers();
        int int26 = bBdata0.getBorrowLimit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        boolean boolean2 = bBdata0.memberExists("hi!");
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowLimit();
        java.lang.String str6 = bBdata0.getBookAuthor("hi!");
        bBdata0.printAllBooks();
        boolean boolean9 = bBdata0.isMemberActive("hi!");
        java.lang.String str11 = bBdata0.getMemberName("hi!");
        java.lang.String str13 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        bBdata0.printAllBooks();
        boolean boolean5 = bBdata0.isMemberActive("");
        bBdata0.increaseBorrowCount("");
        java.lang.String str9 = bBdata0.getBookAuthor("hi!");
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        int int6 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllBooks();
        java.lang.Class<?> wildcardClass10 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        bBdata0.printAllMembers();
        boolean boolean12 = bBdata0.isMemberActive("");
        java.lang.String str14 = bBdata0.getBookAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.decreaseCopy("");
        java.lang.String str8 = bBdata0.getMemberName("hi!");
        int int9 = bBdata0.getBorrowLimit();
        bBdata0.decreaseCopy("hi!");
        bBdata0.printAllMembers();
        int int14 = bBdata0.getAvailableCopies("");
        int int16 = bBdata0.getBorrowCount("");
        int int18 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        boolean boolean21 = bBdata0.bookExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("");
        int int5 = bBdata0.getBorrowLimit();
        bBdata0.increaseBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        java.lang.String str4 = bBdata0.getMemberName("hi!");
        bBdata0.printAllBooks();
        boolean boolean7 = bBdata0.isMemberActive("");
        boolean boolean9 = bBdata0.bookExists("");
        int int11 = bBdata0.getAvailableCopies("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("hi!");
        java.lang.String str4 = bBdata0.getBookTitle("");
        boolean boolean6 = bBdata0.memberExists("hi!");
        java.lang.String str8 = bBdata0.getBookTitle("");
        java.lang.String str10 = bBdata0.getMemberName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllBooks();
        int int4 = bBdata0.getBorrowCount("hi!");
        bBdata0.increaseBorrowCount("");
        java.lang.Class<?> wildcardClass7 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int1 = bBdata0.getBorrowLimit();
        bBdata0.printAllMembers();
        int int4 = bBdata0.getBorrowCount("");
        int int6 = bBdata0.getAvailableCopies("");
        java.lang.String str8 = bBdata0.getBookTitle("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        bBdata0.decreaseCopy("");
        boolean boolean4 = bBdata0.memberExists("hi!");
        bBdata0.printAllMembers();
        int int7 = bBdata0.getAvailableCopies("hi!");
        boolean boolean9 = bBdata0.bookExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        boolean boolean18 = bBdata0.memberExists("hi!");
        java.lang.String str20 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        int int2 = bBdata0.getAvailableCopies("");
        bBdata0.printAllBooks();
        java.lang.String str5 = bBdata0.getBookAuthor("");
        int int7 = bBdata0.getBorrowCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        boolean boolean24 = bBdata0.isMemberActive("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.Class<?> wildcardClass19 = bBdata0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        boolean boolean20 = bBdata0.memberExists("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        Latifa.BBdata bBdata0 = new Latifa.BBdata();
        java.lang.String str2 = bBdata0.getBookTitle("hi!");
        bBdata0.printAllMembers();
        java.lang.String str5 = bBdata0.getMemberName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }
}

