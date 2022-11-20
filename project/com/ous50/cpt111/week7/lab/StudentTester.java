package com.ous50.cpt111.week7.lab;

import com.ous50.cpt111.lib;

public class StudentTester {


    public static Student[] creatStuArray() {
        //declare variables
        String name, id;
        int stuNum, chnScore, mthScore, engScore;

        //get student number
        lib.print("Input the number of students: ");
        stuNum = lib.readInt();

        //for cases user input numbers less than 0
        if (stuNum < 0) {
            lib.println("Student number invalid.");
            return null;
        }


        Student stuArray[] = new Student[stuNum];

        if (stuNum == 0) lib.println("There are no students in the array!");//optimization for cases of no student.
        else {

            for (int i = 0; i < stuNum; i++) {
                lib.print("Input student name: ");
                name = lib.readLine();
                lib.print("Input student id: ");
                id = lib.readLine();
                lib.print("Input student Chinese score: ");
                chnScore = lib.readInt();
                lib.print("Input student Math score: ");
                mthScore = lib.readInt();
                lib.print("Input student English score: ");
                engScore = lib.readInt();

                stuArray[i] = new Student(name, id, chnScore, mthScore,engScore);

            }
            lib.printf("There are %d students in the array! \n", Student.studentAmount);
        }

        return stuArray;
    }


    public static Student getBestStudent(Student[] stuArray) {
        if (stuArray == null || stuArray.length == 0) return null;

        int bestStudentIndex = 0; // default assume first student is best

        for (int i = 1; i < stuArray.length; i++)
            if (stuArray[bestStudentIndex].getTotalScore() < stuArray[i].getTotalScore())
                bestStudentIndex = i;


        return stuArray[bestStudentIndex];
    }

    public static Student getBestStudent2(Student[] stuArray) {
        if (stuArray == null || stuArray.length == 0) return null;

        Student bestStudent = stuArray[0];
        for (int i = 1; i < stuArray.length; i++)
            if (bestStudent.getTotalScore() < stuArray[i].getTotalScore())
                bestStudent = stuArray[i];


        return bestStudent;
    }



    public static void main(String[] args) {
        Student[] stuArray;
        stuArray = creatStuArray();

    }
}
