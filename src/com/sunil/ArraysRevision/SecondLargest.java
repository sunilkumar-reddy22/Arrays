package com.sunil.ArraysRevision;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {2, 6, 3, 8};
        seclargest(nums);
    }

    static void seclargest(int[] nums) {
        int max = nums[0];
        int secondlargest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondlargest = max;
                max = nums[i];
            } else if (nums[i] > max && nums[i] != max) {
                secondlargest = nums[i];
            }
        }
        System.out.println(secondlargest);
    }
}
