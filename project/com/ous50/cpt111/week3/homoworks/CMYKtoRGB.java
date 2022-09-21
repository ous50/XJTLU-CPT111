package com.ous50.cpt111.week3.homoworks;

import java.util.Scanner;

//CW1 #3.2 Great Circle Distance
//Write a Java program that converts from CMYK format to RGB format using the following formulas:
//        white = 1 − black
//        red = 255 × white × (1 − cyan)
//        green = 255 × white × (1 − magenta)
//        blue = 255 × white × (1 − yellow)
//
//        Your program must take """""four double input numbers"""""" cyan, magenta, yellow, and black;
//        compute the corresponding RGB values, each """""""""rounded to the nearest integer"""""""";
//        and print the RGB values as in the test cases below:
//        Test case 1:
//        Input:
//        0.0
//        0.0
//        1.0
//        0.0
//        Output:
//        red = 255
//        green = 255
//        blue = 0
//
//        Test case 2:
//        Input:
//        0.0
//        1.0
//        0.75
//        0.50
//        Output:
//        red = 128
//        green = 0
//        blue = 32
public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input CMYK value
        double cyan = kb.nextDouble();
        double magenta = kb.nextDouble();
        double yellow = kb.nextDouble();
        double black = kb.nextDouble();

        //convert into RGB
        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        System.out.printf("red = %d%ngreen = %d%nblue = %d", Math.round(red), Math.round(green), Math.round(blue));

    }
}
