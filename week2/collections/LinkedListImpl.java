package week2.collections;

public class LinkedListImpl {

    Node head;
  
    static class Node {
      int value;
  
      Node next;
  
      Node(int d) {
        value = d;
        next = null;
      }
    }
  
    public static void main(String[] args) {
  
      LinkedListImpl linkedList = new LinkedListImpl();
  
      linkedList.head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
  
      linkedList.head.next = second;
      second.next = third;
  
      System.out.print("The current Linkedlist is: ");
      while (linkedList.head != null) {
        System.out.print(linkedList.head.value + " ");
        linkedList.head = linkedList.head.next;
      }
  }

}