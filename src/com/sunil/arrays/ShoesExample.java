package com.sunil.arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoesExample {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Shoes");
        cart.add("Toy");
        cart.add("Bag");
        System.out.println("Enter iteams to search: ");
        String iteam = sc.nextLine();
        if(cart.contains(iteam)) {
            System.out.println(iteam + " is available in cart ");
        }
        else {
            System.out.println(iteam + " is not available in cart ");
        }

    }
}
