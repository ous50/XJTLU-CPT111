package com.ous50.cpt111.week7.lab;

import com.ous50.cpt111.lib;

public class LabStock {





    public static void main(String[] args) {
        //initialize objects
        StockPrice sp1 = new StockPrice(
                "AAPL",
                "2006-12-1",
                91.8,
                92.33,
                90.1,
                91.32,
                28395700);
        StockPrice sp2 = new StockPrice("AAPL",
                "2006-12-4",
                91.88,
                92.05,
                90.5,
                91.12,
                25340600);
        StockPrice sp3 = new StockPrice("AAPL",
                "2006-12-5",
                91.625,
                92.33,
                90.87,
                91.27,
                23672800);

        //print out strings with format "Stock $TICKER $DATE created"
        lib.println(sp1);
        lib.println(sp2);
        lib.println(sp3);
        lib.println();

        //print out spread of sp1
        lib.println("Spread is " + sp1.getSpread());
        lib.println();

        //create an object array.
        StockPrice obj[] = {sp1,sp2,sp3};
        //

        double lowestOpeningPrice = Double.MAX_VALUE;


        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getOpen() < lowestOpeningPrice) lowestOpeningPrice = obj[i].getOpen();
            lib.println("Stockprice Ticker is " + obj[i].getTicker());
            lib.println("  -- Opening price is " + obj[i].getOpen());
            lib.println("  -- Closing price is " + obj[i].getClose());
        }
        lib.println();
        lib.println("Lowest opening price is: " + lowestOpeningPrice);
    }


}
