package s15;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Message> sharedQueue;


    public Producer(BlockingQueue<Message> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }


    @Override
    public void run() {

        try {
            while (!Thread.currentThread().isInterrupted()) {
                Scanner s = new Scanner(System.in);
                Message msg = new Message();
                System.out.println("Write your name, please!");
                msg.setName(s.nextLine());
                if (msg.getName() == null || msg.getName().isEmpty()) {
                    break;
                }
                sharedQueue.put(msg);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer STOPPED!");

        }

        System.out.println("Thank you! We're done.");
    }

}