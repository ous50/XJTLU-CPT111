package com.ous50.cpt111.week4.homoworks;

import com.ous50.cpt111.lib;

/**
 *
 */

public class HailStone {


    private static long computation (long n){
        int length;

//        for (length = 1;n != 1;length++){
//            boolean isNOdd = (n % 2 == 1);
//            if (isNOdd) {
//                n = 3 * n + 1 ;
//            } else {
//                // n /= 2;
//                n >>= 1; // <<= 1 is equivalent to n *= 2.
//            }
//        }
        length = 1;
        while (n > 1){
            n = n % 2 == 0 ? n >> 1 : 3 * n + 1;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        int n = lib.readInt();
        lib.println(computation(n));
    }
}
