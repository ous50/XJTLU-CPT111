package com.ous50.cpt111.week5.cw;

/**
 * Write a Java static method named isMultFiveEleven that takes an integer and returns true if and only if the integer is a multiple of five and eleven.
 */

import com.ous50.cpt111.lib;

public class isMultFiveElevenMethod {
    static boolean isMultFiveEleven (int a) {
        return a % 5 == 0 && a % 11 == 0;
    }

    public static void main(String[] args) {
        lib.println(isMultFiveEleven(lib.readInt()));
    }
}
