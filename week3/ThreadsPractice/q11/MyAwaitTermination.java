package week3.ThreadsPractice.q11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyAwaitTermination {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

// submit tasks to the executor

executor.shutdown();
boolean tasksCompleted;
try {
    tasksCompleted = executor.awaitTermination(60, TimeUnit.SECONDS);
    if (tasksCompleted) {
        System.out.println("All tasks completed successfully.");
    } else {
        System.out.println("Some tasks were not completed before the timeout.");
    }
    
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }
}
