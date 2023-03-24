package day2;

//static keyword is used to create class level functionality that can be accessed without having to create an instance of a class.
//4 important use of static keyword in java: 1. Static variables, 2. Static methods, 3. Static blocks, 4. Static classes


public class StaticImplASDE {
    public static String role; //static variable: Shared by all objects, there is only one copy in the memory.

    //static block used to initialize the static variable. It is executed when the class is loaded into memory.
    static {
        role = "ASDE";
    }

    public static void changeRoleName(String newName) {
        role = newName; //Note. Static methods can't use this and super keywords bcz this & super are used on instances.
    }
    

    public static void main(String[] args) {
        StaticImplASDE sa = new StaticImplASDE();
        System.out.println("Initial role " + StaticImplASDE.role);    //the static variable role is accessed via class name.
        //System.out.println(sa.role); //VSCode shows the recommendation that it should be accessed via class not by object.

        StaticImplASDE.changeRoleName("Some Fancy Role");
        System.out.println("Role After using changeRole method " + StaticImplASDE.role);

        //Accessing the nested static class
        StaticImplASDE.Nested.location();
    }

    //nested Static class
    static class Nested {
        public static void location() {
            System.out.println("Inside Nested class");
        }
    }
}