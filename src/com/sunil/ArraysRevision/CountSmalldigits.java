package com.sunil.ArraysRevision;
import java.util.Arrays;
public class CountSmalldigits {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
       int [] ans =  counts(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] counts(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count[i]++;
                }
            }
        }
        return count;
    }
}

