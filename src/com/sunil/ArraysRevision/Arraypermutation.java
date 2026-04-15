package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Arraypermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(math(nums)));

    }

    static int[] math(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
          //  int[] ans = new int[nums];
            ans[i] = nums[nums[i]];
        }
      return ans;
    }


}
