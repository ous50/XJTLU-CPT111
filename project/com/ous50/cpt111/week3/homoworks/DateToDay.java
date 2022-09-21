package com.ous50.cpt111.week3.homoworks;

import java.util.Scanner;

//Exercise #3.1 What day is it?
public class DateToDay {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        int y = date.nextInt();
        int m = date.nextInt();
        int d = date.nextInt();

        int a = y - (14 - m)/12;
        int b = a + a/4 - a/100 + a/400;
        int c = m + 12 * ((14-m)/12) - 2;
        int day = (d + b + (31 * c)/12) % 7;
        System.out.printf("It's day %d !", day);

    }
}
