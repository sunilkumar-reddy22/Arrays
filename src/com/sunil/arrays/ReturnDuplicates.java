package com.sunil.arrays;
//287
import java.util.HashSet;
public class ReturnDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
      int ans =  search(nums);
        System.out.println(ans);
    }

    static int search(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
