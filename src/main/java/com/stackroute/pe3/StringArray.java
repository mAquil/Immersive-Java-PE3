/*Consider the Following Problem:
You need to create a Java class that accepts two arrays of String objects, array1 and array2.
1.    Compare the elements of both the arrays
2.    Loop through each array, to remove any duplicate elements.
3.    Append the first element of array1 to array2.
4.    Prepend the mid element of array2 to array1.
You need to:
1.    Write the Test Scenarios in Given-Should Format in the README.md under the Header
# PE <pe_number> Problem <prob_number>
Ensure you create scenarios for:
a.    One or more Positive Test Case
b.    One or More Negative Test Cases
c.    One or More Edge Cases
2.    Implement the Test Cases
3.    Write the implementation code

 */

package com.stackroute.pe3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArray {

    public String Elements(String array1[],String array2[])
    {
        String  result="";
        boolean flag=true;
        for (int i=0;i<array1.length;i++ ){
            flag=array1[i].equals(array2[i]);

            if(flag==false) {
                result = "The array elements in both the arrays are not equal";
                break;
            }
        }
        if (flag==true)
            result="The array elements in both the arrays are equal";

        return result;
    } // 1. compare the elements of both ararys


    public String[] Duplicate(String[] array1){

        int size=array1.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if (array1[i]==array1[j]){

                    for(int k=j;k<size;k++){
                        int temp=k+1;
                        array1[k]=array1[temp];
                    }
                    size=size-1;
                }

            }
        }
        String[] result=new String[size];
        for (int t=0;t<size;t++){
            result[t]=array1[t];
        }

        return result;
    } // 2. remove duplicate elements


    public String[] AppendFirstElement(String[] array1, String[] array2)
    {
        String[] result= new String[array2.length+1];
        int pos = array1.length-1,j=0;

        result[0] = array2[pos];

        for (int i=0; i<result.length-1; i++)
        {
            result[i]=array2[j];
            j=j+1;

        }
        result[result.length-1]=array1[0];
        return result;
    } // 3. Append the first element of array1 to array2.



    public String[] PrependMidElement(String[] array1, String[] array2)
    {
        String[] result= new String[array1.length+1];
        int pos = array2.length/2,j=0;

        result[0] = array2[pos];

        for (int i=1; i<result.length; i++)
        {
            result[i]=array1[j];
            j=j+1;

        }
        return result;
    } // 4. prepend mid element

} //class ends
