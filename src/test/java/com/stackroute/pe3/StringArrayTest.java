package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringArrayTest {

    StringArray obj = new StringArray();

    @Test
    public void ElementsTest(){

        String array1[]= {"We","are","here","at","Stackroute"};
        String array2[]= {"We","are","here","at","Stackroute"};
        String expected="The array elements in both the arrays are equal";
        String actual=obj.Elements(array1,array2);
        assertEquals(expected,actual);

    }

    @Test
    public void ElementsTestFailure()
    {
        String array1[]=new String[] {"e","a","d","c","b"};
        String array2[]=new String[] {"a","b","c","d","e"};
        assertNotEquals("The array elements in both the arrays are equal", obj.Elements(array1, array2));
    }

    @Test
    public void DuplicateTest(){
        String array1[]= {"This","is","the", "starting","of","training"};
        String expected1[]= {"This","is","the", "starting","of","training"};
        String actual1[]=obj.Duplicate(array1);
        assertArrayEquals(expected1,actual1);

    }

    @Test
    public void DuplicateTest1(){
        String array2[]= {"My","name", "is","John","Marshal"};
        String expected2[]= {"My","name", "is","John","Marshal"};
        String actual2[]=obj.Duplicate(array2);
        assertArrayEquals(expected2,actual2);
    }


    @Test
    public void AppendFirstElementTest(){
        String array1[]= {"Marshal","is", "here","again"};
        String array2[]= {"My","name", "is","John"};
        String expected[]= {"My","name", "is","John","Marshal"};
        String actual[]=obj.AppendFirstElement(array1,array2);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void AppendFirstFailure()
    {
        String[] array1 = { "a" , "b" , "c" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "i" , "j"};
        assertNotNull(obj.AppendFirstElement(array1, array2));
        assertNotEquals("f, g, h, i, j", obj.AppendFirstElement(array1, array2));
    }


    @Test
    public void PrependMidElementTest() {
        String[] array1 = {"a", "b", "c", "d", "e"};
        String[] array2 = {"f", "g", "h", "i", "j"};
        String[] actual = obj.PrependMidElement(array1, array2);
        String[] expected = {"h", "a", "b", "c", "d", "e"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void PrependMidFailure()
    {
        String[] array1 = { "a" , "b" , "c" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "i" , "j"};
        assertNotNull(obj.PrependMidElement(array1, array2));
        assertNotEquals("a, b, c, b, e", obj.PrependMidElement(array1, array2));
    }
}