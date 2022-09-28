package com.ous50.cpt111.week4.homoworks;

import com.ous50.cpt111.lib;

/**
 * <p>Exercise #4.1 Black Jack</p>
 *
 * <p>
 * In Black Jack card game, we call a value *busts* if it exceeds a sum of 21.
 *</p>
 *
 * <p>
 * Write a Java program *BlackJack* that on input 2 integer values greater than 0, prints a single integer of whichever value is nearest to 21 without going bust. Print -1 if both values bust.
 *</p>
 *
 * <p></p>
 * <p><img src="../../../../../../homework.assets/Blackjack-Cards-Image.png" alt="" style="float: left" height=300 /></p>
 *
 * <p>Test case 1:</p>
 * <p>Input:</p>
 * <p>20</p>
 * <p>19</p>
 * <p>Output:</p>
 * <p>20</p>
 * <p></p>
 *
 * <p>Test case 2:</p>
 * <p>19</p>
 * <p>22</p>
 * <p>Output:</p>
 * <p>19</p>
 * <p></p>
 *
 * <p>Test case 3:</p>
 * <p>Input:</p>
 * <p>22</p>
 * <p>23</p>
 * <p>Output:</p>
 * <p>-1</p>
 */

public class BlackJack {
    public static void main(String[] args) {


        //variables
        int firstNumber = lib.readInt();
        int secondNumber = lib.readInt();


        //if statement
        if (firstNumber > 21){
            // to recognize if b is burst or not
            if (secondNumber <= 21) {
                System.out.println(secondNumber);
            } else {
                lib.println("-1");
            }

        } else if (secondNumber > 21) {
            // to recognize if a is burst or not
            if (firstNumber <= 21) {
                lib.println(firstNumber);
            } else {
                lib.println("-1");
            }

        } else {
            //no burst situations
            if (firstNumber < secondNumber ) {
                lib.println(secondNumber);
            } else  {
                lib.println(firstNumber);// when a = b, choosing both of them to print out is acceptable.
            }
        }

    }
}
