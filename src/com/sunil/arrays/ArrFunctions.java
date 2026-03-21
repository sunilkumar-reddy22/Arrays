package com.sunil.arrays;
import java.util.Arrays;
public class ArrFunctions {
    public static void main(String[] args) {
        int [] nums = { 2, 5, 6, 7, 8};
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr ) {
         arr[0] = 20;
    }
}
