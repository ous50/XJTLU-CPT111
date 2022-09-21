package com.ous50.cpt111.week12.homowork;

import com.ous50.cpt111.lib;

import java.util.*;

public class EvenAppend {


    /**
     * Given an input of a **list of strings**, write a method to build a result string as follows:<br/>
     * when a string appears the 2nd, 4th, 6th, etc. time in the list,<br/>
     * append the string to the result.<br/>
     * <br/>
     * Return the empty string if no string appears a 2nd time.<br/>
     * <br/>
     * You may use Map and HashMap.<br/>
     * The following are imported: Arrays, List, ArrayList, Map, HashMap.<br/>
     * <br/>
     * Test case 1:<br/>
     * evenAppend(["a", "b", "a"])  →  "a"
     * <br/>
     * Test case 2:<br/>
     * evenAppend(["a", "b", "b", "a", "a"])  →  "ba"
     *
     * @param list a list of words
     * @return a concatenation of even appearing words.
     */
    static String evenAppend (List<String> list ){
        String result = "";
        Map<String, Integer> resultMap = new HashMap<>();
        String targetStr;
        String s;
        int strCount;

        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);

            //for the first time we see this string
            if (!resultMap.containsKey(s))
                resultMap.put(s,1);
            // for other cases
            else {
                strCount = resultMap.get(s);
                resultMap.put(s, strCount + 1);
            }

            //Append the string if it appears in even time
            if (resultMap.get(s) != 1 && resultMap.get(s) % 2 ==0)
                result+=s;
        }


        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "b", "a"); // -> "a"
        lib.println(evenAppend(stringList));

        stringList = Arrays.asList("a", "b", "b", "a", "a"); // -> "ba"
        lib.println(evenAppend(stringList));

        stringList = Arrays.asList("a", "a", "b", "b", "a", "a"); // -> "aba"
        lib.println(evenAppend(stringList));
    }
}
