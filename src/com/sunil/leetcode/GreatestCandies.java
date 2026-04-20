package com.sunil.leetcode;
import java.util.ArrayList;
public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int kandy = 3;
        System.out.println(Bonus(candies, kandy));
    }

    static ArrayList <Boolean> Bonus(int[] candies, int kandy) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if(candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy + kandy >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
}






