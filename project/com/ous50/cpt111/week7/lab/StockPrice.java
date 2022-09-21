package com.ous50.cpt111.week7.lab;

public class StockPrice {
    private String ticker, date;
    private double open, high, low, close;
    private int volume;

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getDate() {
        return this.date;
    }

    public double getOpen() {
        return this.open;
    }

    public double getHigh() {
        return this.high;
    }

    public double getLow() {
        return this.low;
    }

    public double getClose() {
        return this.close;
    }

    public int getVolume() {
        return this.volume;
    }



    public StockPrice(String ticker, String date, double open, double high, double low, double close, int volume) {
        this.ticker = ticker;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }



    public String toString() {

//        lib.println("Stockprice Ticker is " + obj[i].getTicker());
//        lib.println("  -- Opening price is " + obj[i].getOpen());
//        lib.println("  -- Closing price is " + obj[i].getClose());
//
        return String.format("Stockprice Ticker is %s\n",this.ticker) +
                String.format("  -- Opening price is %.2f\n", this.open) +
                String.format("  -- Closing price is %.2f", this.close);
    }



    public double getSpread(){
        return this.open - this.low;
    }




//    StockPrice obj[] = new StockPrice[3];//create an object array for objects StockPrice.



}
