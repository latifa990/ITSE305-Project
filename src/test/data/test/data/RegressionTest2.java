package test.data;

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
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass46 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("", "");
        boolean boolean48 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean45 = userRepository0.validateUser("", "hi!");
        boolean boolean48 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean51 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        boolean boolean45 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass46 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean48 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("", "");
        boolean boolean48 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean45 = userRepository0.validateUser("", "hi!");
        boolean boolean48 = userRepository0.validateUser("hi!", "");
        boolean boolean51 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        boolean boolean45 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean45 = userRepository0.validateUser("", "hi!");
        boolean boolean48 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        boolean boolean42 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass31 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass34 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean36 = userRepository0.validateUser("", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass19 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass22 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }
}

