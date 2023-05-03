package week5.designPatterns.creational.builder;

public class Person {
    //Required parameter
    private String firstName;
    private String lastName;
    private int age;
    //Optional parameter
    private String phoneNumber;

    private Person(PersonBuilder pb) {
        this.firstName = pb.firstName;
        this.lastName = pb.lastName;
        this.age = pb.age;
        this.phoneNumber = pb.phoneNumber;
    }

    public static class PersonBuilder {
        //Required parameter
        private String firstName;
        private String lastName;
        private int age;
        //Optional parameter
        private String phoneNumber;

        public PersonBuilder(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public PersonBuilder setPhone(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Name " + this.firstName + this.lastName + " Age: "+ this.age + " Phone no. " + this.phoneNumber;
    }
}
