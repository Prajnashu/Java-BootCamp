package week4.Java8.custom.q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

//Given a list of integers, find the maximum value element present in it using Stream functions?
public class MaxFromListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i =0; i<10; i++) {
            list.add(rand.nextInt(30));
        }
        System.out.println(list);

        Stream<Integer> str = list.stream();
        System.out.print("Max value from the list is: ");
        Optional<Integer> result = str.max((i1, i2) -> i1.compareTo(i2));
        //using the orElse method to get the max value or the least integer value.
        System.out.println(result.orElse(Integer.MIN_VALUE));
    }
}
