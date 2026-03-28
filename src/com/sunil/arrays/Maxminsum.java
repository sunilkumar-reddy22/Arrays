package com.sunil.arrays;

public class Maxminsum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 17, 92, 2, 82};
        Maxmin(arr);
    }

    static void Maxmin(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        sum = max + min;
        System.out.println("Sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("Min = " + min);
    }
}


