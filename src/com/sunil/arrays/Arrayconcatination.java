package com.sunil.arrays;
import java.util.Arrays;
public class Arrayconcatination {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {3,4};
        System.out.println(Arrays.toString(Add(a,b)));
    }
    static int [] Add(int [] a,int [] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

}
