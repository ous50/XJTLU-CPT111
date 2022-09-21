package com.ous50.cpt111.week2.lab;

public class Lab2HelloVan {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Van";
        String job = "Artist";
        String major = "Performance♂ Artist♂";
        String school = "Deep♂ Dark♂ School♂";
        String hometown = "woooo♂";
        int age = 24;
        int stuNum = 114514;

        System.out.println("Hello " + name);
        System.out.printf("My name is %s, and I'm a %s, %s\n", name, job, major);
        System.out.printf("My name is %s, my school is %s, and my hometown is %s\n", name, school, hometown);
        System.out.printf("Name: %s, Age: %s, Student number: %s\n", name, age, stuNum);
    }
}
