package com.sunil.ArraysRevision;

public class NextLargest {
    public static void main(String[] args) {
        int [] nums = {4,7,8,5};     //max = 8, nextlargest = 7
        Find(nums);
    }
    static void Find(int [] nums) {
        int max = nums[0];
        int secondmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {     // if it is less than max it jumps to else if conditon to prove its is greter than secondmax it is rechecking and making sure
                secondmax = max;
                max = nums[i];
            } else if (nums[i] > secondmax && nums[i] != max) {               // why nums is not equal to max cause we dont have to need duplicate elements.
                secondmax = nums[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Secondmax is " + secondmax);
    }
}
