package com.sunil.arrays;
import java.util.ArrayList;

public class ArrayListExample  {
    public static void main(String[] args) {
        //syntax for arraylist
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);  // list.contains(); is an fucntion the checks the specific value that exits or not if it is or not gives true/false.
        System.out.println(list);
        //functions
        //list is reference varible and the . is  accessing the functions to list inside values so it does the operations.
        list.set(0,4);
        // To remove a value from the variale you can use function call .remoe/pass the valuse in (2); and it removes and get updated.
        list.remove(2);
        System.out.println(list);

    }

}
