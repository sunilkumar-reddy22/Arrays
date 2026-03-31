package com.sunil.leetcode;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(index(arr)));  // we need to satisfy the given array have to add [0,1] indices and that should prove target = 9;
                     //  and return those indices; this is brute method.
    }
    static int [] index(int [] nums){
        int target = 9;
        for(int i = 0; i< nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                     return new int[]{i, j};
                }
            }
        }
        return  new int [] {};
    }
}
