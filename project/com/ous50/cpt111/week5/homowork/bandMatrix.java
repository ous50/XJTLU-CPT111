package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

public class bandMatrix {

    public static void bandMatrix(int n, int width) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - width <= j && j <= i + width) lib.print("*  ");
                else lib.print("0  ");
            }
            lib.println();
        }
    }

    public static void main(String[] args) {
bandMatrix(4, 2);
    }
}
