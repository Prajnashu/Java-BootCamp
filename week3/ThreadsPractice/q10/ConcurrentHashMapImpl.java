package week3.ThreadsPractice.q10;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        int value = map.get("two");
        System.out.println(value); // prints 2

        map.remove("three");
        System.out.println(map); // prints {one=1, two=2}

    }
}
