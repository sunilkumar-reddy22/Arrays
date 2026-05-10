package com.sunil.leetcode;

public class profit {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,5,6,4};
      int ans =  find(prices);
        System.out.println(ans);
    }
    static int find(int [] nums){
    int min = Integer.MAX_VALUE;
    int max = 0;
    for(int price : nums) {
        if (price < min) {
            min = price;
        }
        int profit = price - min;
        if (profit > max) {
            max = profit;
        }
    }
    return max;
    }
}
