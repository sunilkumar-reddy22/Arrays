package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Sets {
    public static void main(String[] args) {
        int[] nums = {0, 3, 5, 2, 1, 4};
       int [] result = Sets(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] Sets(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
