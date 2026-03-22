package com.sunil.leetcode;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int val = 3;
        change(arr,val);
        System.out.println(Arrays.toString((arr)));
    }
    static int change(int [] nums,int val){
    int k = 0;
    for(int i = 0; i <nums.length; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
    }
}
