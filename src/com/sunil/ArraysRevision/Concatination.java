package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Concatination {
    public static void main(String[] args) {
     int [] nums = {1,2,1};
     int n = 3;
        System.out.println(Arrays.toString(add(nums,n)));
    }
    static int [] add(int [] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];// index starts from here 3 we are using nums.lenght + i in index it stores from there
        }
        return ans;
    }
}



