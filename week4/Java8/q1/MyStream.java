package week4.Java8.q1;

import java.util.Optional;
import java.util.stream.Stream;


public class MyStream {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbers.reduce((i, j) -> {return i*j;});
        // (result.isPresent()) ? System.out.println(result.get()) : System.out.println("No result");

        if(result.isPresent())
            System.out.println(result.get());
    }
}
