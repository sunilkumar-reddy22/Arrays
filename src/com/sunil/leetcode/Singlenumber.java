package com.sunil.leetcode;

public class Singlenumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int ans = Find(nums);
        System.out.println(ans);
    }

    static int Find(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
