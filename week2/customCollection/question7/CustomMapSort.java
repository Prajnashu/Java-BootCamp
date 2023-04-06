package week2.customCollection.question7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomMapSort {
    public static void main(String[] args) {
        Map<Dog, Integer> tm = new TreeMap<>(new SortByBreed());

        Map<Dog, Integer> hm = new HashMap<>();

        tm.put(new Dog("Hound"), 8);
        tm.put(new Dog("Husky"), 9);
        tm.put(new Dog("Shepherd"), 6);
        tm.put(new Dog("Street"), 8);
        tm.put(new Dog("Dobermann"), 7);
        tm.put(new Dog("Other"), 6);
        
        System.out.println("Using Treemap(Sorted by default)");
        for (Map.Entry<Dog, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());         
        }

        hm.put(new Dog("Hound"), 8);
        hm.put(new Dog("Husky"), 9);
        hm.put(new Dog("Shepherd"), 6);
        hm.put(new Dog("Street"), 8);
        hm.put(new Dog("Dobermann"), 7);
        hm.put(new Dog("Other"), 6);
        
        
    }
    
}


class Dog {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void bark() {
        System.out.println("Woof...");
    }

    @Override
    public String toString() {
        return this.breed;
    }
}

class SortByBreed implements Comparator<Dog> {
    public int compare(Dog d1, Dog d2) {
        return d1.getBreed().compareTo(d2.getBreed());
    }
}
