package com.sunil.leetcode;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
       boolean ans = find(nums);
        System.out.println(ans);

    }

    static boolean find(int[] nums) {
        int maxreach = 0; //starting from index 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxreach) {
                return false;
            }
            maxreach = Math.max(maxreach, i + nums[i]);
        }
        return true;
    }
}
