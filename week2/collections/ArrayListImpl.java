package week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListImpl {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(26);
        arr.add(24);
        arr.add(23);
        arr.add(0, 12);
        System.out.println("The current size is: " + arr.size());
        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        arr.addAll(Arrays.asList(24, 32, 12, -11));
        System.out.println("Array updated, current size: " + arr.size());
        for(Integer i : arr) {
            System.out.println(i + " ");
        }

        arr.remove(0);
        arr.remove((Integer)24);
        System.out.println("After Removal, size: " + arr.size());


        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }

        Collections.sort(arr);
        System.out.println("After sorting");
        for(Integer i : arr) {
            System.out.println(i + " ");
        }
    }

}
