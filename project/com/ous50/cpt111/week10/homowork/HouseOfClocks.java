package com.ous50.cpt111.week10.homowork;

import javax.crypto.Cipher;

/*
 * CW1 Week 10
 */
public class HouseOfClocks {

    // A house of clocks stores all its clocks in an array of Clock objects
    private Clock[] clocksCollection;
    // the number of clocks
    private int numClocks;


    /** CW1 #10.1 <br/>
     * Creates a house of clocks which has a collection of numClocks clocks.<br/>
     * numClocks must be between 1 and 24, inclusive,<br/>
     * and throws IllegalArgumentException otherwise.<br/>
     * The first clock must start at 00:00, the second clock at 01:00, and so on.<br/>
     * For example,<br/>
     * if numClocks = 3, it stores 3 clocks starting at 00:00, 01:00, and 02:00.<br/>
     * if numClocks = 24, it stores 24 clocks where the last one at index 23 starts at 23:00.<br/>
     *
     * @param numClocks number of clock(s)
     */

    public HouseOfClocks(int numClocks) {
        if (numClocks < 1 || numClocks > 24) throw new IllegalArgumentException("number of clock(s) illegal");

        this.clocksCollection = new Clock[numClocks];
        this.numClocks = numClocks;

        for (int i = 0; i < clocksCollection.length; i++) {
            this.clocksCollection[i] = new Clock(i,0);
        }


    }

    // CW1 #10.2
    // creates a house of clocks which has a collection of four types of clocks in Week 9:
    // nClock, nAlarm, nCuckoo, nHalloween number of Clock, AlarmClock, CuckooClock, and HalloweenClock objects, respectively
    // all number of clock of any types must be between 0 and 24, inclusive;
    // and the total number of clocks must be between 1 and 24, inclusive;
    // and throws IllegalArgumentException, otherwise
    // the first clock must start at 00:00, the second clock at 01:00, and so on
    // the alarm time of the AlarmClock objects must be 1 hour after the starting time
    // for example,
    // if nClock = 1, nAlarm = 1, nCuckoo = 1, nHalloween = 1,
    // it stores total of 4 clocks where the first clock at index 0 is a Clock object starts at 00:00,
    // the second clock at index 1 is an AlarmClock object starts at 01:00
    // the third clock at index 2 is a CuckooClock object starts at 02:00
    // and the fourth clock at index 3 is a HalloweenClock object starts at 03:00

    public HouseOfClocks(int nClock, int nAlarm, int nCuckoo, int nHalloween) {
        if (nClock < 0 || nAlarm < 0 || nCuckoo  < 0 || nHalloween < 0) throw new IllegalArgumentException("No negative argument(s)!");
        this.clocksCollection = new Clock[nClock + nAlarm + nCuckoo + nHalloween];
        this.numClocks = nClock + nAlarm + nCuckoo + nHalloween;
        if (numClocks < 1 || numClocks > 24) throw new IllegalArgumentException("number of clock(s) illegal");
        int i = 0;

        for (int j = 0; j < nClock; j++, i++) {
            this.clocksCollection[i] = new Clock(i,0);
        }// Clock part

        for (int j = 0; j < nAlarm; j++, i++) {
            this.clocksCollection[i] = new AlarmClock(i,0,(i+1)%24,0);
        }// AlarmClock part

        for (int j = 0; j < nCuckoo; j++, i++) {
            this.clocksCollection[i] = new CuckooClock(i,0);
        }// Cuckoo Clock part

        for (int j = 0; j < nHalloween; j++, i++) {
            this.clocksCollection[i] = new HalloweenClock(i,0);
        }// Halloween Clock part


    }


    // CW1 #10.3
    // Calls the tick method of the clock in the collection at index clockIndex.
    // Throw an IndexOutOfBoundsException if the clockIndex is not valid,
    //     and use the message "No clock stored at index " followed by the invalid index.
    public void tick(int clockIndex) {
        if (clockIndex < 0 || clockIndex >= clocksCollection.length) throw new IndexOutOfBoundsException("No clock stored at index " + clockIndex);

        this.clocksCollection[clockIndex].tick();


    }


    // Prints the time of all the clocks in the collection
    // Do NOT modify this method
    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }


	// Test Client
    public static void main(String[] args) {

        // Test Case First Constructor #1
        HouseOfClocks hc1 = new HouseOfClocks(3);
        hc1.printClocks();                       // 00:00↵01:00↵02:00

        // Test Case First Constructor #2
        try {
            HouseOfClocks hc2 = new HouseOfClocks(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }

        // Test Case Tick #1
        hc1.tick(0);
        hc1.tick(0);
        hc1.tick(1);
        hc1.printClocks();                       // 00:02↵01:01↵02:00

        // Test Case Tick #2
        try {
            hc1.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  // No clock stored at index 100
        }

        // Test Case Second Constructor and Polymorphic Tick
        HouseOfClocks hc3 = new HouseOfClocks(1, 1, 1, 1);
        hc3.printClocks();              // 00:00↵01:00↵02:00↵03:00

        for (int i = 0; i < 60; i++) {
            hc3.tick(1);                // Beep beep beep beep!
        }
        for (int i = 0; i < 60; i++) {
            hc3.tick(2);                // Cuckoo!↵Cuckoo!↵Cuckoo!
        }
        for (int i = 0; i < 3; i++) {
            hc3.tick(3);                // Halloween!
        }
        try {
            HouseOfClocks hc4 = new HouseOfClocks(1, 1, 1, -1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("No negative arguments!");
        }

        try {
            HouseOfClocks hc5 = new HouseOfClocks(1, 1, 1, 100);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }

    }

}
