package test.model;

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
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getPassword();
        java.lang.String str19 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getPassword();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        java.lang.String str20 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        java.lang.Class<?> wildcardClass20 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getPassword();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        java.lang.String str20 = user2.getPassword();
        java.lang.String str21 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getUsername();
        java.lang.String str20 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

