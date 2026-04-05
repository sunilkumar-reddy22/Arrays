package com.sunil.arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Listexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num: ");
        ArrayList<Integer> list = new ArrayList<>();
        //  for(int i = 10; i>0; i--){
        //  System.out.print(i + "  ");

        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

    }
}

