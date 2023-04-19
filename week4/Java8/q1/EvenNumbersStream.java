package week4.Java8.q1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions.
public class EvenNumbersStream {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<=100; i++)
            arr.add(i);
        //arr.forEach(System.out::println);
        Stream<Integer> str = arr.stream();
        System.out.println(str.filter(i ->  i%2 == 0).collect(Collectors.toList()));
    }   
}
