package com.ous50.cpt111.week4.homoworks;

import com.ous50.cpt111.lib;
import java.util.Scanner;

/**
 * <p>Exercise #4.2 Pandemic Spread</p>
 * <p></p>
 * <p>Write a Java program PandemicSpread  to simulate how fast a pandemic spread with the following input:</p>
 * <p>init : the initial number of infected persons on day 1</p>
 * <p>numInfect : the average number of healthy people that one infected person newly infects per day</p>
 * <p>population : the total number of people in the area</p>
 * <p></p>
 *
 * <p>Return the day on which the entire population will be infected.</p>
 * <p><img src="../../../../../../homework.assets/pandemicspread.png" alt="" style="float: left" height=100 /></p>
 * <p></p>
 *
 * <p>Test case 1 :</p>
 * <p>Input:</p>
 * <p>1</p>
 * <p>2</p>
 * <p>10</p>
 * <p>Output: </p>
 * <p>4</p>
 * <p>(Explanation: Total Infected Day 1 = 1; Day 2 = 3; Day 3 = 9; Day 4 = 27)</p>
 * <p></p>
 *
 * <p>Test case 2 :</p>
 * <p>Input:</p>
 * <p>5</p>
 * <p>3</p>
 * <p>1000</p>
 * <p>Output: </p>
 * <p>5</p>
 *
 *
 */

public class PandemicSpread {

    static Scanner cin = new Scanner(System.in);

    private static int readInt() {
        return cin.nextInt();
    }

    private static int spreadSimulationWhileLoop(int init,int numInfect,int population) {
        int dayEntirePopulationInfected = 1;
        int infectedNumber = init;
        int dailyInfected  = infectedNumber * numInfect;

            while (infectedNumber < population){
                infectedNumber = infectedNumber + dailyInfected;
                dailyInfected  = infectedNumber * numInfect;
                dayEntirePopulationInfected++;
        }

        return dayEntirePopulationInfected;
    }

    public static int spreadSimulationForLoop(int init,int numInfect,int population) {
        int dayEntirePopulationInfected;
        int infectedNumber = init;

        for (dayEntirePopulationInfected = 1 ;infectedNumber < population; dayEntirePopulationInfected++ ){
//            infectedNumber += infectedNumber * numInfect;
            infectedNumber *= (1 + numInfect);
            // a += b === a = a + b
            // a *= b === a = a * b
//            infectedNumber =  infectedNumber *(1+ dailyInfected);
        }

        return dayEntirePopulationInfected;
    }

    public static void main(String[] args) {

        int init       = lib.readInt();
        int numInfect  = lib.readInt();
        int population = lib.readInt();

//        int dayEntirePopulationInfected = spreadSimulationWhileLoop(init, numInfect, population);

        int dayEntirePopulationInfected = spreadSimulationForLoop(init, numInfect, population);

        System.out.println(dayEntirePopulationInfected);

    }
}
