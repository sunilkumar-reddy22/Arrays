package com.sunil.leetcode;
import java.util.Arrays;
public class CountSmallNums {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
      int [] ans =   counts(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] counts(int [] nums) {
        int [] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count[i]++;
                }
            }
        }
        return count;
    }

}
