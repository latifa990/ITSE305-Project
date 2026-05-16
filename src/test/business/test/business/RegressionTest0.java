package test.business;

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
        business.LoginService loginService0 = new business.LoginService();
        java.lang.Class<?> wildcardClass1 = loginService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass4 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass4 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "");
        boolean boolean6 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass7 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("hi!", "");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
        boolean boolean18 = loginService0.login("", "");
        boolean boolean21 = loginService0.login("", "");
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("", "");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
        boolean boolean18 = loginService0.login("hi!", "hi!");
        boolean boolean21 = loginService0.login("hi!", "");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("", "hi!");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("", "hi!");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
        boolean boolean15 = loginService0.login("", "hi!");
        boolean boolean18 = loginService0.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "hi!");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "hi!");
        boolean boolean9 = loginService0.login("", "");
        boolean boolean12 = loginService0.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = loginService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "hi!");
        boolean boolean6 = loginService0.login("hi!", "");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("", "");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("hi!", "");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        business.LoginService loginService0 = new business.LoginService();
        boolean boolean3 = loginService0.login("hi!", "");
        boolean boolean6 = loginService0.login("hi!", "");
        boolean boolean9 = loginService0.login("hi!", "");
        boolean boolean12 = loginService0.login("", "hi!");
        boolean boolean15 = loginService0.login("hi!", "hi!");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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

