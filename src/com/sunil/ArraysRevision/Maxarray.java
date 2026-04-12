package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Maxarray {
    public static void main(String[] args) {
        int [] arr = {4,5,1,8,6};
        Findmax(arr);
    }
    static void Findmax(int [] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
