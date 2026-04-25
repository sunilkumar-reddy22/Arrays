package com.sunil.leetcode;

public class Cellsodd {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] index = {
                {1, 1},
                {0, 1}
        };
      int ans =  matrix(m, n, index);
        System.out.println(ans);
    }

    static int matrix(int m, int n, int[][] index) {
        //creating empty arrays with size of m and n.
        int[] rol = new int[m];
        int[] col = new int[n];
        // creating for loop to track the matrix.
        for (int[] indx : index) {
            rol[indx[0]]++;  // takes each from the indices and and increments with 1 and that is how  creates matrix in this method.
            col[indx[1]]++;
        }
        int count = 0;
        //check each cell;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = rol[i] + col[j];
                if (value % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}




