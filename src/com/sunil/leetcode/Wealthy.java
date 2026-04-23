package com.sunil.leetcode;
import java.util.Arrays;
public class Wealthy {
    public static void main(String[] args) {
        int [] [] accounts = {
                {1,2,3},
                {3,2,1}
        };
      int ans = check(accounts);
        System.out.println(ans);

    }
    static int check(int [] [] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++ ) {
            int wealth = 0;
            for (int j = 0; j< accounts[i].length;  j++){
                wealth = wealth + accounts[i][j];
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
