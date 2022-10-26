package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

/**
 * Remember that printInts() has been defined in __tester__.java.
 */

public class reverseInts {

    static void reverseInts(int[] nums){
        for (int i = 0; i < nums.length>>1; i++ ) {
            //store the original value
            int tmp = nums[i];
            //valuate from the subject
            nums[i] = nums[nums.length - 1 -i];
            //valuate to the subject
            nums[nums.length - 1 -i] = tmp;
        }
    }


    //Below are the test codes
    static void printInts(int[] nums) {
        //the beginning
        lib.print("[");
        //the body
        for (int i = 0; i < nums.length - 1 ; i++) lib.print(nums[i] + ", ");
        // the end
        lib.println(nums[nums.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        reverseInts(nums);
        printInts(nums);

    }
}
