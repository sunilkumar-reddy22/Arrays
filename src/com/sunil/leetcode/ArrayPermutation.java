package com.sunil.leetcode;
import java.util.Arrays;
public class ArrayPermutation {
    public static void main(String[] args) {
        int [] arr = {0,2,3,5,2,4};
        System.out.println(Arrays.toString(change(arr)));
    }
    static int [] change(int [] nums){
    int [] ans = new int[nums.length];
    for(int i = 0; i < nums.length; i++) {
        ans[i] = nums[nums[i]];
    }
    return ans;

    }
}
