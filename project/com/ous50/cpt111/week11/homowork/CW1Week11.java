package com.ous50.cpt111.week11.homowork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CW1Week11 {

    // Exercise #11.1
    public static int maxStretch(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        if (list.size() == 1) return 1;
        int maxStretchLength = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j)!=null
                        && list.get(j).equals( list.get(i) )
                        && maxStretchLength < j-i+1)
                    maxStretchLength = j - i + 1;
            }
        }

        return maxStretchLength;
    }


    // CW1 #11.1
    public static boolean isPartitionable(List<Integer> list) {
        if (list == null || list.size() <= 1) return false;

        int leftSum = list.get(0);
        int rightSum = 0;

        for (int i = 1; i < list.size(); i++) {
            rightSum += list.get(i);
        }

        if (leftSum == rightSum) return true;

        for (int i = 1; i < list.size() - 1; i++) {
            leftSum += list.get(i);
            rightSum -= list.get(i);
            if (leftSum == rightSum) return true;
        }

        return false;
    }


    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(8, 5, 1, 2, 5, 3, 4, 5, 10);
        System.out.println(maxStretch(list1));                // 7

        List<Integer> list2 = Arrays.asList(2, 7, 1, 2, 3, 7);
        System.out.println(maxStretch(list2));                // 5

        System.out.println(maxStretch(Arrays.asList(1,0,4,5,7,8,96,6))); //1

        System.out.println(maxStretch(Arrays.asList())); //0

        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_1));          // true

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));          // false

        // add your own test case here:





    }

}
