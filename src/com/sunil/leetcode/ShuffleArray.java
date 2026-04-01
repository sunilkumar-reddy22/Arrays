package com.sunil.leetcode;
import java.util.Arrays;
public class ShuffleArray {
    public static void main(String[] args) {
     int [] nums = {2,5,1,3,4,7};
     int n = 3;
     Shuffle(nums,n);
        System.out.println(Arrays.toString(Shuffle(nums,n)));
    }
    static int [] Shuffle(int [] nums, int n){
    int [] result = new int [ 2 * n];
    int index = 0;
    for(int i = 0; i < n; i++) {
        result[index++] = nums[i];
        result[index++] = nums[i + n];
    }
    return result;
    }
}
