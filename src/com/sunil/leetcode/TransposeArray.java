package com.sunil.leetcode;
import java.util.Arrays;
public class TransposeArray {
    public static void main(String[] args) {
        //creating 2d array for array transpose.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       int [][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));  //deepToString for 2d arrays while printing the result.

    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;      //we need length of matrix that we initialized.
        int col = matrix[0].length;
        int[][] result = new int[3][3];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}


