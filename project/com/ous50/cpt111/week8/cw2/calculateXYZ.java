package com.ous50.cpt111.week8.cw2;


public class calculateXYZ{

    public static int calculateXYZ(String input) {
        int amount = 0;

        for (int i = 0 ; i < input.length() ; i++){
            for (int j = i; j < input.length(); j++) {
                String substring = input.substring(i, j+1);
                for (char c : substring.toCharArray())
                    if (c == 'x' || c == 'y' || c == 'z')  amount++;
            }

        }
        return amount;
    }

}
