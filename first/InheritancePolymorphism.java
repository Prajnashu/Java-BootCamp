class A {

    public void multiply (int a, int b) {
        System.out.println(a * b);
    }

    public void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public void value() {
        System.out.println("Printing it from base class");
    }
}


class B extends A {
    @Override
    public void value () {
        System.out.println("Printing it from child class");
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        B b = new B();

        //method overloading
        b.multiply(1, 2);  
        b.multiply(1,2,3); 

        //mehod Overriding
        b.value();
    }
}
