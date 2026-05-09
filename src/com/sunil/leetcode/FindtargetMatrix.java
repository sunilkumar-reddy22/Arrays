package com.sunil.leetcode;
//brute force method
public class FindtargetMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 0;
       boolean result = Find(matrix, target);
        System.out.println(result);
    }

    //return boolean.
    static boolean Find(int[][] matrix, int target) {
    if(int [] [] matrix = 0)
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}