package week3.ThreadsPractice.q6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
    
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while(empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        empty = false;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
            "Implement runnable",
            "Extend Thread",
            "Interrupt thread",
            "Give priority"
        };

        Random rand = new Random();
        for(String m: messages) {
            message.write(m);
            System.out.println("Writer writes: " + m);
            try {
                Thread.sleep(rand.nextInt(2000));
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println("Reader reads: " + latestMessage);
            try {
                Thread.sleep(rand.nextInt(2000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}