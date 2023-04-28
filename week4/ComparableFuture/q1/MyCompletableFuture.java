package week4.ComparableFuture.q1;

import java.util.concurrent.CompletableFuture;


//Write a program to run a simple asynchronous stage using CompletableFuture.
public class MyCompletableFuture {

    public static void main(String[] args) {

        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> {
            // This task will run asynchronously
            System.out.println("Running task asynchronously...");
                double result = 0;

                for(int i=0; i< 10000; i++) {
                    result += Math.sqrt(i);
                }

                // try {
                //     TimeUnit.SECONDS.sleep(1); // Sleep for one second to simulate a longer-running task
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                
            return result;
        });

        System.out.println("Task submitted. Waiting for result...");

        future.thenAccept(result -> {
            // This code block will be executed when the asynchronous task completes
            System.out.println("Task completed with result: " + result);
        });

        // future.whenComplete((result, exception) -> {
        //     if (exception != null) {
        //         System.out.println("Task completed exceptionally with exception: " + exception.getMessage());
        //     } else {
        //         System.out.println("Task completed with result: " + result);
        //     }
        // });

        // This code block will be executed immediately without waiting for the task to complete
        System.out.println("Program execution continues while the task runs asynchronously...");

        // Wait for the asynchronous task to complete before exiting the program
        future.join();
    }
}
