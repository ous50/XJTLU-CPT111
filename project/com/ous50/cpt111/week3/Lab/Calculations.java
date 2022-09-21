package com.ous50.cpt111.week3.Lab;

import java.sql.SQLOutput;


public class Calculations {
    public static void main (String[] args){
        double val1 = 4.0;
        double val2 = 8.0;
        double val3 = -1.0;

        double complexCalc =  4 + 8 * -1 - 4 + 4 / 8 /*← 4/8 is formatted into 0.*/ + -1; // Triggered a cast. The compiler "corrects" the type automatically from double to int.
        double complexCalcReal = val1 + val2 * val3 - val1 + val1 / val2 + val3;
        double complexCalcPare = (val1 + val2 * val3 - val1 + val1) / val2 + val3;
        System.out.println(complexCalc + " " +complexCalcReal + " " + complexCalcPare);

    }
}
