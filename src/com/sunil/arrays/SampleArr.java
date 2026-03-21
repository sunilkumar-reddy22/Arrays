package com.sunil.arrays;
import java.util.Scanner;
public class SampleArr {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
         arr [0] = 10;
         arr [1] = 20;
         arr [2] = 30;
         arr [3] = 40;
         arr [4] = 50;
        //Internally it is stored like this [10,20,30,40,50]
      //  System.out.println(arr[3]);
       for(int i = 0; i <arr.length; i++) {
           arr[i] = in.nextInt();
         //  System.out.println(arr[i]);

       }
       for(int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }

    }
}
