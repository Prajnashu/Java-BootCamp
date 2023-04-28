package week4.ForkJoin.q3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {
    private final long start;
    private final long end;
    private final long threshold;

    public MyRecursiveTask(long start, long end, long threshold) {
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Long compute() {
        long length = end - start;

        if (length <= threshold) {
            return sumSequentially();
        }

        MyRecursiveTask leftTask = new MyRecursiveTask(start, start + length / 2, threshold);
        MyRecursiveTask rightTask = new MyRecursiveTask(start + length / 2, end, threshold);

        leftTask.fork();
        long rightResult = rightTask.compute();
        long leftResult = leftTask.join();

        return leftResult + rightResult;
    }

    private long sumSequentially() {
        long sum = 0;
        for (long i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = 1;
        long end = 10000000;
        long threshold = 1000;

        MyRecursiveTask sumTask = new MyRecursiveTask(start, end, threshold);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        long result = pool.invoke(sumTask);
        System.out.println("Sum of numbers from " + start + " to " + end + " is " + result);
    }
}

