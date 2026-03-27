package com.sunil.arrays;

public class SumofArr {
    public static void main(String[] args) {
        int[] arr = {2, 14, 15, 18, 16};
       // System.out.println( Sum(arr));
       int ans = Sum(arr);
        System.out.println("Sum is =  " + ans);
    }
    public static int Sum(int [] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result;
    }
}
