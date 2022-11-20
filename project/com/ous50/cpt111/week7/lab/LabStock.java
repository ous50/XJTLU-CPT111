package com.ous50.cpt111.week7.lab;

import com.ous50.cpt111.lib;

public class LabStock {

    public static void main(String[] args) {

        //create an object array.
        StockPrice obj[] = {
                new StockPrice(
                        "AAPL",
                        "2006-12-1",
                        91.8,
                        92.33,
                        90.1,
                        91.32,
                        28395700),
                new StockPrice("AAPL",
                        "2006-12-4",
                        91.88,
                        92.05,
                        90.5,
                        91.12,
                        25340600),
                new StockPrice("AAPL",
                        "2006-12-5",
                        91.625,
                        92.33,
                        90.87,
                        91.27,
                        23672800)
        };
        //



        double lowestOpeningPrice = Double.MAX_VALUE;


        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getOpen() < lowestOpeningPrice) lowestOpeningPrice = obj[i].getOpen();
            lib.println(obj[i]);
        }
        lib.println();
        lib.println("Lowest opening price is: " + lowestOpeningPrice);
    }


}
