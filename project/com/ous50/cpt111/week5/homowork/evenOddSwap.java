package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

public class evenOddSwap {

    public static int[] evenOddSwap(int[] nums) {
        //declare the output array and clone from the input array.
        int[] outputArray = nums.clone();
        //in case of nums[] has no entry == lib.printArray(nums[]) = []
        if (nums.length == 0) return outputArray;
        boolean[] visitedArray = new boolean[nums.length];

        //do swapping
        for (int i = 0; i < nums.length - 1; i++) {
            if (visitedArray[i]) continue;
            visitedArray[i] = true;
            for (int j = i+1; j < nums.length; j++) {
                if (!visitedArray[j] && nums[j] % 2 != nums[i] % 2)  {
                    // switch
                    outputArray[i] = nums[j];
                    outputArray[j] = nums[i];
                    visitedArray[j] = true;
                    break;
                }
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        int[] nums = {};//nums[] has no entry
        lib.printArray(evenOddSwap(nums));
    }
}
