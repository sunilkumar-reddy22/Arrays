package com.sunil.leetcode;
import java.util.Arrays;
public class GoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
       int ans =  Pairs(nums);
        System.out.println(ans);

    }
   static int Pairs(int [] nums) {
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {    // j checks after current  index value of i.
               if (nums[i] == nums[j]) {
                   count++;
               }
           }
       }
       return count++;
   }

}
