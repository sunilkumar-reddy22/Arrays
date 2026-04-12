package com.sunil.ArraysRevision;
import java.util.Arrays;
public class GreaterNums {
    public static void main(String[] args) {
        int[] nums = {20, 74, 86, 92, 50, 60};
        great(nums);
    }

    static void great(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 50) {
                count++;
              //  int result = nums[i]; //no suitable method found for tostring(int0
              //  System.out.println(Arrays.toString(i));
                System.out.println(nums[i]);
            }
            if (count == 0) {
                System.out.println("Not found values");
            }
        }
        System.out.println("count is " + count);
    }
}


