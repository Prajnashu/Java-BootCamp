package week2.collections;

import java.util.*;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = Map.of("a", 10, "c", 13, "b", 21, "e", 54, "d", 34);
        Map<String, Integer> sortedTreeMap = new TreeMap<>(unsortedMap);
        System.out.println(sortedTreeMap);
    }
}
