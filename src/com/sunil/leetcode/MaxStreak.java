package com.sunil.leetcode;

public class MaxStreak {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1};
       int ans = find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        //we have to count the consective nums if it breaks resets zero.
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                //if it breaks reset count to zero.
                count = 0;
            }
        }
        return max;
    }
}