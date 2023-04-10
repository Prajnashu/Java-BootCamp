package week3.ThreadsPractice.q3;

import static week3.ThreadsPractice.ThreadColor.ANSI_GREEN;
import static week3.ThreadsPractice.ThreadColor.ANSI_RESET;

public class Main {
    public static void main(String[] args)  {
        System.out.println(ANSI_GREEN + "Hello From main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another thread");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_RESET + "Hello from anonymous class thread");
            }
        }.start();

        //anotherThread.interrupt();

        //The order might be different
        //we can never assume that threads will run in a particular order.
        System.out.println(ANSI_GREEN + "Hello again from main thread");
    }

    //Most of the times thread is created via Runnable implementation bcz it's flexible & convenient and there are many methods in the java api that want a runnable instance passed to them.
}
