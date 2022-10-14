# Week 3

## Exercise #3.1 What day is it?

Write a Java program that takes a date as input and prints the day of the week that date falls on.

Your program should take three integers: y (year), m (month), and d (day).
For m use 1 for January, 2 for February, and so on.
For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.

Use the following formulas:

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/whatdayisit.png" alt="What day is it" style="float: " height=200 />
$$
\begin{align}
a &= y - ( 14-m ) / 12 
\\b &= a + a/4 - a/100 + a/400
\\c &= m + 12\  \times \ ((14-m)/12)-2
\\day &= (d+b+(31 \times c)/12) \mod7 
\end{align}
$$


| Input                | Output       |
| -------------------- | ------------ |
| 2018<br />12<br />24 | It's day 1 ! |

```java
import java.util.Scanner;

public class DateToDay {
    public static void main(String[] args) 

    }
}
```



## Exercise #3.2 Polar Coordinates

Write a Java program that converts Cartesian coordinates to Polar coordinates.
Your program should take two real input numbers x and y, and print the Polar coordinates r and θ according to the formulas below.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/polarcoord.png" alt="" style="float: " height=150 />
$$
r = \sqrt{x^2+y^2}
\\ \theta = arctan\left( \frac{y}{x} \right)
$$
Note that you should use the Java method `Math.atan2(y, x)`, which can comfile:///home/ous50/Tarnhelm/app/src/main/res/layout/activity_settings.xmlpute the arctangent value of y/x in all quadrants.



**For example:**

| Input        | Result                                                  |
| ------------ | ------------------------------------------------------- |
| 3.0<br />4.0 | r = 5.0 <br />theta = 0.9272952180016122                |
| 1.0<br />1.0 | r = 1.4142135623730951 <br />theta = 0.7853981633974483 |

```java
import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args) {
        
    }
}
```





## CW1 #3.1 CMYK to RGB

There are several different formats used to represent color.
You may have known the *RGB format* that specifies the level of red (R), green (G), and blue (B) on an *integer* scale from 0 to 255.
There is another format called the *CMYK format* that specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a *real* scale from 0.0 to 1.0.



<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/cmyk-vs-rgb-diagram.png" alt="" style="float: left" height=150 />

Write a Java program that converts from CMYK format to RGB format using the following formulas:

white = 1 − black
red = 255 × white × (1 − cyan)
green = 255 × white × (1 − magenta)
blue = 255 × white × (1 − yellow)

Your program must take four `double` input numbers cyan, magenta, yellow, and black;
compute the corresponding RGB values, each *rounded to the nearest integer*;
and print the RGB values as in the test cases below:

| Input                            | Result                                     |
| -------------------------------- | ------------------------------------------ |
| 0.0<br />0.0<br />1.0<br />0.0   | red = 255 <br />green = 255 <br />blue = 0 |
| 0.0<br />1.0<br />0.75<br />0.50 | red = 128 <br />green = 0 <br />blue = 32  |

```java
import java.util.Scanner;

public class CMYKtoRGB {
    public static void main(String[] args) {
        
    }
}
```



## CW1 #3.2 Great Circle Distance

The *great-circle distance* is the length of the shortest path between two points (x1,y1) and (x2,y2) on the surface of a sphere. 

The formula is given below.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/greatcircledist.png" alt="" style="float: left" height=300 />

Write a Java program that takes four `double` input numbers x1, y1, x2, y2, which are the latitude and longitude in degrees of two points on the surface of the Earth;
uses the mean radius of the Earth *r = 6,371.0* kilometres;
and prints the great-circle distance *dist* between them in kilometres.

Note that the input numbers are given in degrees but Java’s trigonometric functions use radians. Use `Math.toRadians()` to convert from degrees to radians.

**For example:**

| Input                                  | Result                       |
| -------------------------------------- | ---------------------------- |
| 80.0<br />25.0<br />155.0<br />102.5   | 7509.440708014122 kilometres |
| 10.55<br />39.33<br />21.47<br />-7.88 | 5169.256612492542 kilometres |



