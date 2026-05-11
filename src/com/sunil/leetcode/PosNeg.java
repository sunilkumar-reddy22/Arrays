package com.sunil.leetcode;

public class PosNeg {
    public static void main(String[] args) {
        int[] nums = {-1, -3, -4, 1, 2, 3};
      int ans =  search(nums);
        System.out.println(ans);
    }

    static int search(int[] nums) {
        int pos = 0;
        int neg = 0;
        //for each loop.checking how many postive and negitavie nums are available.
        for (int num : nums) {
            if (nums[pos] > 0) {
                pos++;
            } else if (nums[neg] < 0) {
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}
