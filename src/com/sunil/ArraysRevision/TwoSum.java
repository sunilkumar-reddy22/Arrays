package com.sunil.ArraysRevision;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
       int [] result = Twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    static int [] Twosum(int [] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                }
                return  new int [] {i,j};
            }

        }
        return  new int [] {};
    }

}
