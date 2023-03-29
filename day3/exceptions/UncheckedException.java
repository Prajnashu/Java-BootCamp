package day3.exceptions;

import java.util.Random;

public class UncheckedException {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 20;
        while(n>0) {
            int trial = rand.nextInt(1000);
            System.out.println(trial);
            if(trial % 7 == 0) {
                String str = null;
                try {
                    int length = str.length(); // This will throw a NullPointerException
                  } catch (NullPointerException e) {
                    System.out.println("Null pointer exception: " + e.getMessage());
                  }
            }
            n--;
        }
    }
    
}
