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
            for (int i = 0; i < 5; i++) {
                Scanner s = new Scanner(System.in);
                Message msg = new Message();
                System.out.println("Write your name, please!");
                msg.setName(s.nextLine());
                sharedQueue.put(msg);
                Thread.sleep(1000);
            }

            System.out.println("Thank you! We're done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
