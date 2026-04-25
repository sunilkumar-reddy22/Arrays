package com.sunil.leetcode;
public class sumDiagonal {
    public static void main(String[] args) {
        int [] [] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
       int ans = matrix(mat);    // we are returning the Integer not the array.
        System.out.println(ans);
    }
    static int matrix(int [] [] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            if (i!= n-1-i) {  // not adding the same element.
                sum = sum + mat[i][n - 1 - i];
            }
        }
        return sum;
    }

}
