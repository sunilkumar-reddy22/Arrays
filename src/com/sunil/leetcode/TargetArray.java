package com.sunil.leetcode;
import java.util.Arrays;
public class TargetArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1,};
       int [] result =  change(nums,index);
        System.out.println(Arrays.toString(result));
    }
    static int [] change(int [] nums , int [] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = index[i];
            target = new int[]{nums[i]};
        }
        return target;
    }

}
