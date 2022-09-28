package com.ous50.cpt111.week4.homoworks;

import com.ous50.cpt111.lib;

/**
 * <p>CW1 #4.1 Right Triangle</p>
 * <p>Write a Java program <style="italic: true">RightTriangle</style> that takes three integer input numbers and determines whether they make up the side lengths of a right triangle .</p>
 * <p><img src="../../../../../../homework.assets/right-triangle1.png" alt="" style="float: left" height=200 /></p>
 * <p></p>
 *
 * <p>Your program must print output true if and only if the following two conditions are true :</p>
 * <p>1. All three integers are positive (greater than zero).</p>
 * <p>2. You can find two integers where the sum of the squares of those two integers is equal to the square of the third integer.</p>
 * <p></p>
 *
 * <p></p>
 *
 */

public class RightTriangle {


    private static boolean triangleJudgement(int a, int b, int c) {
        boolean isAllPositive = a > 0 && b > 0 && c > 0;
        if (!isAllPositive) return false;

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        boolean isRightTriangle = a2 + b2 == c2||
                                  b2 + c2 == a2||
                                  c2 + a2 == b2;

        return isRightTriangle;
    }

    public static void main(String[] args) {
        int a = lib.readInt();
        int b = lib.readInt();
        int c = lib.readInt();


        lib.println(triangleJudgement(a, b, c));

    }
}
