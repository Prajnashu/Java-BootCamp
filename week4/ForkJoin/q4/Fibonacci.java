package week4.ForkJoin.q4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLongArray;

public class Fibonacci extends RecursiveAction {
    private final int n;
    private final AtomicLongArray array;

    public Fibonacci(int n, AtomicLongArray array) {
        this.n = n;
        this.array = array;
    }

    @Override
    protected void compute() {
        if (n <= 1) {
            array.set(n, n);
            return;
        }

        Fibonacci left = new Fibonacci(n - 1, array);
        Fibonacci right = new Fibonacci(n - 2, array);

        left.fork();
        right.compute();
        left.join();

        long result = array.get(n - 1) + array.get(n - 2);
        array.set(n, result);
    }

    public static void main(String[] args) {
        int n = 10;
        AtomicLongArray array = new AtomicLongArray(n + 1);
        array.set(0, 0);
        array.set(1, 1);

        Fibonacci task = new Fibonacci(n, array);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.invoke(task);

        long result = array.get(n);
        System.out.println("The " + n + "th Fibonacci number is " + result);
    }
}

