package com.sunil.leetcode;
import java.util.Arrays;
public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
       int [] ans = plus(digits);
        System.out.println(Arrays.toString(ans));
    }
    static int [] plus(int [] digits){
    //adding from right to left.
     for(int i = digits.length -1; i>=0; i--) {
         if (digits[i] < 9) {  //9 is edge case.
             digits[i]++;
             return digits;
         }
         digits[i] = 0;
     }
     int [] result = new int [digits.length +1];
     result[0] = 1;
     return result;
    }
}
