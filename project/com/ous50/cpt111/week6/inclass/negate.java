package com.ous50.cpt111.week6.inclass;

import com.ous50.cpt111.lib;


public class negate {

    public static void  negateVoid (int a) {
        a = -a;
    }

    public static int  negate (int a) {
        a = -a;
        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        lib.println(a);
        negateVoid(a);
        lib.println(a);
        negate(a);
        lib.println(a);
    }
}
