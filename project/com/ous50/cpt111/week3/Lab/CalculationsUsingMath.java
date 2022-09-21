package com.ous50.cpt111.week3.Lab;

import java.util.Scanner;

//Lab exercise 3.2
public class CalculationsUsingMath {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Input the circle radius?");
        double radius = rd.nextDouble();

        double a = Math.PI * radius * radius;

        System.out.println("The area is = " + a);
        System.out.printf("The rounded area = %d", (int)Math.round(a));//to generate a rounded number

    }
}
