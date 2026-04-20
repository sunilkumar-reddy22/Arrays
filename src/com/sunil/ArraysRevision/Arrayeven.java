package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Arrayeven {
    public static void main(String[] args) {
        int [] nums = {555,342,554,7654};
      int ans =  Even(nums);
        System.out.println(ans);
    }
    static int Even(int [] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count++;
    }

}
