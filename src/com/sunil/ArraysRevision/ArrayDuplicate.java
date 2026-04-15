package com.sunil.ArraysRevision;
import java.util.Arrays;
public class ArrayDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
       int ans =  Unique(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }
    static  int Unique(int [] nums) {
        int k = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
                k++;
                nums[k] = nums[j];
            }
        }
        return  k + 1;
    }

}
