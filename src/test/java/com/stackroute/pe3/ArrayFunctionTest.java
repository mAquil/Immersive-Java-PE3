package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayFunctionTest
{
    ArrayFunction af;

    @Before
    public void setup() {

        af = new ArrayFunction();
    }

    @After
    public void tearDown() {

        af = null;
    }

    @Test
    public void evenOddTest() throws Exception {  //test for even odd number
        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenOddTestFailure() throws Exception //tets for failure
    {
        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        assertNotNull(result);
    }

    @Test
    public void removePrimeTest() throws Exception{    //test to remove prime no.
        int[] arr = {3, 12, 7, 1};
        int[] result = af.removePrime(arr);
        int[] expected = {12, 1};
        assertArrayEquals(result, expected);
    }

    @Test
    public void removePrimeTestFailure() throws Exception
    {
        int[] arr = {3, 12, 7, 1};
        assertNotNull(af.removePrime(arr));

        assertNotEquals("3, 7", af.removePrime(arr));
    }

    @Test
    public void reverseArrayTest() throws Exception {   //test to reverse the array

        int[] arr = {4, 3, 7, 8};
        int [] result = af.reverseArray(arr);
        int [] expected = {8, 7, 3, 4};
        assertArrayEquals(expected, result);

    }

    @Test
    public void reverseArrayTestFailure() throws Exception
    {
        int[] arr = {4, 3, 7, 8};
        assertNotNull(af.reverseArray(arr));
        assertNotEquals("4, 3, 7, 8", af.reverseArray(arr));
    }

}
