package com.ous50.cpt111.week11.homowork;
/*
 *
 * Exercise and CW1 Week 11
 *
 * DO NOT MODIFY THIS CLASS
 *
 */

public class Clock {
    private int hours;
    private int minutes;


    public Clock(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59)
            throw new IllegalArgumentException();
        hours = h;
        minutes = m;
    }


    public Clock(String s) {
        if (s.length() != 5 || !Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(1)) ||
                s.charAt(2) != ':' || !Character.isDigit(s.charAt(3)) || !Character.isDigit(s.charAt(4)))
            throw new IllegalArgumentException();
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        if (h < 0 || h > 23 || m < 0 || m > 59)
            throw new IllegalArgumentException();
        hours = h;
        minutes = m;
    }


    public void tock(int delta) {
        if (delta < 0)
            throw new IllegalArgumentException("Illegal negative delta " + delta);
        int deltaHours = delta / 60;
        int deltaMinutes = delta % 60;
        hours = (hours + deltaHours) % 24;
        minutes += deltaMinutes;
        if (minutes >= 60) {
            hours++;
            minutes = minutes % 60;
            if (hours == 24)
                hours = 0;
        }
    }


    @Override
    public String toString() {
        String output = "";
        if (hours < 10)
            output = output + "0";
        output = output + hours + ":";
        if (minutes < 10)
            output = output + "0";
        output = output + minutes;
        return output;
    }


    public boolean isEarlierThan(Clock that) {
        if (hours < that.hours) {
            return true;
        } else if (hours > that.hours) {
            return false;
        } else return minutes < that.minutes;
    }


    public void tick() {
        minutes++;
        if (minutes == 60) {
            hours++;
            minutes = 0;
            if (hours == 24)
                hours = 0;
        }
    }


}
