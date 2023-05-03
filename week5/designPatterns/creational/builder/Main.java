package week5.designPatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder("king", "Bob", 11).build();
        System.out.println(p.toString());
        Person q = new Person.PersonBuilder("Iron", "Man", 3000).setPhone("7682946251").build();
        System.out.println(q.toString());
    }
}
