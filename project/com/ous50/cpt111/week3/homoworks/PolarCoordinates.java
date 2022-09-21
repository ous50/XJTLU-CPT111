package com.ous50.cpt111.week3.homoworks;

import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x = kb.nextDouble();
        double y = kb.nextDouble();
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y,x);;//hidden test

        System.out.println("r = " + r);
        System.out.println("theta = " + theta);

    }
}
