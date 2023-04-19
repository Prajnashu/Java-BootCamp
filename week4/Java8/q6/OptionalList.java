package week4.Java8.q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
public class OptionalList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i =0; i<10; i++) {
            list.add(rand.nextInt(30));
        }

        Optional<List<Integer>> optionalList = Optional.of(list);
        optionalList.ifPresent(l -> {
            l.forEach(System.out::println);
        } 
    );
    }
}
