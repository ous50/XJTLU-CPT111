package com.ous50.cpt111.week7.homowork;
/**
 * CW1 Week 7
 */

public class Clock {
    private int hours;
    private int minutes;

    // CW1 #7.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {



    }

    // CW1 #7.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {



    }

    // CW1 #7.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {




    }

    // CW1 #7.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {




    }

    // CW1 #7.5
    // Adds 1 minute to the time on this clock.
    public void tick() {




    }

    // CW1 #7.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {




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
