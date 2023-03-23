import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {8, 29, -1, 34, 32, 5, 67, 54, 32};
        System.out.println("The Original array is: ");
        for(int p : arr) {
            System.out.print(p + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int p : arr) {
            System.out.print(p + " ");
        }
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n1. Kth Largest\n2. Kth Smallest\nEnter your choice");
            int choice = sc.nextInt();
            if(choice != 1 && choice != 2) {
                System.out.println("You have entered incorrect choice.");
            }
            else {
                System.out.println("Enter the value of k");
                int k = sc.nextInt();
                if(k > arr.length) {
                    System.out.println("You have entered invalid value for K");
                }
                else if(choice == 1) {
                    System.out.println("The kth Largest element is " + arr[arr.length-k]);
                }
                else if(choice == 2) {
                    System.out.println("THe kth smallest element is " + arr[k-1]);
                }
        }
        }
        

    }
}
