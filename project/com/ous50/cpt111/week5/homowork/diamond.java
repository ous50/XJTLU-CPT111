package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

public class diamond {
//note that a space is required for each loop
    public static void diamond(int n) {
        //the fist-half part
        for (int i = 0; i < (n-1)>>1 ; i++) {
            for (int j = 0; j < ((n-1)>>1) - i ; j++) lib.print(". ");
            for (int j = 0; j < (i<<1) + 1  ; j++) lib.print("* ");
            for (int j = 0; j < ((n-1)>>1) - i ; j++) lib.print(". ");
            lib.println();
        }
        //the second-half part
        for (int i = (n-1)>>1; i >= 0; i--) {
            for (int j = 0; j < ((n-1)>>1) - i ; j++) lib.print(". ");
            for (int j = 0; j < (i<<1) + 1  ; j++) lib.print("* ");
            for (int j = 0; j < ((n-1)>>1) - i ; j++) lib.print(". ");
            lib.println();
        }
    }


    public static void main(String[] args) {
//        int n = lib.readInt();

        diamond(9);
//        lib.println((int) Math.round((double) n / 2) + 1);
    }
}
