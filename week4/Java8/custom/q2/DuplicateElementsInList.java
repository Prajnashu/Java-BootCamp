package week4.Java8.custom.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElementsInList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<15; i++) {
            Random rand = new Random();
            arr.add(rand.nextInt(20));
        }
        System.out.println("The list is: " + arr);

        Stream<Integer> str = arr.stream();
        System.out.print("The duplicate elements are: ");
        System.out.println(str.filter(i -> DuplicateElementsInList.frequencyPredicate(arr, i))
                            .distinct()
                            .collect(Collectors.toList()));
    }
    public static boolean frequencyPredicate(ArrayList<Integer> arr, Integer i) {
        return Collections.frequency(arr, i) > 1;
    }
}
