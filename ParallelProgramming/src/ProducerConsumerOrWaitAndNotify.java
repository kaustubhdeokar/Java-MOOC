public class ProducerConsumerOrWaitAndNotify {
    private int data;
    private boolean isProduced = false;

    public synchronized void set(int value) {
        if (isProduced) {
            try {
                wait(); // if already produced -> wait to consume.
            } catch (InterruptedException e) {

            }
        }
        System.out.println("set:" + data);
        data = value;
        isProduced = true;
        notify(); //notify the getter thread to get it while the current thread will wait.
    }

    public synchronized void get() {
        if (!isProduced) {
            try {
                wait(); // if it is not produced wait for resource to be set.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("got:" + data);
        isProduced = false;
        notify(); // notify the other thread that resource has been consumed , go ahead and set a value.
    }


    class Setter extends Thread {
        private final ProducerConsumerOrWaitAndNotify sharedResource;

        public Setter(ProducerConsumerOrWaitAndNotify sharedResource) {
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                sharedResource.set(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class Consumer extends Thread {
        private final ProducerConsumerOrWaitAndNotify sharedResource;

        public Consumer(ProducerConsumerOrWaitAndNotify sharedResource) {
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                sharedResource.get();
            }
        }

    }


    public static void main(String[] args) {
        ProducerConsumerOrWaitAndNotify sharedResource = new ProducerConsumerOrWaitAndNotify();

        sharedResource.perform();

    }

    private void perform() {
        Setter producer = new Setter(this);
        Consumer consumer = new Consumer(this);
        producer.start();
        consumer.start();
    }
}

