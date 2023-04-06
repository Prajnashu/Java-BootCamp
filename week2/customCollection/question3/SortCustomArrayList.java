package week2.customCollection.question3;

import java.util.ArrayList;
import java.util.*;

//sorts an arraylist containing objects of custom class Dog
public class SortCustomArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dog = new ArrayList<>();
        dog.add(new Dog("Husky"));
        dog.add(new Dog("Hound"));
        dog.add(new Dog("Dobermann"));
        dog.add(new Dog("Bull Dog"));
        dog.add(new Dog("Shepherd"));
        dog.add(new Dog("Others"));

        System.out.println("Before sorting: ");

        for(Dog d : dog) {
            System.out.println(d.getBreed());
        }
    
        System.out.println();

        Collections.sort(dog, new BreedComparator());
        //Collections.sort(dog);

        System.out.println("After sorting: ");

        for(Dog d : dog) {
            System.out.println(d.getBreed());
        }
    }   
}

class Dog implements Comparable<Dog>{
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

    @Override
    public int compareTo(Dog d) {
        return this.breed.compareTo(d.getBreed());
    }
}

class BreedComparator implements Comparator<Dog> {
    public int compare(Dog d1, Dog d2) {
        return d1.getBreed().compareTo(d2.getBreed());
    }
}
