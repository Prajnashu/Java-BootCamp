package day2;


//Immutable class is one way to create immutable objects in java. Immutable class has all it's fields to final and not providing any setters for modification. 

public class ImmutableClass {

    public static void main(String[] args) {
        Dog d = new Dog("German Shepherds", 6);
        System.out.println("The dog's breed is: " + d.getBreed());
        System.out.println("The dog is " + d.getAge() + "Years old.");

        //Can't change d.breed even if the variable has public access modifier.
        //d.breed = "Chihuahua";
    }
    
}

final class Dog {
    private final String breed;
    private final int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }
}
