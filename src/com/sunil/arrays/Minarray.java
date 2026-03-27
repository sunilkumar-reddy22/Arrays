package com.sunil.arrays;
public class Minarray {
    public static void main(String[] args) {
    int [] arr = {2,4,5,6,1};
    int min =arr[0] ;
    for(int i = 1; i<arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
        System.out.println("Min " + min);
    }
}
