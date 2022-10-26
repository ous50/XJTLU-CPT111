package com.ous50.cpt111.week7.homowork;

public class ColorHSB {
    /**
     * Exercise Week #7
     */

    private int hue;
    private int saturation;
    private int brightness;

    // Exercise #7.1
    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {



    }

    // Exercise #7.2
    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {



    }

    // Exercise #7.3
    // Is this color in grayscale?
    public boolean isGrayscale() {



    }

    // Exercise #7.4
    // Returns the squared distance between two colors.
    //     min{ (h1−h2)^2, (360−|h1−h2|)^2 } + (s1−s2)^2 + (b1−b2)^2
    public int squareDist(ColorHSB that) {



    }

    public static void main(String[] args) {
        ColorHSB green = new ColorHSB(100, 100, 50);
        // ColorHSB orange = new ColorHSB(25, 100, 100);
        // ColorHSB gray = new ColorHSB(0, 0, 50);

//        System.out.println(green);
        System.out.println((int) Math.pow(1.14, 5.14));
        // System.out.println(orange.isGrayscale());
        // System.out.println(gray.isGrayscale());

        // int distGreenOrange = green.squareDist(orange);
        // System.out.println(distGreenOrange);
        // System.out.println(gray.squareDist(orange));
    }

}
