package week2.customCollection.question5;

import java.util.Scanner;

//checks the first and last occurance of a dog object in the linkedlist.
public class CustomFirstNLastOccurance {
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

    private static void firstOccurance(Node head, String breed, int mode) {
        Node permanentHead = head;
        int place = 0;
        if(head == null) {
            System.out.println("The list is empty, no matches found");
            return;
        }
        if(head.next == null) {
            if(head.getDog().getBreed().compareTo(breed)==0) {
                System.out.println("Found at index 0");
                return;
            }
        }
        while(head.next != null) {
            if(head.getDog().getBreed().compareTo(breed)==0) {
                if(mode == 0) {
                    System.out.println("Found at index " + place);
                    return;
                }
                if(mode == 1) {
                    int size = 0;
                    while(head.next != null) {
                        head = head.next;
                        size++;
                    }
                    place = size - place;
                    System.out.println("Found at index " + place);
                    return;
                }
            }
            place++;
            head = head.next;
        }
        System.out.println("Not found in the list.");
    }

    public static void lastOccurance(Node head, String breed) {
        Node permanentHead = head;
        int place = 0;
        int size = 0;
        if(head == null) {
            System.out.println("The list is empty, no matches found");
            return;
        }
        if(head.next == null) {
            if(head.getDog().getBreed().compareTo(breed)==0) {
                System.out.println("Found at index 0");
                return;
            }
        }
        //loop over the list to find it's length
        // while(head.next != null) {
        //     head = head.next;
        //     size++;
        // }
        // head = permanentHead;

        //reverse the list to check from end
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

        firstOccurance(head, breed, 1);

        // while(head.next != null) {
        //     if(head.getDog().getBreed().compareTo(breed)==0) {
        //         place = size - place;
        //         System.out.println("Found at index " + place);
        //         return;
        //     }
        //     place++;
        //     head = head.next;
        // }

        // head = permanentHead;

        //reverse the list again
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

        //reverses it again so that it becomes the original linkedlist.
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

    public static void main(String[] args) {
        Node head = new Node(new Dog("Husky"));
        head.next = new Node(new Dog("Hound"));
        head.next.next = new Node(new Dog("Shepherd"));
        head.next.next.next = new Node(new Dog("Husky"));
        head.next.next.next.next = new Node(new Dog("Shepherd"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dog breed to search");
        String b = sc.nextLine();
        System.out.println("""
                Enter 1 to show the linkedList
                Enter 2 to get the first occurance in Linked List
                Enter 3 to get the last occurance in the linked list
                Enter 0 to exit
                """);
        int choice = 4;
        while(choice != 0) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    show(head);
                    break;
                case 2:
                    firstOccurance(head, b, 0);
                    break;
                case 3:
                    lastOccurance(head, b);
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
