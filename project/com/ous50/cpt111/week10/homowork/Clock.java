package com.ous50.cpt111.week10.homowork;

/**
 * CW1 Week #7, to be used again in Week #9 and Week #10
 * Complete using your codes in Week #7 and Week #9
 *
 */

public class Clock {
    private int hours;
    private int minutes;



    /** CW1 #7.1 -> Exercise #10.1 <br/>
     * Creates a clock whose initial time is h hours and m minutes.<br/>
     * Throws an IllegalArgumentException if either hours is not between 0 and 23,<br/>
     * or minutes not between 0 and 59.
     *
     * @param h clock's hour.
     * @param m clock's minute.
     */
    public Clock(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59) throw new IllegalArgumentException ("Illegal input");
        this.hours = h;
        this.minutes = m;
    }


    /** CW1 #7.2 -> Exercise #10.2<br/>
     * Creates a clock whose initial time is specified as a string, using the format HH:MM.<br/>
     * <br/>
     * Throws an IllegalArgumentException if either the string argument is not in this format,<br/>
     *      or if it does not correspond to a valid time between 00:00 and 23:59.<br/>
     * <br/>
     *
     * @param s the input String with format "HH:MM".
     */
    public Clock(String s) {
        if (s.length()!=5 || s.charAt(2) != ':') throw new IllegalArgumentException("Illegal format");
        int h,m;
        try {
            h =Integer.parseInt(s.substring(0,2));
            m =Integer.parseInt(s.substring(3,5));
        } catch (NumberFormatException e) {throw new IllegalArgumentException("Illegal format");}
        if (h < 0 || h > 23 || m < 0 || m > 59) throw new IllegalArgumentException ("Illegal input");
        this.hours = h;
        this.minutes = m;
    }

    /** CW1 #7.3 <br/>
     *
     * @return a string representation of this clock, using the format HH:MM.
     */
    public String toString() {
        return String.format("%02d:%02d",this.hours, this.minutes);
    }


    /**
     * CW1 #7.4<br/>
     * @param that the time on that clock.
     * @return whether the time on this clock is earlier than the time on that clock.
     */
    public boolean isEarlierThan(Clock that) {
        if (this.hours < that.hours ) return true;
        else if (this.hours == that.hours && this.minutes < that.minutes) return true;
        return false;
    }


    /**
     * CW1 #7.5<br/>
     * Adds 1 minute to the time on this clock.
     */
    public void tick() {
        if (this.minutes == 59) {// for cases adding minutes cause hour adding
            this.minutes = 0;
            this.hours++;
            if (this.hours == 24) this.hours = 0;// for cases this clock's hour exceed 24
        }else this.minutes += 1;// for normal cases
    }


    /**
     * CW1 #7.6 -> Exercise #10.3<br/>
     * Throws an IllegalArgumentException if delta is negative,<br/>
     * and use the message "Illegal negative delta " followed by the negative number.<br/>
     * @param delta Minutes will be added to the time on this clock.
     */
    public void tock(int delta) {
        if (delta < 0) throw new IllegalArgumentException("Illegal negative delta " + delta);
        // mod by day
        delta = delta % (60*24);
        int dhour = delta/60, dmin = delta % 60;
        if (this.minutes + dmin >= 60) dhour ++;
        this.minutes = ((this.minutes + dmin) % 60 + 60) % 60;
        this.hours = ((this.hours + dhour) % 24 + 24) % 24;
    }

//    public void tock(int delta) {
//        if (delta < 0) throw new IllegalArgumentException("Illegal negative delta " + delta);
//        this.minutes += delta;
//        while (this.minutes >= 60){
//            this.minutes -= 60;
//            this.hours ++;
//        }
//        this.hours %= 24;
//
//    }


    /**
     * Exercise #10.4 Polymorphic Tick Function
     * @param clock The object on which the tick method will be called.
     */
    public static void tick(Clock clock) {
        clock.tick();
    }


    // Getters Added:

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }


    // Test client
    public static void main(String[] args) {

        // Testing Exercise #10.1
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1);

        try {
            Clock clock2 = new Clock(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }

        // Testing Exercise #10.2
        Clock clock3 = new Clock("02:30");
        System.out.println(clock3);

        try {
            Clock clock4 = new Clock("50:00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }

        // Testing Exercise #10.3
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5);

        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Exercise #10.4
        AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
        Clock.tick(clock6);  // Beep beep beep beep!

        Clock clock = new Clock("02:30");
        Clock.tick(clock);
        System.out.println(clock); // 02:31

        HalloweenClock hc = new HalloweenClock(1, 0);
        Clock.tick(hc);
        Clock.tick(hc);
        Clock.tick(hc); // Halloween!



    }

}
