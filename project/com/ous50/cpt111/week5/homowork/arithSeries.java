package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

/**
 * Exercise 4.4 Arithmetic Series
 * <br/>
 * On input an integer n >= 0, outputs an array with the pattern<br/>
 * <code>[1, 1, 2, 1, 2, 3, ......,1, 2, 3, ...,n]</code><br/>
 * <br/>
 * Test cases:
 * <br/>
 * <pre>
 * arithSeries(2) → [1, 1, 2]
 * arithSeries(3) → [1, 1, 2, 1, 2, 3]
 * arithSeries(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * </pre><br/>
 *
 * param n the input in series.<br/>
 * return the array of integer following all sequences of the arithmetic progression <code>a_{n+1}=a_n+1</code>
 */

public class arithSeries {

    public static int[] arithSeries(int n) {
        //calculate the length
        int length = n*(n + 1)>>1;

        //array
        int[] array = new int[length];
        for (int i = 1,k = 0 ; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                array[k++] = j ;
            }
        }

    return array;
    }

    public static void main(String[] args) {
        lib.printArray(arithSeries(0));
    }
}
