package com.ous50.cpt111.week6.homowork;

import com.ous50.cpt111.lib;
import org.jetbrains.annotations.NotNull;

/**Exercise #6.1 War and Peace<br/>
 * <br/>
 * Write a Java method that given a string <code>text</code>, returns <code>true</code> if <br/>
 * the string "war" and "peace" appear the same number of times in `text`.<br/>
 * <br/>
 * <img src="../../../../../../homework.assets/war-and-peace.jpg" alt="" style="float: left" height=300 /><br/>
 * All input letters are in @lowercase.<br/>
 * <br/>
 * Test cases:<br/>
 * <pre>
 *     warAndPeace("there was never a good war, or a bad peace") → true<br/>
 *     warAndPeace("war what is it good for") → false
 * </pre>
 */

public class warAndPeaceNums {

        public static int findWar(@NotNull String str) {
            int start = 0;
            int num = 0;

            while (true) {
                int found = str.indexOf("war", start);
                // found one, do something here
                if (found != -1) num = num + 1;
                if (found == -1) break; // found none, stop looping
                start = found + 2;
                // move start up for next iteration
            }
            return num;
        }

        public static int findPeace(@NotNull String str) {
            int start = 0;
            int num = 0;

            while (true) {
                int found = str.indexOf("peace", start);
                // found one, do something here
                if (found != -1) num = num + 1;
                if (found == -1) break; // found none, stop looping
                start = found + 2;
                // move start up for next iteration
            }
            return num;
        }

        public static boolean warAndPeace (String input) {
            int warNum = findWar(input);
            int peaceNum = findPeace(input);

            return warNum == peaceNum;
        }



    public static boolean warAndPeace2 (String input) {
            //declaring variables
            String kw0 = "war";
            String kw1 = "peace";
            int warNum = 0;
            int peaceNum = 0;

            while (input.contains(kw0)) {
                input = input.substring(input.indexOf(kw0) + kw0.length()); //replace with the remaining contents
//                lib.println(input);
                warNum++;
//                lib.println("War number: " + warNum);
            }

            while (input.contains(kw1)) {
                input = input.substring(input.indexOf(kw1) + kw1.length()); //replace with the remaining contents
//                lib.println(input);
                peaceNum++;
//                lib.println("Peace number: " + peaceNum);
            }



        return warNum == peaceNum;
    }

    public static void main(String[] args) {
        lib.println(warAndPeace2("there was never a good war, or a bad peace"));
        lib.println(warAndPeace2("war what is it good for"));
    }
}
