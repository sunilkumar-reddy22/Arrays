package com.sunil.ArraysRevision;

public class Minarray {
    public static void main(String[] args) {
        int [] arr = {4,5,1,8,6};
        Findmin(arr);
    }
    static void Findmin(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
