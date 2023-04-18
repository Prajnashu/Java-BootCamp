package week3.ThreadsPractice.q11;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyShutdownNow {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // submit tasks to the executor

        List<Runnable> unfinishedTasks = executor.shutdownNow();

        if (unfinishedTasks.isEmpty()) {
            System.out.println("All tasks were completed successfully.");
        } else {
            System.out.println("The following tasks were not completed:");
            for (Runnable task : unfinishedTasks) {
                System.out.println(task.toString());
            }
        }

    }
}
