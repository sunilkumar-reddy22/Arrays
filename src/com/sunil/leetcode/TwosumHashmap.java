package com.sunil.leetcode;
import java.util.HashMap;
import java.util.Arrays;
public class TwosumHashmap {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
       int [] ans =  Twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] Twosum(int [] nums, int target){
       HashMap<Integer , Integer> map = new HashMap<>();
       for(int i = 0; i <nums.length; i++) {
           int prove = target - nums[i];
           // checking the value;
           if (map.containsKey(prove)) {
               return new int[]{map.get(prove), i};
           }
           map.put(nums[i], i);
       }
       return new int [] {};
    }
}
