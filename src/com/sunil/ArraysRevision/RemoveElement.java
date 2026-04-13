package com.sunil.ArraysRevision;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
      int result =  Find(arr, val);
        System.out.println(result);
        System.out.println(Arrays.toString((arr)));

    }

    static int Find(int[] arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr [k] = arr[i];
                k++;
            }

        }
        return k;
    }
}
