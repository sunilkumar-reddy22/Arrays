package com.sunil.leetcode;
import java.util.Arrays;
public class sumUptozero {
    public static void main(String[] args) {
        int n  = 5;
       int [] result =  Unique(n);
        System.out.println(Arrays.toString(result));
    }
    static int [] Unique(int n) {
        int index = 0;
        int[] nums = new int[n];
        if (n % 2 == 1) {
            nums[index++] = 0;
        }
        for (int i = 1; i < n / 2; i++) {   //mistake i added 0 for the loop i should start from the 1 cause i am using 2 index++.
            nums[index++] = i;
            nums[index++] = -i;
        }
        return nums;
    }
}
