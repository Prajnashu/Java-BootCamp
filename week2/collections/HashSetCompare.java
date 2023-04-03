package week2.collections;

import java.util.*;

public class HashSetCompare {

    public static void main(String[] args) {
        HashSet<String> setOne = new HashSet<>();
        setOne.add("Blue");
        setOne.add("Black");
        setOne.add("Pink");
        setOne.add("White");
        
        HashSet<String> setTwo = new HashSet<>();
        setTwo.add("Blue");
        setTwo.add("Black");
        setTwo.add("Pink");
        setTwo.add("Orange");
        setTwo.add("White");

        boolean areSame = true;
        for (String str : setOne) {
            if(!setTwo.contains(str)) {
                areSame = false;
            }
        }

        if(areSame) {
            System.out.println("Set are same");
        } else {
            System.out.println("Set two doesn't contain all elements of set 1.");
        }
    }
}
