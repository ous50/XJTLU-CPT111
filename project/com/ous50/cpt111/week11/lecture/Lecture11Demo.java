package com.ous50.cpt111.week11.lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Erick.Purwanto
 */
public class Lecture11Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        File file = new File("data/text1.txt");
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.length());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.getAbsolutePath());

//        File newFile = new File("data/text2.txt");
//        if (newFile.exists()) {
//            System.out.println("File already exists!");
//            System.exit(0);
//        }
//
//        try {
//            PrintWriter output = new PrintWriter(newFile);
//        } catch (IOException ioe fnfe) {
//            System.out.println(ioe.getMessage());
//        }


//        File file = new File("data/text1.txt");
//
//        try {
//            PrintWriter output = new PrintWriter(file);
//            output.println("Tanjiro");
//            output.println("Zenitsu");
//            output.println("Inosuke");
//            output.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

//        File file = new File("data/text1.txt");
//        try {
//            Scanner input = new Scanner(file);
//
//            while (input.hasNextLine()) {
//                String name = input.nextLine();
//                Swordsman swordsman = new Swordsman(name);
//                System.out.println(swordsman);
//            }
//
//            input.close();
//
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

//        File file = new File("data/demonslayerdata.csv");
//        try {
//            Scanner input = new Scanner(file);
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                String[] values = line.split(",");
//                String name = values[0];
//                int numDemonsKilled = Integer.parseInt(values[1]);
//                Swordsman swordsman = new Swordsman(name, numDemonsKilled);
//                System.out.println(swordsman);
//            }
//            input.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

//        try {
//            FileWriter file = new FileWriter("data/text1.txt");
//            BufferedWriter buffer = new BufferedWriter(file);
//            buffer.write("Tanjiro");
//            buffer.newLine();
//            buffer.write("Zenitsu");
//            buffer.newLine();
//            buffer.write("Inosuke");
//            buffer.newLine();
//            buffer.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

        File file = new File("data/text1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }

}
