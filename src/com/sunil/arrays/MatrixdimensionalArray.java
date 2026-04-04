package com.sunil.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixdimensionalArray {
    public static void main(String[] args) {
        System.out.println("Enter Nums: ");
        Scanner in = new Scanner(System.in);
        int [] [] arr = new int [3] [3];
            Matrix(arr,in);
        }
       static  void Matrix (int [] [] nums,Scanner in){
        for(int row = 0; row <nums.length; row++) {
            for (int col = 0; col <nums [row].length; col++) {
                nums  [row][col] = in.nextInt();
            }
        }
      //  for (int row = 0; row <nums.length; row++) {
         //   for (int col = 0; col < nums[row].length; col++) {
               // System.out.print(nums[row][col] + " ");

          //  System.out.println();

        for(int row = 0; row <nums.length; row++){
            System.out.println(Arrays.toString(nums[row]));
        }
     }
}
