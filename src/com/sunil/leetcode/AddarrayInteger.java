package com.sunil.leetcode;
import java.util.ArrayList;
import java.util.Collections;
public class AddarrayInteger {
    public static void main(String[] args) {
        int [] num = {1,2,0,0};
        int k = 34;
        ArrayList<Integer> ans = Arrayinteger(num,k);
        System.out.println(ans);
    }
    static ArrayList<Integer> Arrayinteger(int [] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        // Initializing the num indices.
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
                i--;             // reduce the i value so that it goes left for next  operation.
            }
            //Takes the last number from the k
            result.add(k % 10);
            // remove the last number.Update the k value
            k = k / 10;
        }
        Collections.reverse(result);
        return result;
    }

}
