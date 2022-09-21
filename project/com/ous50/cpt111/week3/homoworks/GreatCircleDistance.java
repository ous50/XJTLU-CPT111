package com.ous50.cpt111.week3.homoworks;

//Write a Java program that takes four """double""" input numbers x1, y1, x2, y2, which are the latitude and longitude """in degrees""" of two points on the surface of the Earth;
//        uses the mean radius of the Earth r = 6,371.0  kilometres;
//        and prints the great-circle distance dist between them in kilometres.
//
//        Note that the input numbers are given in degrees but Java’s trigonometric functions use radians. Use """Math.toRadians()""" to convert from degrees to radians.

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        //calculation test
//        double x1 = Math.toRadians(80.0);
//        double y1 = Math.toRadians(25.0);
//        double x2 = Math.toRadians(155.0);
//        double y2 = Math.toRadians(102.5);

        Scanner kb = new Scanner(System.in);

        final double r = 6371.0;// make radius a constant(will not change later ).

        //declare and initiate variables.
        double x1 = Math.toRadians(kb.nextDouble());
        double y1 = Math.toRadians(kb.nextDouble());
        double x2 = Math.toRadians(kb.nextDouble());
        double y2 = Math.toRadians(kb.nextDouble());

        //the calculation
//        double dist = 2 * r * Math.asin(Math.sqrt(Math.sin((x2-x1)/2)*Math.sin((x2-x1)/2) + Math.cos(x1)*Math.cos(x2)*Math.sin((y2-y1)/2)*Math.sin((y2-y1)/2))); //too hard to debug
        double sin_xbar = Math.sin((x2-x1)/2);
        double sin2_xbar = sin_xbar * sin_xbar;
        double cos_xbar = Math.cos(x1)*Math.cos(x2);
        double sin_ybar  = Math.sin((y2-y1)/2);
        double sin2_ybar = sin_ybar * sin_ybar;

        double dist = 2 * r * Math.asin(
                Math.sqrt(
                        sin2_xbar + cos_xbar * sin2_ybar
                )
        );


        //output
        System.out.println(dist + " kilometres");
        System.out.printf("%1.12f kilometres%n", dist); //to get let printf() output the same decimal number as println(), one has to use %.12f(denoting the precision) (see https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Format-double-Java-printf-example)instead of simply using %f.
        System.out.printf("%f kilometres", dist);       //precision difference between these two expression...

    }
}
