package com.ous50.cpt111.week6.homowork;

import com.ous50.cpt111.lib;

public class fillSandwich {

    public static String sandwichFillings(String input) {
        int firstBread = input.indexOf("bread");
        int lastBread = input.lastIndexOf("bread");

        if (firstBread == -1 || firstBread == lastBread ) return "none";
        else return input.substring(firstBread + 5 , lastBread);

    }

    public static void main(String[] args) {
        lib.println(sandwichFillings("breadtunabread"));
        lib.println(sandwichFillings("chipsbreadtunasalad"));
    }
}
