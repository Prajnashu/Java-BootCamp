package week2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImpl {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(26);
        arr.add(24);
        arr.add(23);
        arr.add(0, 12);


        for(Integer i : arr) {
            System.out.println(i + " ");
        }

        arr.remove((Integer)24);
        System.out.println("After Removal");


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
