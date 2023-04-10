package week3.ThreadsPractice.q1;

import static week3.ThreadsPractice.ThreadColor.ANSI_PURPLE;


public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Hello from MyRunnable implementation");
    }

    // @Override
    // Runnable run = () -> {System.out.println(ANSI_PURPLE + "Hello from MyRunnable implementation.");}
    
}
