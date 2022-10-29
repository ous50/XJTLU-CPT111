package com.ous50.cpt111.week7.lab;

public class StockPrice {
    private String ticker, date;
    private double open, high, low, close;
    private int volume;


    public StockPrice(String t , String d, double o, double h, double l, double c, int  v ){
        this.ticker = t;
        this.date = d;
        this.open = o;
        this.high = h;
        this.low = l;
        this.close = c;
        this.volume = v;
    }

    public String getTicker() {
        return ticker;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public String getDate() {
        return date;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public int getVolume() {
        return volume;
    }
    public String toString() {
        return String.format("Stock %s %s created",ticker, date);
    }



    public double getSpread(){
        return this.open - this.low;
    }

//    StockPrice obj[] = new StockPrice[3];//create an object array for objects StockPrice.



}
