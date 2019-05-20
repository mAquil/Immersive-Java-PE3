/*  Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers
*/

package com.stackroute.pe3;

public class NumberSeries
{
    public String getConsecutiveNumbers(int[] series)
    {
        String result;
        int count1=0;
        for (int i=0; i< series.length-1; i++)
        {

            if (series[i+1] - series[i] == 1)
            {
                count1++;
            }
        }
        if (series[count1] == series[series.length-1])   //finding whether number is consecutive or not
            result = "consecutive";
        else
            result = "non consecutive";

        return result;
    }


    public String getConsecutiveNumbers2(int[] series)
    {
        String result;
        int count2 = series.length - 1;
        for (int i = series.length - 1; i > 0; i--)
        {
            if (series[i] - series[i - 1] == 1)
            {
                count2--;
            }

        }

        if (series[count2] == series[series.length-1])
            result = "consecutive";

        else
            result = "non consecutive";


        return result;
    }
}