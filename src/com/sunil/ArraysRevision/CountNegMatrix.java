package com.sunil.ArraysRevision;
import java.util.Arrays;
public class CountNegMatrix {
    public static void main(String[] args) {
       int [][] grid = {
               {3,2},
               {1,0}
       };
      int ans = nums(grid);
        System.out.println(ans);
    }
    static int nums(int [][] grid) {
        //count the negtive numbers in given arry.
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++ ) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;

    }

}
