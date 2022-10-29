package com.ous50.cpt111.week7.lab;

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
        return (getChinese() + getMath() + getEnglish())/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", total score = " + getTotalScore() +
                ", average score = " + getAverageScore() +
                '}';
    }
}
