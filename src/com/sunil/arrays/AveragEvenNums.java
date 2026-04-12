package com.sunil.arrays;

public class AveragEvenNums {
    public static void main(String[] args) {
    int [] arr = {10,55,60,23,88,41};
    Findeven(arr);
    }
    static void Findeven(int [] nums){
    int sum = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {
            sum = sum + nums[i];
            count++;
        }
    }
    if(count == 0) {
        System.out.println("no even number found");
        return;
    }
   double average =  sum / count;
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
