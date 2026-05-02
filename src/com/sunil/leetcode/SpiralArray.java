package com.sunil.leetcode;
import java.util.List;
import java.util.ArrayList;
public class SpiralArray {
    public static void main(String[] args) {
        int [] [] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
      List<Integer> ans =  Sprial(matrix);
        System.out.println(ans);
    }
    static List<Integer> Sprial(int [] [] matrix){
        List<Integer> result = new ArrayList<>();
         int top = 0; //first row.
         int bottom = matrix[0].length -1;  //last row.
         int left = 0; // starting column.
         int right = matrix.length -1;

         while(top <= bottom && left <= right) {      //checking how many rows and columns are left.
             //first row
             for(int i = left; i <= right; i++) {
                 result.add(matrix[top][i]);  //here the last cell taking away.
             }
             top++;    //here we are shrinking the 1st row.
              //last column.
              for(int i = top; i<=bottom; i++) {
                  result.add(matrix[i][right]);
              }
              right--;  //here we are shrinking the right last column.

              // checking any rows or cols are available.
              if(top <= bottom) {
                  for (int i = right; i >= left; i--) {
                      result.add(matrix[bottom][i]);
                  }
                  bottom--; //shrink the bottom row.
              }
              //check is there any columns left.
              if(left <= right) {  //left o got right 1 col
                  for (int i = bottom; i >= top; i--) {
                      result.add(matrix[i][left]);
                  }
                  left++;
              }


         }
         return result;


    }

}
