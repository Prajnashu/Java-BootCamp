package day2;

public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        String s = "Hello";
        //System.out.println(System.identityHashCode(s));
        System.out.println(s.hashCode());
        s += "world";
        //System.out.println(System.identityHashCode(s));
        System.out.println(s.hashCode());

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode());
        sb.append(" World");
        System.out.println(sb.hashCode());
        System.out.println(sb);
        sb.insert(6, "Beautiful ");
        System.out.println(sb);
        sb.replace(6, 15, "Loving");
        System.out.println(sb);
        sb.delete(6, 13);
        System.out.println(sb);
        System.out.println(sb.substring(0, 6));
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println();
        StringBuffer sf = new StringBuffer("Hi");
        System.out.println(sf.hashCode());
        sf.append(" There");
        System.out.println(sf.hashCode());
        System.out.println(sf);


    }
}
