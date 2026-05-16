package test.business;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        boolean boolean36 = loginService0.login("hi!", "");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        boolean boolean30 = loginService0.login("hi!", "hi!");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("hi!", "hi!");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        boolean boolean45 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass46 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.lang.Class<?> wildcardClass46 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        boolean boolean36 = loginService0.login("hi!", "");
        boolean boolean39 = loginService0.login("", "");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        boolean boolean30 = loginService0.login("", "");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        boolean boolean30 = loginService0.login("", "");
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        boolean boolean30 = loginService0.login("", "");
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass4 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        boolean boolean33 = loginService0.login("hi!", "");
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        boolean boolean30 = loginService0.login("hi!", "");
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        boolean boolean30 = loginService0.login("", "");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        boolean boolean36 = loginService0.login("hi!", "hi!");
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        boolean boolean45 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
        boolean boolean24 = loginService0.login("", "");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        boolean boolean45 = loginService0.login("", "hi!");
        boolean boolean48 = loginService0.login("hi!", "");
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        boolean boolean33 = loginService0.login("", "hi!");
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("hi!", "hi!");
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        boolean boolean30 = loginService0.login("", "");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "hi!");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        boolean boolean45 = loginService0.login("", "hi!");
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        boolean boolean36 = loginService0.login("", "hi!");
        boolean boolean39 = loginService0.login("", "");
        boolean boolean42 = loginService0.login("hi!", "hi!");
        boolean boolean45 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        boolean boolean45 = loginService0.login("", "hi!");
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        boolean boolean45 = loginService0.login("", "hi!");
        boolean boolean48 = loginService0.login("hi!", "hi!");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
        boolean boolean24 = loginService0.login("", "hi!");
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        boolean boolean30 = loginService0.login("hi!", "hi!");
        boolean boolean33 = loginService0.login("hi!", "");
        boolean boolean36 = loginService0.login("", "hi!");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        boolean boolean45 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass46 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "hi!");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
}

