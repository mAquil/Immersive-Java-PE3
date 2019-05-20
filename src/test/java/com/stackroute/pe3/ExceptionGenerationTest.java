
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionGenerationTest {
    ExceptionGeneration obj;

    @Before
    public void setUp(){
        obj=new ExceptionGeneration();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void NegArrayTest(){      //test for negative array size exception
        int arr[]={2,4,1,8,3,9,10};
        String expected="NegativeArraySizeException";
        String result=obj.NegArray(arr);
        assertEquals(expected,result);

    }


    @Test
    public void IndexOutTest(){   //tets for index out of bounds exception

        int arr[]={2,4,1,8,3,9};
        String expected="IndexOutOfBoundsException";
        String result=obj.IndexOut(arr);
        assertEquals(expected,result);
    }

   @Test
    public void NullPointTest() {    //test for null pointer exception

       String s = null;

       String expected = "NullPointerException";
       String result = obj.NullPoint(s);
       assertEquals(expected, result);
   }

   }
