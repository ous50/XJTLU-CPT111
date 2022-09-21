package com.ous50.cpt111.week9;
/**
 * CW1 Week 7
 */

public class Clock {
    private int hours;
    private int minutes;

    /** CW1 #7.1
     * Creates a clock whose initial time is h hours and m minutes.
     *
     * @param h clock's hour.
     * @param m clock's minute.
     */
    public Clock(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    /** CW1 #7.2<br/>
     * Creates a clock whose initial time is specified as a string, using the format HH:MM.
     *
     * @param s the input String with format "HH:MM".
     */
    public Clock(String s) {
       this.hours =Integer.parseInt(s.substring(0,2));
       this.minutes =Integer.parseInt(s.substring(3,5));
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
     * CW1 #7.6
     * @param delta Minutes will be added to the time on this clock.
     */
    public void tock(int delta) {
        // mod by day
        delta = delta % (60*24);
        int dhour = delta/60, dmin = delta % 60;
        if (this.minutes + dmin >= 60) dhour ++; // bug fixed
        this.minutes = ((this.minutes + dmin) % 60 + 60) % 60;
        this.hours = ((this.hours + dhour) % 24 + 24) % 24;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("02:30");

        System.out.println(clock1);
        System.out.println(clock2);

        System.out.println(clock1.isEarlierThan(clock2));

        clock1.tick();
        clock2.tock(100);

        System.out.println(clock1);
        System.out.println(clock2);

    }
}
