package com.ous50.cpt111.week2;

public class SimpleMath {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        double real1 = 10.0 , real2 = 3.0;

        // Error 1: All spaces and line feed is ignored by javac
        // ("num1 + num2 = " + num1 + num2) will be read as
        // ("num1 + num2 = 10" + num2) then go to
        // ("num1 + num2 = 103")




        // ( - parenthesis
        // { - curly brackets
        // [ - square brackets

        System.out.println("num1 + num2 = " + (num1 + num2) );
        System.out.println("num1 / num2 = " + (num1 / num2) );
        System.out.println("real1 + real2 = " + (real1 + real2) );
        System.out.println("real1 / real2 = " + (real1 / real2) );
    }
}
