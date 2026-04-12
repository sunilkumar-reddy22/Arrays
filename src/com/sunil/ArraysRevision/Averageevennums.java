package com.sunil.ArraysRevision;

public class Averageevennums {
    public static void main(String[] args) {
        int[] nums = {6, 3, 8, 9, 2, 10};
        even(nums);
    }

    static void even(int[] nums) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result = result + nums[i];
                count++;
            }
        }
        double average = (double) result / count;
        System.out.println("Number of even numbers are = " + count);
        System.out.println("Average of even numbers " + average);
    }
}


