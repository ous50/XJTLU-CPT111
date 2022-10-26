package com.ous50.cpt111.week5.homowork;

import com.ous50.cpt111.lib;

/**
 * Exercise 4.2 Copy Even Indices<br/>
 * <br/>
 * Copies elements at even indices to a new array.<br/>
 * <br/>
 * Test cases :<br/>
 * <br/>
 * <pre>
 * copyEven({1, 2, 3})    → [1, 3]
 * copyEven({1, 2, 3, 4}) → [1, 3]
 * </pre>
 *
 * param nums is the input integer array.<br/>
 * return the new array with elements at even indicies.
 */
public class copyEven {

    static int[] copyEven (int[] nums){
        int[] outcomeArray = new int[(nums.length + 1)>>1];
        for (int i = 0; i < nums.length ; i += 2) outcomeArray[i>>1] = nums[i];
        return outcomeArray;
    }

    //Below are the test codes
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] copyNums = copyEven(nums);
        lib.printArray(copyNums);
    }
}
