package com.sunil.ArraysRevision;
import java.util.Arrays;
public class Shufflearray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(Shuffle(nums,n)));
    }
    static int [] Shuffle(int [] nums,int n) {
        int[] ans = new int[2 * 3];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        return ans;
    }
}
