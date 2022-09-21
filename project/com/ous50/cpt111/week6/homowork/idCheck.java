package com.ous50.cpt111.week6.homowork;


import com.ous50.cpt111.lib;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

/**
 * Exercise #6.2 Valid ID and Check Digit<br/>
 * <br/>
 * You work for a manufacturer that makes a product
 * with a unique ID string to encode the attributes of the product.<br/>
 * The last character of the ID is a check digit which is the sum of the digits '0-9' that
 * appear in the ID, ignoring all other characters, modulo 11, using the character 'X' if the remainder is 10.<br/>
 * <br/>
 * <img src="../../../../../../homework.assets/IDNumberBarcode.jpg" alt="" style="float: left" height=50 />
 * <br/>
 * Write a Java method that takes an ID string and determines whether or not it is a valid ID number.<br/>
 * Note that an ID string is of length at least 5, uses upper or lower case letters, as well as dashes '-'.<br/>
 *<br/>
 * Note that <code>Character.isDigit(char)</code> tests if a char is one of the chars '0', '1', ..., '9'.
 * Also recall that <code>Integer.parseInt(string)</code> converts a string to an int.<br/>
 * <br/>
 * Test cases:<br/>
 * <pre>
 *      isValidID("THMBB7092WD114221") → false<br/>
 *      isValidID("A001-606X-17X") → true
 * </pre>
 */
public class idCheck {

    public static boolean isValidID(String input) {
        // exclude empty cases
        if (input == null || input.length() == 0) return false;
        // exclude cases when input has no dashes ("-") or the length of input is less than 5
        // if (!input.contains("-")) return false;
        if (input.length() < 5) return false;

        // last character must be num or X
        char lastCharacter = input.charAt(input.length() - 1);
        if (!(Character.isDigit(lastCharacter)|| lastCharacter == 'X'))
            return false;

        // not 0-9 or - 就要false
        int checkSum = 0;
        for (Character c: input.substring(0, input.length()-1).toCharArray())
            if (!(Character.isDigit(c) || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || c == '-')) return false;
            else if (Character.isDigit(c)) checkSum += Integer.parseInt(""+c);

        //"A-AA0"
        int lastCharacterInt = Character.isDigit(lastCharacter) ? Integer.parseInt(""+lastCharacter) : 10;
        return checkSum % 11 == lastCharacterInt;
    }
    public static boolean isValidID2(String id) {

        if (id.length() < 5) {
            return false;
        }
        char[] idChars = id.toUpperCase().toCharArray();
        int sum = 0;
        for (int i = 0; i < id.length()-1; i++) {
            if (Character.isDigit(id.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(id.charAt(i)));
            }
        }
        char lastId = idChars[idChars.length - 1];
        char validateId = (sum % 11 == 10 ? 'X' : (char) (sum+'0'));
        return lastId == validateId;
    }

    public static void main(String[] args) {
        lib.println(isValidID("A001606X17X"));
        lib.println(isValidID("A001-606X-17X"));
        lib.println(isValidID("a001-606x-17x"));
        lib.println(isValidID("A001-606X-16X"));
        lib.println(isValidID("A002-606X-170"));
        lib.println(isValidID("A012-606X-171"));
        lib.println(isValidID("A114-514X-191-9810"));//it's false(悲)
        lib.println(isValidID("A114-514X-191-9811"));
//        lib.println(isValidID("114-5"));
//        lib.println(isValidID("1145-1"));
//        lib.println(isValidID("1145-14"));
//        lib.println(isValidID("1145-141"));
//        lib.println(isValidID("1145-1419"));
//        lib.println(isValidID("1145-1419-1"));
//        lib.println(isValidID("1145-1419-19"));
//        lib.println(isValidID("1145-1419-198"));
//        lib.println(isValidID("1145-1419-1981"));
//        lib.println(isValidID("1145-1419-19810"));
    }
}
