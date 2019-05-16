package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class NumberSeriesTest {

    public static NumberSeries consecutive;

    @BeforeClass
    public static void setup()
    {
        consecutive = new NumberSeries();

    }

    @AfterClass
    public static void teardown()
    {
        consecutive = null;

    }

    @Test
    public void testConsecutiveNumbers() throws Exception
    {
        int[] num = {10, 11, 12, 13, 14, 15, 16, 17};
        String expected = "consecutive";
        String actual = consecutive.getConsecutiveNumbers(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testConsecutiveNumbers1()throws Exception
    {
        int[] num = {10,20,30,40,50,60};
        String expected = "non consecutive";
        String actual = consecutive.getConsecutiveNumbers(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testConsecutiveNumbers2() throws Exception
    {
        int[] num = {7,6,5,4,3,2,1};
        String expected = "consecutive";
        String actual = consecutive.getConsecutiveNumbers2(num);
        assertEquals(expected, actual);
    }

}
