package week4.Java8.q5;

import java.util.ArrayList;
import java.util.Comparator;
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
        Optional<Integer> result = str.max(Comparator.naturalOrder());
        if(result.isPresent()) 
            System.out.println(result.get());
        else
            System.out.println("The list is empty");
    }
}
