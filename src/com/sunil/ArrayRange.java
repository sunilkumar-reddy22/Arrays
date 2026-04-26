package com.sunil;

public class ArrayRange {
    public static void main(String[] args) {
        int [] arr = {12,9,-6,4,16};
        int target = 4;
       int ans = search(arr,target,1,3);
        System.out.println(ans);
    }
    static int search(int [] arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (target == element) {
                return index;
            }
        }
        return -1;
    }
}
