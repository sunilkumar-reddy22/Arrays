package com.sunil.ArraysRevision;
import java.util.HashMap;
import java.util.Arrays;
public class TwoSumhashmap {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
      int [] result =   sum(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] sum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int prove = target - arr[i];
            if (map.containsKey(prove)) {
                return new int[]{map.get(prove), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}


