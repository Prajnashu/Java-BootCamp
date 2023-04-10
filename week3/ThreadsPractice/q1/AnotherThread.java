package week3.ThreadsPractice.q1;

import static week3.ThreadsPractice.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread.");
    }
    
}
