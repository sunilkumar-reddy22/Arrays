package com.sunil.leetcode;

public class MincommonNum {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
      int ans =  search(nums1, nums2);
        System.out.println(ans);
    }

    static int search(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        //Take two pointers since the array is sorted.
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++; //since the array is sorted.
            }
        }
        //if the val is not found return -1.
        return -1;
    }
}
