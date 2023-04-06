package week2.customCollection.question4;

import java.util.Scanner;

//Reverses the linkedlist in reverse order, the linkedlist is made of objects of Dog class
public class CustomReverseLinkedList {
    private static void show(Node head) {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null) {
            System.out.println(head.getDog().toString());
            return;
        }
        while(head.next != null) {
            System.out.println(head.getDog().toString());
            head = head.next;
        }
        System.out.println(head.getDog().toString());
    }

    public static void showReverse(Node head) {
        //Reverses the linkedList
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        
        //Shows the reversed linkedlist
        show(head);

        //reverses it again so that it becomes the original list
        prev = null;
        current = head;
        next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    //adds new node to the linkedlist
    private static Node add(Node head) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dog breed");
        String breed = s.nextLine();
        Dog d = new Dog(breed);
        Node permanentHead = head;
        if(head == null) {
            Node temp = new Node(d);
            return temp;
        }
        while(head.next != null) {
            head = head.next;
        }
        head.next = new Node(d);
        return permanentHead;
    }

    //deletes existing node from the linkedlist
    private static Node delete(Node head) {
        boolean found = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dog breed to delete");
        String breed = s.nextLine();
        if(head == null) {
            System.out.println("The list is empty");
            return null;
        }
        if(head.getDog().equals(breed)) {
            found = true;
            return head.next;
        }
        Node permanentHead = head;
        while(head.next != null) {
            if(head.next.getDog().equals(breed)) {
                found = true;
                head.next = head.next.next;
                return permanentHead;
            }
            head = head.next;
        }
        if(head.getDog().equals(breed)) {
            found = true;
            Node h = permanentHead;
            while(h.next.next != null) {
                h = h.next;
            }
            h.next = h.next.next;
        }
        if(!found) {
            System.out.println("The node with your entered breed value doesn't exist.");
        }
        return permanentHead;
    }

    

    public static void main(String[] args) {
        Node head = new Node(new Dog("Husky"));
        head.next = new Node(new Dog("Hound"));
        head.next.next = new Node(new Dog("Shepherd"));
        System.out.println("""
                Enter 1 to show the Linked List
                Enter 2 to add element to the linked list
                Enter 3 to remove element to the linked list
                Enter 4 to traverse the linkedList in reverse
                Enter 0 to exit
                """);
        Scanner sc = new Scanner(System.in);
        int choice = 4;
        while(choice != 0) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    show(head);
                    break;
                case 2:
                    head = add(head);
                    break;
                case 3:
                    head = delete(head);
                    break;
                case 4:
                    showReverse(head);
                    break;
                case 0: 
                    return;
                default:
                    System.out.println("Invalid choice");

            } 
        }
    }
}

class Node {
    private Dog dog;
    public Node next;

    public Node(Dog dog) {
        this.dog = dog;
        this.next = null;
    }

    public Dog getDog(){
        return this.dog;
    }
}

class Dog {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void bark() {
        System.out.println("Woof...");
    }

    @Override
    public boolean equals(Object o) {
        //if the passed breed is not string, they will not be equal, It is essential for the typecasting below
        if(!(o instanceof String))
            return false;
        String s = (String)o;
        return this.breed.compareTo(s) == 0 ? true : false;
    }

    @Override
    public String toString() {
        return this.breed;
    }
}