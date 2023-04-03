package week2.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIterateLL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("AC");
        ll.add("TV");
        ll.add("Bed");
        ll.add("Chair");
        ll.add("Laptop");

        System.out.println("Original List: " + ll);
        Iterator it = ll.descendingIterator();

        System.out.println("List in reverse: ");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }    
}
