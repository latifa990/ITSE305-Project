package test.model;

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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.lang.String str15 = user2.getPassword();
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
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

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str18 = user2.getPassword();
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.lang.String str17 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.String str12 = user2.getPassword();
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
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
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        model.user user2 = new model.user("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str12 = user2.getPassword();
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.String str12 = user2.getUsername();
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.lang.String str12 = user2.getPassword();
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.String str15 = user2.getPassword();
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
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

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getPassword();
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.lang.Class<?> wildcardClass19 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        model.user user2 = new model.user("", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String str18 = user2.getPassword();
        java.lang.String str19 = user2.getUsername();
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }
}

