/* Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk
 */

package com.stackroute.pe3;

public class ArrayOfPlace {

    public String[] place(String s[]) {
        for (int i = 0; i < s.length; i++) {
            String str=s[i].substring(1);
            str = str.replaceAll("[aeiou]", "");  //if string has vowel remove it
            s[i] = s[i].substring(0, 1) + str;


        }
        return s;
    }
}