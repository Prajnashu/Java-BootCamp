package week3.ThreadsPractice.q4;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello From main thread.");


        Thread thread1 = new Thread(new MyRunnable());
        thread1.setName("thread 1");
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("thread 2");
        Thread thread3 = new Thread(new MyRunnable());
        thread3.setName("thread 3");

        System.out.println("Diffult priorities:");

        System.out.println("Thread 1 priority: " + thread1.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());
        System.out.println("Thread 3 priority: " + thread3.getPriority());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        System.out.println();

        thread1.setPriority(6);
        thread2.setPriority(3);
        thread3.setPriority(8);
        Thread.currentThread().setPriority(9);
        System.out.println("Modified priorities");
        System.out.println("Thread 1 priority: " + thread1.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());
        System.out.println("Thread 3 priority: " + thread3.getPriority());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        thread1.start();
        thread2.start();
        thread3.start();
        
        System.out.println("Hello again from main thread");
    }

    //Most of the times thread is created via Runnable implementation bcz it's flexible & convenient and there are many methods in the java api that want a runnable instance passed to them.
}
