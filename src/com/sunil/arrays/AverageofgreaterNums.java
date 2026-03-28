package com.sunil.arrays;

public class AverageofgreaterNums {
    public static void main(String[] args) {
        int [] arr = {10,55,60,23,88,41};
        Average(arr);
    }
    static void Average(int [] nums) {
    int sum = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
        if (nums[i] > 50 && nums[i] % 2 == 0) {
            sum = sum + nums[i];
            count++;
        }
    }
    if(count == 0) {
        System.out.println("No values found");
    }
    double average = (double) sum / count;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("count = " + count);
    }
}
