package com.sunil.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arr = new String[5];
        for(int i = 0; i< arr.length; i++) {
            arr[i] = in.next();
        }
     //  for(int i = 0; i< arr.length; i++) {
       ///     System.out.println(Arrays.toString((arr[i])));

        System.out.println(Arrays.toString((arr)));

    }
}
