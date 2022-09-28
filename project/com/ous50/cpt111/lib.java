package com.ous50.cpt111;

import java.io.PrintStream;
import java.util.Scanner;

public class lib {
    //make scanner
    public static Scanner cin = new Scanner(System.in);


    //input method
    public static String readLine() {return cin.nextLine();}
    public static int readInt() {return Integer.parseInt(cin.nextLine());}

    public static double readDouble() {return Double.parseDouble(cin.nextLine());}

    //println
    public static void println() {System.out.println();}// in case of nothing is input
    public static void println(Object str) {
        System.out.println(str);
    }

    public static void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }


}
