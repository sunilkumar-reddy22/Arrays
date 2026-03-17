package com.sunil.arrays;
import java.util.Scanner;
public class basicArray {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      //  System.out.println("enter number");

        int arr[] = new int [5];
        arr[3] = 20;
        System.out.println(arr[3]);
        System.out.println("enter numbers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }
     //   System.out.println(arr[i]);

    }
}
