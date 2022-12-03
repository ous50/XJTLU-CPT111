package com.ous50.cpt111.week11.homowork;


import java.util.ArrayList;

/*
 * Exercise and CW1 Week 11
 */
public class HouseOfClocks {

    // A house of clocks stores all its clocks in an ArrayList of Clock objects
    private ArrayList<Clock> clocksCollection;
    // the number of clocks in the collection
    private int numClocks;


    // Creates a house of clocks, initially with no clocks.
    public HouseOfClocks() {
        clocksCollection = new ArrayList<Clock>();
        numClocks = 0;
    }


    //  Add a new clock to this HouseOfClock's clock collection.
    public void addClock(int h, int m) {
        clocksCollection.add(new Clock(h, m));
		numClocks++;
    }


    // Exercise #11.2
    // Prints all the clocks in this HouseOfClock's clock collection.
    // It will print each clock on a new line with format "Clock "
    //     followed by the Clock format HH:MM.
    public void printClocksCollection() {
        for (Clock c: this.clocksCollection) {
            System.out.println("Clock " + c);
        }


    }


    // CW1 #11.2
    // Return the number of clocks in this HouseOfClock's clock collection
    //     that is earlier than that Clock
    public int numEarlierClocks(Clock that) {
        int numOfEarlierClocks = 0;

        for (Clock c: this.clocksCollection) {
            if (c != null && c.isEarlierThan(that)) numOfEarlierClocks++;
        }


        return numOfEarlierClocks;
    }


    public static void main(String[] args) {

        HouseOfClocks hc = new HouseOfClocks();
        hc.addClock(1, 30);
        hc.addClock(12, 8);
        hc.printClocksCollection();
            // Clock 01:30
            // Clock 12:08

        Clock c1 = new Clock(10, 45);
        System.out.println(hc.numEarlierClocks(c1));   // 1
        Clock c2 = new Clock(14, 5);
        System.out.println(hc.numEarlierClocks(c2));   // 2

		// add your own test cases :





    }

}
