package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayOfPlaceTest {
    ArrayOfPlace pl;

    @Before
    public void setup()
    {
        //arrenge
        pl = new ArrayOfPlace();
    }

    @After
    public void tearDown()
    {
        //arrenge
        pl= null;
    }
    @Test
    public void placeTest() throws Exception
    {
        String [] s1={"India", "United States", "Germany","Egypt","Czechoslovakia"};
        String[] result = pl.place(s1);
        String[] expected ={"Ind", "Untd Stts", "Grmny","Egypt","Czchslvk"};  //expected result
        assertArrayEquals(expected, result);

    }



}
