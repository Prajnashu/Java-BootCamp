package week3.ThreadsPractice.q1;

import static week3.ThreadsPractice.ThreadColor.ANSI_GREEN;
import static week3.ThreadsPractice.ThreadColor.ANSI_RESET;


//Different ways of creating a thread.
public class Main {
    //Always illegal to start a thread more than once.
    public static void main(String[] args)  {
        System.out.println(ANSI_GREEN + "Hello From main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_RESET + "Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        //The order might be different
        //we can never assume that threads will run in a particular order.
        System.out.println(ANSI_GREEN + "Hello again from main thread");
    }

    //Most of the times thread is created via Runnable implementation bcz it's flexible & convenient and there are many methods in the java api that want a runnable instance passed to them.
}
