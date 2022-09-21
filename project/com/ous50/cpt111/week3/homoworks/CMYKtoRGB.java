package com.ous50.cpt111.week3.homoworks;

import java.util.Scanner;

//CW1 #3.2 Great Circle Distance

public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input CMYK value
        double cyan = Double.parseDouble(kb.nextLine());// use wrapper class instead of kb.nextDouble to accelerate.
        double magenta = Double.parseDouble(kb.nextLine());
        double yellow = Double.parseDouble(kb.nextLine());
        double black = Double.parseDouble(kb.nextLine());

        //convert into RGB
        /*
         Some may find their codes cannot be compiled when they just copy the equation from the question.
         That's because the operators in human writing is actually unicode, instead of ASCII code operators.
         */
        double white = 1 - black;
        long red = Math.round(255 * white * (1 - cyan)); //Math.round() outputs a type "long" variable.
        long green = Math.round(255 * white * (1 - magenta));
        long blue = Math.round(255 * white * (1 - yellow));

//        System.out.printf("red = %d\ngreen = %d\nblue = %d", red, green, blue);//not intuitive, use println() instead
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);

    }
}
