package com.sunil.ArraysRevision;

public class Arraypermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        meth(nums);
    }

    static int[] meth(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int[] ans = new int[nums];
            ans[i] = nums[nums[i]];
        }
    }

}
