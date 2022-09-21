package com.ous50.cpt111.week6.homowork;

import com.ous50.cpt111.lib;

public class calcNetIncome {

    public static int calcNetIncome(String desc) {
        boolean inNumber, isNegative = false;
        int netIncome = 0;

        for (int i = 0, tmp = 0; i < desc.length() ; i++) {
            char currentChar = desc.charAt(i) ;
            inNumber = Character.isDigit(currentChar);

            if (inNumber) {
                tmp = tmp*10 + Integer.parseInt(String.valueOf(currentChar));
                if ( i-1 >= 0 &&desc.charAt(i-1) == '-') isNegative = true;
            } else {
                if (isNegative) tmp = tmp*(-1);
                isNegative = false;
                netIncome += tmp;
                tmp = 0;
            }

            if (i == desc.length() - 1) {
                if (isNegative) tmp *= -1;
                netIncome += tmp;
            }
        }
        return netIncome;
    }

//    public static int calcNetIncome2(String input) {
//
//    }


    public static void main(String[] args) {
        lib.println(calcNetIncome("salary 15000yuan bonus2000 rent -1000Y"));
        lib.println(calcNetIncome("25000 gross income, -200 water, electricity:-300") );
    }
}
