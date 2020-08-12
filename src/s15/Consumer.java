package s15;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private final BlockingQueue<Message> sharedQueue;

    public Consumer(BlockingQueue<Message> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        String threadId = Thread.currentThread().getName();
        try {
            Message msg;
            while (true) {
                msg = sharedQueue.poll(60, TimeUnit.SECONDS);
                if ((msg != null ? msg.getName() : null) == null) {
                    break;
                }
                System.out.println(threadId + ": HELLO " + msg.getName().toUpperCase() + "!");

            }
            System.out.println(threadId + " STOPPED!");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
