class Values {
    private int a;
    public int b;
    protected int c;
    int d;

    Values (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

public class  AccessModifiers {
    public static void main(String[] args) {
        Values values = new Values(1, 2, 3, 4);
        //System.out.println(values.a);             //Error since it is private, can be accessed only inside the Values class

        System.out.println(values.b); // outputs 2
        System.out.println(values.c); // 3
        System.out.println(values.d); // 
    }
}
