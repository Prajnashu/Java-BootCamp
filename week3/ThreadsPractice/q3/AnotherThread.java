package week3.ThreadsPractice.q3;

import static week3.ThreadsPractice.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another Thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+ "Three seconds passed & I'm awake");
    }
    
    //The thread will terminate when we interrupt it. 2 ways thread will know they have been interrupted: 
    //1. catch the interrupdated exception
    //2. It calls interrupted method periodically to check if it has been interrupted.
}
