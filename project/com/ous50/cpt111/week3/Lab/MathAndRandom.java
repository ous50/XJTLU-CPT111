package com.ous50.cpt111.week3.Lab;

import java.util.Scanner;

public class MathAndRandom {
    public static void main(String[] args) {
        double sqr5 = Math.sqrt(5);
        Scanner kb = new Scanner(System.in);//make a new scanner. See the lab pdf.
        System.out.println("Input your min value");
        int min = kb.nextInt();
        System.out.println("Input your max value");
        int max = kb.nextInt();//If your variable is String, use kb.nextLine()

        System.out.println("The value of PI is " + Math.PI);
        System.out.println("The value of Squre 5 is " + sqr5);
        System.out.println("max value is " + max + " and min value is " + min);


    }

}
