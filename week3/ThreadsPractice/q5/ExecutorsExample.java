package week3.ThreadsPractice.q5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
    public static void main(String[] args) {
        
        // Single Thread Executor
        //creates a single worker thread to process tasks sequentially.
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                System.out.println("Executing task in singleThreadExecutor");
            }
        });
        singleThreadExecutor.shutdown();
        //awaitTermination, shutdownNow
        
        // Cached Thread Pool Executor
        //The worker threads created here are reused as needed.
        ExecutorService cachedThreadPoolExecutor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5000; i++) {
            cachedThreadPoolExecutor.execute(new Runnable() {
                public void run() {
                    System.out.println("Executing task in cachedThreadPoolExecutor");
                }
            });
        }
        cachedThreadPoolExecutor.shutdown();
        
        // Fixed Thread Pool Executor
        //Creates fixed-size pool of worker threads
        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5000; i++) {
            fixedThreadPoolExecutor.execute(new Runnable() {
                public void run() {
                    System.out.println("Executing task in fixedThreadPoolExecutor");
                }
            });
        }
        fixedThreadPoolExecutor.shutdown();
        
        // Scheduled Thread Pool Executor
        //Here tasks are submitted through schedule method which specifies a delay before the task is executed.
        ScheduledExecutorService scheduledThreadPoolExecutor = Executors.newScheduledThreadPool(1);
        scheduledThreadPoolExecutor.schedule(new Runnable() {
            public void run() {
                System.out.println("Executing task in scheduledThreadPoolExecutor");
            }
        }, 5, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.shutdown();
    }
}

