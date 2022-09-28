package com.ous50.cpt111.week4.lab;

import com.ous50.cpt111.lib;

import java.lang.reflect.Array;

/**
 * <p><br>Lab Exercise 4.2 Indefinite Loop with While</br>
 *         <br>The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...</br>
 *         <br>It starts with 0 and 1</br>
 *         <br>The next number is found by adding up the two numbers before it</br>
 *         <br>o The third number 1 is found by adding the two numbers before it, 0+1</br>
 *         <br>o The fourth number 2 is found by adding the two numbers before it, 1+1</br>
 *         <br>o The fifth number 3 is 1+2, and so on </br></p>
 *         <p><img src="../../../../../../homework.assets/fibonacciSequenceExample.png" alt="" style="float: left" height=200 /></p>
 *<br></br>
 * <p>     <br>Write a Java program that takes an input positive integer, n, from the user, and prints all</br>
 *         <br>numbers in the Fibonacci sequence that is less than n</br>
 *         <br>Your program’s input/output interaction should look like:</br>
 *         <br>This is the end of CPT111 2022 Lab 4 Task Sheet.</br>
 *         </p>
 */

public class fibonacciSequence {

    static int fibonacciCalculation (int input) {
        int output = input + input;

        return output;
    }

    public static void main(String[] args) {
//        int iniNum;
        int num;
        int counter = 2;
        int [] resultArray;
        lib.printf("Please Input the Limit: " );
        int limit = lib.readInt();

        //calculate the number before stopping at maximum limit


        resultArray = new int[];

        if (limit > 1){
            for (counter = 1,num < limit && num > 1, counter++){
                num = ;
        }




        lib.println(limit);
    }
}
