package com.ous50.cpt111.week7.lab;

import com.ous50.cpt111.lib;

public class Student {
    private String name, id;
    private double chinese, math, english;
    static int studentAmount = 0;

    public Student(String name, String id, double chinese, double math, double english) {
        this.name = name;
        this.id = id;
        this.chinese = chinese;
        this.math = math;
        this.english = english;

        Student.studentAmount += 1;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getChinese() {
        return chinese;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public static int getStudentAmount() {
        return studentAmount;
    }

    public double getTotalScore(){
        return getChinese() + getMath() + getEnglish();
    }

    public double getAverageScore(){
        return this.getTotalScore()/3.0;
    }


    public String toString() {



        return String.format("Name: %s id: %s average score: %1.14f total score: %1.1f", this.name, this.id, this.getAverageScore(), this.getTotalScore());
    }

    public static void main(String[] args) {
        Student s1 = new Student(
                "Teng",
                "1101",
                92.0,
                93.0,
                91.0);
        lib.println(s1);
    }
}
