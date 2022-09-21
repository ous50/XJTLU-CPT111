package com.ous50.cpt111.week2.lab;

public class Lab2Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Zexi";
        String job = "student";
        String major = "DMT";
        String school = "XJTLU";
        String hometown = "Foshan";
        int age = 21;
        int stuNum = 2033349;

        System.out.println("Hello " + name);
        System.out.printf("My name is %s, and I'm a %s in %s\n", name, job, major);
        System.out.printf("My name is %s, my school is %s, and my hometown is %s\n", name, school, hometown);
        System.out.printf("Name: %s, Age: %s, Student number: %s\n", name, age, stuNum);
    }
}
