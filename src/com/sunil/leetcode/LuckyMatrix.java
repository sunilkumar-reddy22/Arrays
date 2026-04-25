package com.sunil.leetcode;
import java.util.ArrayList;
public class LuckyMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
      ArrayList<Integer> ans =  lucky(matrix);
        System.out.println(ans);
    }

    static ArrayList<Integer> lucky(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean islucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    islucky = false;
                    break;
                }

                }
            if (islucky) {
                result.add(min);
            }


        }
        return result;
    }
}

