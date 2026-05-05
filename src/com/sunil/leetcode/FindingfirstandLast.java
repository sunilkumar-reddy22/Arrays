package com.sunil.leetcode;
import java.util.Arrays;
public class FindingfirstandLast {
    public static  void main(String[] args) {
        int [] nums = {5,7,7,8,8,9};
        int target = 8;
      int first =  Findfirst(nums,target);
      int last =  Findlast(nums,target);
      int [] result = {first,last};
        System.out.println(Arrays.toString(result));
      //  System.out.println(first + " " + last);
    }
  private   static int Findfirst(int [] nums, int target) {
        //left start from 0.
        int left = 0;
        //Right is size of array indices.
        int right = nums.length - 1;
        //if not found the target ans = -1;
        int ans = -1;
        while (left <= right) {
            //Find mid val.
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;  //storing the val.
                right = mid - 1;   //checking the left of side the array for possibilities of finding another.
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;     //if the mid is > target go right to left.
            }
        }
        return ans;
    }
    //finding last digit.
  private  static int Findlast(int [] nums, int target) {
        int left = 0;
        int right = nums.length;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }


}
