package test.data;

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
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean48 = userRepository0.validateUser("", "hi!");
        boolean boolean51 = userRepository0.validateUser("hi!", "");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        boolean boolean36 = userRepository0.validateUser("hi!", "");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        boolean boolean30 = userRepository0.validateUser("", "hi!");
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        boolean boolean30 = userRepository0.validateUser("", "");
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        boolean boolean45 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean48 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass10 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        boolean boolean36 = userRepository0.validateUser("", "hi!");
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("hi!", "");
        boolean boolean45 = userRepository0.validateUser("", "");
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("", "");
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        boolean boolean33 = userRepository0.validateUser("", "hi!");
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        boolean boolean30 = userRepository0.validateUser("hi!", "");
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
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
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean30 = userRepository0.validateUser("", "");
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
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
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "");
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
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
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "");
        boolean boolean45 = userRepository0.validateUser("hi!", "");
        boolean boolean48 = userRepository0.validateUser("hi!", "");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "");
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        boolean boolean30 = userRepository0.validateUser("hi!", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        boolean boolean30 = userRepository0.validateUser("", "");
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        boolean boolean36 = userRepository0.validateUser("hi!", "");
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
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
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        boolean boolean48 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
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
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        boolean boolean39 = userRepository0.validateUser("", "hi!");
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
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
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
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "");
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
        boolean boolean27 = userRepository0.validateUser("hi!", "");
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        boolean boolean30 = userRepository0.validateUser("", "hi!");
        boolean boolean33 = userRepository0.validateUser("", "hi!");
        boolean boolean36 = userRepository0.validateUser("hi!", "");
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        boolean boolean30 = userRepository0.validateUser("", "");
        boolean boolean33 = userRepository0.validateUser("hi!", "");
        boolean boolean36 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
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
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("", "");
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "");
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = userRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean27 = userRepository0.validateUser("", "hi!");
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "hi!");
        boolean boolean21 = userRepository0.validateUser("", "");
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
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        boolean boolean36 = userRepository0.validateUser("hi!", "");
        boolean boolean39 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean42 = userRepository0.validateUser("", "");
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
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("hi!", "");
        boolean boolean15 = userRepository0.validateUser("", "hi!");
        boolean boolean18 = userRepository0.validateUser("", "");
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("hi!", "");
        boolean boolean24 = userRepository0.validateUser("hi!", "");
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
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean6 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean9 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean12 = userRepository0.validateUser("", "");
        boolean boolean15 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean18 = userRepository0.validateUser("hi!", "");
        boolean boolean21 = userRepository0.validateUser("", "hi!");
        boolean boolean24 = userRepository0.validateUser("", "hi!");
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        boolean boolean30 = userRepository0.validateUser("hi!", "hi!");
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean3 = userRepository0.validateUser("hi!", "");
        boolean boolean6 = userRepository0.validateUser("hi!", "");
        boolean boolean9 = userRepository0.validateUser("hi!", "");
        boolean boolean12 = userRepository0.validateUser("hi!", "hi!");
        boolean boolean15 = userRepository0.validateUser("hi!", "");
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
}

