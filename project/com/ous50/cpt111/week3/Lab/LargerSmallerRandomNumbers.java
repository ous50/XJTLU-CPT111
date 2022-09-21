package com.ous50.cpt111.week3.Lab;

import java.util.Scanner;

// This is Lab Excercise 3.1
public class LargerSmallerRandomNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your min value");
        int min = kb.nextInt();
        System.out.println("Input your max value");
        int max = kb.nextInt();
        double randomInteger1 = min + (int)(Math.random() * (max - min + 1)); //Math.random() only generate a random number >= 0 but < 1. so this can generate a random integer randomInteger between min and max.
        double randomInteger2 = min + (int)(Math.random() * (max - min + 1));

        System.out.println("First random number = " + randomInteger1 );
        System.out.println("Second random number = " + randomInteger2 );
        System.out.printf("First is smaller than second: %b\n" , (randomInteger1 < randomInteger2));// the %b tells the compiler what I will insert into is a boolean.
        System.out.printf("First is equal to second: %b\n" , (randomInteger1 == randomInteger2));
        System.out.printf("First is larger than second: %b\n" , (randomInteger1 > randomInteger2));
    }
}
