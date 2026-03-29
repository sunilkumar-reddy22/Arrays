package com.sunil.leetcode;
import java.util.Arrays;
public class Removeduplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
      int result =  remove(nums);
        System.out.println(result);
        System.out.println(Arrays.toString((nums)));
    }

    static int remove(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
