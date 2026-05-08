package com.sunil.leetcode;
//finding the square root of given integer via comparing sum.
public class SumofSquares {
    public static void main(String[] args) {
        int c = 5;        //a + b = c is finding sqaure
        boolean result = Find(c);
        System.out.println(result);
    }

    static boolean Find(int c) {
        int left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
                //if the sum is less than c,go left -> to right left + 1;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}