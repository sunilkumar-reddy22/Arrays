package com.sunil.leetcode;

public class CustomerWealth {
    public static void main(String[] args) {

            int maxWealth = 0;

            for (int[] customer : accounts) {
                int sum = 0;

                for (int money : customer) {
                    sum += money;
                }

                maxWealth = Math.max(maxWealth, sum);
            }

            return maxWealth;

    }
}
