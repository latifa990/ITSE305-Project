package test.business;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        boolean boolean15 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        boolean boolean45 = loginService0.login("hi!", "");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        boolean boolean30 = loginService0.login("", "hi!");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        boolean boolean21 = loginService0.login("hi!", "hi!");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
}

