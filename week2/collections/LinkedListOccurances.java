package week2.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOccurances {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Laptop");
        ll.add("Speaker");
        ll.add("Mic");
        ll.add("Cable");
        ll.add("Internet");
        ll.add("Mic");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to search: ");
        String toSearch = sc.nextLine();

        int firstIndex = 0;
        int lastIndex = ll.size();
        System.out.println(lastIndex);

        boolean first = false;
        boolean last = false;

        Iterator it = ll.iterator();

        while(it.hasNext()) {
            firstIndex++;
            if(it.next().equals(toSearch)) {
                first = true;
                System.out.println("First occurance at " + firstIndex + " Position.");
                break;
            }
        }

        if(first) {
            Iterator rev = ll.descendingIterator();
            while(rev.hasNext()) {
            if(rev.next().equals(toSearch)) {
                last = true;
                System.out.println("Last occurance at " + lastIndex + " Position.");
                break;
            }
            lastIndex--;
        }
        
    } else {
            System.out.println("The element is not found.");
        }

    }
}
