package week4.ComparableFuture.q2;

import java.util.concurrent.CompletableFuture;

//Run a task asynchronously and return the result ?
public class RunTaskAsynchronously {
    public static void main(String[] args) throws Exception {
        // Run a task asynchronously and return the result
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            
            System.out.println("Running task asynchronously...");
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result += i;
            }
            return result;
        });

        int result = future.get();

        System.out.println("Task completed with result: " + result);
    }
}

