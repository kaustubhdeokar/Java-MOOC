/**
 * Two shoppers adding items to a shared notepad
 */

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;
//synchronised should be preferred.
//
class Shopper extends Thread {

    static int garlicCount = 0;
    static AtomicInteger garlicCount1 = new AtomicInteger(0);
    static Lock pencil = new ReentrantLock();

    //we can use the synchronized method.
    public static synchronized void addCount() {
        garlicCount++;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            pencil.lock();
            //we can also use an atomic integer.
            garlicCount++;
            garlicCount1.incrementAndGet();
            pencil.unlock();
        }
    }
}

public class MutualExclusionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper.garlicCount + " garlic.");
    }
}