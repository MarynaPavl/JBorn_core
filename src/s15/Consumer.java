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
            while (!Thread.currentThread().isInterrupted()) {
                msg = sharedQueue.poll(60, TimeUnit.SECONDS);
                if ((msg != null ? msg.getName() : null) == null) {
                    break;
                }
                System.out.println(threadId + ": HELLO " + msg.getName().toUpperCase() + "!");

            }

        } catch (InterruptedException e) {
            System.out.println(threadId + " STOPPED!");

        }
    }
}
