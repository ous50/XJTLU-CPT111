package com.ous50.cpt111.week12.homowork;

import com.ous50.cpt111.lib;

import java.util.*;

public class SameFirstLetter {

    static Map<String, String> sameFirstLetter (List<String> list) {
        Map<String, String> resultMap = new HashMap<>();
        String firstLetter;
        String stringInList;
        String outputString = "";

        //Scan the list
        for (int i = 0; i < list.size(); i++) {
            stringInList = list.get(i); // get the element
            firstLetter = stringInList.substring(0,1); // get the first letter of the element

            // If this first letter is not existed in the map
            if (!resultMap.containsKey(firstLetter))
                resultMap.put(firstLetter, stringInList);
            // If this first letter is existed in the map
            else {
                outputString = resultMap.get(firstLetter);
                outputString += "," + stringInList;
                resultMap.put(firstLetter, outputString);
            }

        }

        return resultMap;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("alice", "bob", "apple", "banana");
        Map<String, String> map = sameFirstLetter(list);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        // a: alice,apple
        // b: bob,banana

        lib.println();

        list = Arrays.asList("after", "all", "this", "time", "always");
        map = sameFirstLetter(list);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
//       a: after,all,always
//       t: this,time
    }
}
