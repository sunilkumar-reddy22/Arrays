package com.sunil.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {10,24,85,35,77};
        Secondlargest(arr);
    }
    static void Secondlargest(int [] arr){
        int max = 0;
        int secondmax = 0;
        for(int i = 0; i <arr.length; i++) {
            int nums = arr[i];
            if (nums > max) {
                secondmax = max;
                max = nums;
            }
            else if(nums > secondmax && nums != max) {
                secondmax = nums;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Secondmax = " + secondmax);

    }

}
