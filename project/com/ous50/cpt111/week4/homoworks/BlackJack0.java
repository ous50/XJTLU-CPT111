package com.ous50.cpt111.week4.homoworks;
/**
 * Using a modular function to beautify the code
 */

import com.ous50.cpt111.lib;

public class BlackJack0 {


    private static boolean isInputValid(int inputNumber) {
        return inputNumber > 0 && inputNumber <= 21;
    }

     static int calculation(int firstNumber, int secondNumber) {
        boolean firstIsValid = isInputValid(firstNumber);
        boolean secondIsValid = isInputValid(secondNumber);


        int answer = -1;

        if (firstIsValid && !secondIsValid ){
            answer = firstNumber;
        } else if (!firstIsValid && secondIsValid) {
            answer = secondNumber;
        } else if (firstIsValid) {
            answer = Math.max(firstNumber,secondNumber);
        }

         return answer;
    }


    public static void main(String[] args) {

       int answer = calculation(lib.readInt(), lib.readInt());
       System.out.println(answer);

    }


}
