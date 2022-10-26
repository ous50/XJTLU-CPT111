package com.ous50.cpt111.week6.inclass;

import com.ous50.cpt111.lib;

public class emptyStringLength {
    public static void main(String[] args) {
        // s is initialized with nothing.
        String s = "";
        int len = s.length();
        System.out.println(len);
        s = "1145141919810";
        // index number also starts from zero
        lib.println(s.charAt(0));
        //substring() method picks out a part of string using index numbers to
        //identify the desired part
        //for single string: substring(beginIndex)
        lib.println(s.substring(2));
        //for a range : substring(beginIndex,endIndex)
        lib.println(s.substring(0,4));

    }
}
