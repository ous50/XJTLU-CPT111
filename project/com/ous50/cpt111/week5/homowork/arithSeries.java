package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

public class arithSeries {

    public static int[] arithSeries(int n) {
        //calculate the length
        int length = n*(n + 1)/2;

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
        lib.printArray(arithSeries(4));
    }
}
