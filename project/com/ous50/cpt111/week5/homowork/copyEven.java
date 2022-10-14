package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

import java.util.DoubleSummaryStatistics;

public class copyEven {

    static int[] copyEven (int[] nums){
        int[] outcomeArray = new int[(int) Math.round((double) nums.length / 2)];
        for (int i = 0; i < nums.length ; i += 2) outcomeArray[i / 2] = nums[i];
        return outcomeArray;
    }

    //Below are the test codes
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] copyNums = copyEven(nums);
        lib.printArray(copyNums);

    }
}
