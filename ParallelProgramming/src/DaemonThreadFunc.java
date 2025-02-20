

public class DaemonThreadFunc {

    /**
     * Daemon thread does not wait for run to be complete.
     */
    public void daemonThreadFunctioning() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i + " ");
                }

            }
        };

        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------------------------------End----------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        DaemonThreadFunc daemonThreadFunc = new DaemonThreadFunc();
        daemonThreadFunc.daemonThreadFunctioning();

    }


}
