package week3.ThreadsPractice.q9;

import java.util.concurrent.Semaphore;

import week3.ThreadsPractice.ThreadColor;

class PCSemaphore {
    //Binary semaphore for locking, only one thread can acquire it at a time, ensures mutual exclusion
    private static Semaphore mutex = new Semaphore(1);
    //Represents the number of available slots in the buffer where producer can write
    private static Semaphore empty = new Semaphore(5);
    //Represents number of items in the buffer ready for consumer to consume.
    private static Semaphore full = new Semaphore(0);
    private static int[] buffer = new int[5];
    private static int in = 0;
    private static int out = 0;

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());
        producer.start();
        consumer.start();
    }

    static class Producer implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    empty.acquire();
                    mutex.acquire();
                    buffer[in] = i;
                    in = (in + 1) % buffer.length;
                    System.out.println(ThreadColor.ANSI_CYAN + "Produced: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutex.release();
                    full.release();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    full.acquire();
                    mutex.acquire();
                    int data = buffer[out];
                    out = (out + 1) % buffer.length;
                    System.out.println(ThreadColor.ANSI_PURPLE+ "Consumed: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutex.release();
                    empty.release();
                }
            }
        }
    }
}

