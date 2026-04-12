package com.sunil.ArraysRevision;

public class GreatnumsEven {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 7, 46,50, 67, 89, 94};
        even(nums);
    }

    static void even(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 50 && nums[i] % 2 == 0) {
                sum = sum + nums[i];
                count++;
            }
        }
        if(count == 0) {
            System.out.println("No value found");
        }
        double average = (double) sum / count;
        System.out.println("Average =  " + average);
        System.out.println("Sum = " + sum);
        System.out.println("count = " + count);


    }

}
