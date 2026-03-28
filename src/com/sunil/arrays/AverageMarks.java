package com.sunil.arrays;
public class AverageMarks {
    public static void main(String[] args) {
        int [] marks = {70,80,92,45,65};
        nums(marks);
    }
    static void  nums(int [] sum) {
        double  result = 0;
        for (int i = 0; i < sum.length; i++) {
            result = result + sum[i];
        }
        double average =  result / sum.length;
        System.out.println("Average = " + average);
    }

}
