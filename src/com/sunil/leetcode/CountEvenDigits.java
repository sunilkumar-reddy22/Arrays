package com.sunil.leetcode;

public class CountEvenDigits{
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
      int result =  Even(nums);
        System.out.println(result);
    }
    static int Even(int [] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num = num / 10;   // It removes  the last digit and updates in the num again it divides until it proves wrong.
                digits++;
            }
            if (digits % 2 == 0) {   // It divides for even numbers,if it proves even number it counts.
                count++;
            }
        }
        return count;
    }

}
