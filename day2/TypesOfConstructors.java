package day2;

public class TypesOfConstructors {

    public static void main(String[] args) {
        DefaultCons dc = new DefaultCons();
        System.out.println("Default constructor");
        System.out.println(dc.getName()); //the default constructor will initialize String to null so this line will print null.
        System.out.println(dc.getNum()); //the default constructor will initialize int to 0 so this line will print 0.
        System.out.println();

        ParameterizedCons na = new ParameterizedCons();
        System.out.println("No Args Constructor");
        System.out.println(na.getName());
        System.out.println(na.getNum());
        System.out.println();

        ParameterizedCons pcChaining = new ParameterizedCons("Ron");
        System.out.println("Parameterized Constructor chaining");
        System.out.println(pcChaining.getName());
        System.out.println(pcChaining.getNum());
        System.out.println();

        ParameterizedCons pc = new ParameterizedCons(45, "Joey");
        System.out.println("Parameterized Constructor with both arguments provided");
        System.out.println(pc.getName());
        System.out.println(pc.getNum());
        System.out.println();

        ParameterizedCons cc = new ParameterizedCons(pc);
        System.out.println(cc.getName());
        System.out.println(cc.getNum());

    }
    
}

class DefaultCons {
    private int num;
    private String name;

    //No constructors provided, the compiler will provide a default constructor which will initialize the variables to default values as per it's type.

    public int getNum() {
        return this.num;
    }

    public String getName() {
        return this.name;
    }
}

class ParameterizedCons {
    private int num;
    private String name;

    public int getNum() {
        return this.num;
    }

    public String getName() {
        return this.name;
    }

    //no args constructor, similar behaviour as default cons.
    public ParameterizedCons() {

    }

    //constructor chaining
    public ParameterizedCons(String name) {
        this(23, name);
    }  
    
    public ParameterizedCons(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public ParameterizedCons(ParameterizedCons p) {
        System.out.println("Copy constructor called");
        if(p == null) {
            this.name = null;
            this.num = 0;
        } else {
            this.name = p.name;
            this.num = p.num;
        }
    }

}