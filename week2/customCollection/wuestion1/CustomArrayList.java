package week2.customCollection.wuestion1;

import java.util.ArrayList;

public class CustomArrayList {

    public static void printArrayList(ArrayList<Dog> dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog.getBreed());
        }
    }
    

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog0 = new Dog("Hound");
        dogs.add(0, dog0);

        Dog temp;

        for (int i = 1; i < 10; i++) {
            temp = new Dog("dog " + i);
            dogs.add(temp);
        }

        printArrayList(dogs);

        dogs.remove(2);
        System.out.println("After removing value at second index");
        printArrayList(dogs);  
        
        dogs.remove(dog0);
        System.out.println("After removing the object dog0");
        printArrayList(dogs);    

        System.out.println(dogs.get(0).getBreed().equals("dog1"));

        // dogs.removeIf(n -> (n.getBreed().equals("dog1")));
        // System.out.println("After using removeIf method to remove dog1");
        // printArrayList(dogs); 
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

    // @Override
    // public boolean equals(Object o) {
    //     if(o == this) {
    //         return true;
    //     } 
        
    //     // if(!(o instanceof Dog)){
    //     //     return false;
    //     // }

    //     // Dog d = (Dog) o;

    //     return this.getBreed() == o;
    // }
}
