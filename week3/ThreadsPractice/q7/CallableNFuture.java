package week3.ThreadsPractice.q7;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableNFuture {
    public static void main(String[] args) throws Exception {
        
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Define a Callable task that will return a result of type Integer
        Callable<Integer> callableTask = () -> {
            System.out.println("Starting Callable task...");
            Thread.sleep(5000); 
            System.out.println("Callable task complete!");
            return new Random().nextInt(100);
        };

        // Submit the Callable task to the ExecutorService, which will return a Future object
        //overriden methods of submit()
        Future<Integer> future = executorService.submit(callableTask);

        // Wait for the result of the Callable task
        System.out.println("Waiting for result...");
        Integer result = future.get(); // This call blocks until the task is complete
        System.out.println("Result: " + result);

        // Shut down the ExecutorService
        executorService.shutdown();
    }
}
