package day2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
   
}

class Animals {
    public Animals() {
        System.out.println("Animals called");
    }
}

class Dog extends Animals {
    public Dog() {
        super();
        System.out.println("Dog called");
    }
}

