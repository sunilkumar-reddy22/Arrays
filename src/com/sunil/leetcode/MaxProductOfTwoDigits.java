package com.sunil.leetcode;

public class MaxProductOfTwoDigits {
    public static void main(String[] args) {
         int n  = 22;
        int ans = Find(n);
        System.out.println(ans);
    }
    static int Find(int n){
        int largest = 0;
        int secondLargest = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }

            n /= 10;
        }

        return largest * secondLargest;
    }
}
