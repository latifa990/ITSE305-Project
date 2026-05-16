package test.business;

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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "");
        boolean boolean45 = loginService0.login("hi!", "");
        boolean boolean48 = loginService0.login("hi!", "");
        boolean boolean51 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "");
        boolean boolean45 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "hi!");
        boolean boolean45 = loginService0.login("", "");
        boolean boolean48 = loginService0.login("hi!", "hi!");
        boolean boolean51 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        boolean boolean48 = loginService0.login("hi!", "");
        boolean boolean51 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("hi!", "");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        boolean boolean48 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("", "hi!");
        boolean boolean45 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("hi!", "");
        boolean boolean45 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("", "hi!");
        boolean boolean45 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("hi!", "");
        boolean boolean45 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("hi!", "");
        boolean boolean45 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        boolean boolean48 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
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
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass19 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("hi!", "");
        boolean boolean48 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
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
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass25 = loginService0.getClass();
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        boolean boolean42 = loginService0.login("", "");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        boolean boolean48 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("", "hi!");
        boolean boolean45 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = loginService0.getClass();
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "hi!");
        boolean boolean42 = loginService0.login("", "");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "hi!");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("hi!", "");
        boolean boolean48 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("hi!", "hi!");
        boolean boolean39 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass40 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "");
        boolean boolean39 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("", "");
        boolean boolean36 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "hi!");
        boolean boolean30 = loginService0.login("", "");
        boolean boolean33 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass34 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("hi!", "");
        boolean boolean30 = loginService0.login("hi!", "");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass37 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("hi!", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass28 = loginService0.getClass();
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
        boolean boolean27 = loginService0.login("", "");
        boolean boolean30 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
        boolean boolean27 = loginService0.login("", "hi!");
        boolean boolean30 = loginService0.login("", "hi!");
        boolean boolean33 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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

