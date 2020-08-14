package s15;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task1 {
    public static void main(String[] args) {

        BlockingQueue<Message> sharedQueue = new LinkedBlockingQueue<>(10);

        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread1 = new Thread(new Consumer(sharedQueue));
        Thread consThread2 = new Thread(new Consumer(sharedQueue));
        Thread consThread3 = new Thread(new Consumer(sharedQueue));

        prodThread.start();
        consThread1.start();
        consThread2.start();
        consThread3.start();

        try {
            Thread.sleep(60000);
            prodThread.interrupt();
            consThread1.interrupt();
            consThread2.interrupt();
            consThread3.interrupt();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        }
    }

}

class Message {
    private String name;

    public Message() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
