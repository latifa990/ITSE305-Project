package test.model;

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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        model.user user2 = new model.user("", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.String str13 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.lang.String str15 = user2.getPassword();
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str17 = user2.getPassword();
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str14 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.String str15 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.String str17 = user2.getPassword();
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.String str14 = user2.getUsername();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        model.user user2 = new model.user("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        model.user user2 = new model.user("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str12 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.String str16 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.lang.String str14 = user2.getPassword();
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getUsername();
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.String str12 = user2.getUsername();
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.lang.String str16 = user2.getPassword();
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.String str16 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.lang.String str17 = user2.getPassword();
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.String str14 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.String str17 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
        java.lang.String str19 = user2.getUsername();
        java.lang.String str20 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        java.lang.String str17 = user2.getUsername();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getPassword();
        java.lang.String str20 = user2.getPassword();
        java.lang.String str21 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.String str20 = user2.getPassword();
        java.lang.Class<?> wildcardClass21 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        model.user user2 = new model.user("", "");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.String str14 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getUsername();
        java.lang.String str19 = user2.getUsername();
        java.lang.Class<?> wildcardClass20 = user2.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str15 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.String str13 = user2.getUsername();
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        model.user user2 = new model.user("", "");
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.String str12 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
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
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.String str14 = user2.getPassword();
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        java.lang.String str13 = user2.getPassword();
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
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
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        java.lang.String str16 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        java.lang.String str14 = user2.getUsername();
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getUsername();
        java.lang.String str17 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        model.user user2 = new model.user("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.lang.String str15 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.lang.String str15 = user2.getPassword();
        java.lang.String str16 = user2.getPassword();
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.lang.String str17 = user2.getPassword();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.String str17 = user2.getPassword();
        java.lang.String str18 = user2.getPassword();
        java.lang.String str19 = user2.getUsername();
        java.lang.String str20 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getPassword();
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.lang.String str13 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.lang.String str17 = user2.getUsername();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.lang.String str14 = user2.getPassword();
        java.lang.String str15 = user2.getUsername();
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        model.user user2 = new model.user("", "");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.String str12 = user2.getPassword();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        model.user user2 = new model.user("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        java.lang.String str12 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.lang.String str15 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getPassword();
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

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getPassword();
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getUsername();
        java.lang.String str10 = user2.getUsername();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.lang.Class<?> wildcardClass17 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getUsername();
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
        java.lang.String str9 = user2.getUsername();
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        java.lang.String str12 = user2.getUsername();
        java.lang.String str13 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getPassword();
        java.lang.String str10 = user2.getPassword();
        java.lang.String str11 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getUsername();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        model.user user2 = new model.user("hi!", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getUsername();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        java.lang.String str13 = user2.getUsername();
        java.lang.String str14 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        java.lang.String str13 = user2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        model.user user2 = new model.user("hi!", "hi!");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getUsername();
        java.lang.String str8 = user2.getPassword();
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        model.user user2 = new model.user("", "hi!");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getUsername();
        java.lang.String str6 = user2.getUsername();
        java.lang.String str7 = user2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getPassword();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getPassword();
        java.lang.String str7 = user2.getPassword();
        java.lang.String str8 = user2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        model.user user2 = new model.user("", "");
        java.lang.String str3 = user2.getUsername();
        java.lang.String str4 = user2.getUsername();
        java.lang.String str5 = user2.getPassword();
        java.lang.String str6 = user2.getUsername();
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
}

