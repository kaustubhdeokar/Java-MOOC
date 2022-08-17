
class VegetableThread extends Thread {

    public VegetableThread(String name) {
        this.setName(name);
    }

    public void run() {
        System.out.println("Vegetable thread starting.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getName() + ": vegetable thread done executing.");
    }
}

public class SchedulingDemo {

    public static void main(String args[]) throws InterruptedException {
        VegetableThread barron = new VegetableThread("Barron");
        barron.start();                    // Barron start chopping

        Thread thread = new Thread(() -> System.out.println("inside run."));
        System.out.println("main thread.");
        thread.start();
        Thread.sleep(500);
        System.out.println("main thread done sleeping.");
        System.out.println("main thread" + Thread.currentThread().getState());
        System.out.println("barron state" + barron.getState());
        barron.join(); // join call on that thread means to wait until that thread finishes termination.
        System.out.println("After barron join->");
        System.out.println("\tmain thread state:" + Thread.currentThread().getState());
        System.out.println("\tbarron state:" + barron.getState());
    }

}
