
package com.stackroute.pe3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionGenerationTest {
    ExceptionGeneration obj=new ExceptionGeneration();

    @Test
    public void NegArrayTest(){
        int arr[]={2,4,1,8,3,9,10};
        String expected="NegativeArraySizeException";
        String result=obj.NegArray(arr);
        assertEquals(expected,result);

    }


    @Test
    public void IndexOutTest(){

        int arr[]={2,4,1,8,3,9};
        String expected="IndexOutOfBoundsException";
        String result=obj.IndexOut(arr);
        assertEquals(expected,result);
    }

   @Test
    public void NullPointTest() {

       String s = null;

       String expected = "NullPointerException";
       String result = obj.NullPoint(s);
       assertEquals(expected, result);
   }

   }
