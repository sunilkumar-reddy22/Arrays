package com.sunil.arrays;
import java.util.Arrays;
public class MaxArray {
    public static void main(String[] args) {
        int [] arr = { 2,4,7,8,9,3};
        int max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
      //System.out.println(Arrays.toString((max)));
        System.out.println(max);
    }

}
