package com.ous50.cpt111.week7.homowork;
/*
 * Mock CW2 Set 3
 */

public class AppearOnce {

    // Mock CW2 Set 3
    // Complete the method appearOnce that on input a non-empty string,
    // prints the first character that appears exactly once in the string.
    // You may assume that the input string will contain at least one such character.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    public static char appearOnce(String input) {
		int[] count = new int[256];
        // [0,0,1,5...,0,0]
        // ... 'A' 'B'
        for (char c : input.toCharArray())
            count[c]++;

        for (char c: input.toCharArray())
            if (count[c] == 1)
                return c;

        return '\0';
    }

    public static void main(String[] args) {
        String input = "abcdbaddab";
        System.out.println(appearOnce(input)); // 'c'
        input = "abcdcb";
        System.out.println(appearOnce(input)); // 'a'
        input = "x";
        System.out.println(appearOnce(input)); // 'x'

        // add your own test cases



    }
}
