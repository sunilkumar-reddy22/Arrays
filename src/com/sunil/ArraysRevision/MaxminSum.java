package com.sunil.ArraysRevision;

public class MaxminSum {
    public static void main(String[] args) {
        int [] arr = {4,7,1,9,10};
        Findsum(arr);
    }
    static void Findsum(int [] arr) {
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        sum = sum + max + min;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min );
        System.out.println("Sum = " + sum);
    }

}
