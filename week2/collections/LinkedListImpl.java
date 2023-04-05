package week2.collections;

import java.util.Scanner;

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

  Node addNode(Node head, int value) {
    Node temp = head;
    if(head == null) {
      temp = new Node(value);
      return temp;
    }
    while(head.next == null) {
      head = head.next;
    }

    Node n = new Node(value);
    head.next = n;
    return temp;
  }

}